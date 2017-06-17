package com.example.eleazer.desafiomobfiq;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.eleazer.desafiomobfiq.adapter.ProductAdapter;
import com.example.eleazer.desafiomobfiq.app.AppApplication;
import com.example.eleazer.desafiomobfiq.callback.CarregaProdutosCallback;
import com.example.eleazer.desafiomobfiq.callback.OuvirCategoryCallback;
import com.example.eleazer.desafiomobfiq.component.AppComponent;
import com.example.eleazer.desafiomobfiq.event.CategoryEvent;
import com.example.eleazer.desafiomobfiq.event.FailureEvent;
import com.example.eleazer.desafiomobfiq.event.ProductEvent;
import com.example.eleazer.desafiomobfiq.modelos.Categories;
import com.example.eleazer.desafiomobfiq.modelos.Category;
import com.example.eleazer.desafiomobfiq.modelos.JsonRootBean;
import com.example.eleazer.desafiomobfiq.modelos.Products;
import com.example.eleazer.desafiomobfiq.modelos.Query;
import com.example.eleazer.desafiomobfiq.service.AppService;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Inject
    public AppService appService;

    private AppComponent component;

    @BindView(R.id.recycler_view)
    public RecyclerView recyclerView;

    @Inject
    EventBus eventBus;

    private Categories categories;
    private JsonRootBean products;

    private NavigationView navigationView;
    private ProductAdapter adapter;

    private int offset = 0;
    private int size = 10;
    private String query;
    private List<Products> listProduct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        injectAll();

        ButterKnife.bind(this);

        eventBus.register(this);
        ouvirCategory(new CategoryEvent());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

    }

    private void navigationViewMenu() {

        if (navigationView == null) {

            navigationView = (NavigationView) findViewById(R.id.nav_view);

            if (categories != null && categories.getCategories() != null && categories.getCategories().size() > 0) {
                List<Category> categoriList = categories.getCategories();

                final Menu menu = navigationView.getMenu();
                for (Category category : categoriList) {
                    menu.add(category.getName());
                }
            }
            navigationView.setNavigationItemSelectedListener(this);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        eventBus.unregister(this);
    }

    @Subscribe
    public void carregaMenu(CategoryEvent categoryEvent) {

        if (categories == null) {
            categories = categoryEvent.category;
        }
        navigationViewMenu();
        //Toast.makeText(this,"Carregado", Toast.LENGTH_SHORT).show();
    }

    @Subscribe
    public void carregaProduto(ProductEvent productEvent) {

        if (productEvent.products != null && productEvent.products.getSize() > 0){
            products = productEvent.products;

            if (listProduct != null && listProduct.size() > 0) {

                listProduct.addAll(products.getProducts());
            } else {
                listProduct = products.getProducts();
            }
            adapter = new ProductAdapter(this, listProduct){
                @Override
                public void load() {
                    //implement your load more here
                    offset = size+ 1;
                    size = size + 11;
                    pesquisaProdutos();
                }
            };

            RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(adapter);
        }
    }

    @Subscribe
    public void ouvirCategory(CategoryEvent mensagemEvent) {
        Call<Categories> call = appService.ouvirCategrias();
        call.enqueue(new OuvirCategoryCallback(eventBus, this));
    }

    @Subscribe
    public void pesquisaProdutos() {
        Call<JsonRootBean> call = appService.enviar(new Query(query, offset, size));
        call.enqueue(new CarregaProdutosCallback(eventBus));
    }

    private void injectAll() {
        AppApplication app = (AppApplication) getApplication();
        component = app.getComponent();
        component.inject(this);
    }

    @Subscribe
    public void lidarCom(FailureEvent event) {
        ouvirCategory(null);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        String nameMenu = (String) item.getTitle();
        if (categories != null && categories.getCategories() != null && categories.getCategories().size() > 0) {

            List<Category> categoriList = categories.getCategories();

            for (Category category : categoriList) {
                if (category.getName().equalsIgnoreCase(nameMenu)){
                    size = 10;
                    offset = 0;
                    query = category.getName();
                    listProduct = new ArrayList<>();
                    pesquisaProdutos();
                }
            }
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}