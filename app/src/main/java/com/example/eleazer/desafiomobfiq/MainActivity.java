package com.example.eleazer.desafiomobfiq;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import com.example.eleazer.desafiomobfiq.app.AppApplication;
import com.example.eleazer.desafiomobfiq.callback.EnviarCategoryCallback;
import com.example.eleazer.desafiomobfiq.callback.OuvirCategoryCallback;
import com.example.eleazer.desafiomobfiq.component.AppComponent;
import com.example.eleazer.desafiomobfiq.event.CategoryEvent;
import com.example.eleazer.desafiomobfiq.event.FailureEvent;
import com.example.eleazer.desafiomobfiq.modelos.Categories;
import com.example.eleazer.desafiomobfiq.modelos.Category;
import com.example.eleazer.desafiomobfiq.modelos.Query;
import com.example.eleazer.desafiomobfiq.service.AppService;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

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

    @BindView(R.id.text)
    public TextView textView;

    @Inject
    EventBus eventBus;

    private Categories categories;

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

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        if (categories != null && categories.getCategories() != null && categories.getCategories().size() > 0) {
            List<Category> categoriList = categories.getCategories();

            final Menu menu = navigationView.getMenu();
            for (Category category : categoriList) {
                menu.add(category.getName());
            }
        }
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    protected void onStop() {
        super.onStop();

        eventBus.unregister(this);
    }

    @Subscribe
    public void ouvirCategory(CategoryEvent mensagemEvent) {
        Call<Categories> call = appService.ouvirCategrias();
        call.enqueue(new OuvirCategoryCallback(eventBus, this));
    }

    @Subscribe
    public void colocaNaLista(CategoryEvent categoryEvent) {

        if (categories == null) {
            categories = categoryEvent.category;
        }
        navigationViewMenu();
        // categories.add(categoryEvent.category);
        textView.setText(categoryEvent.category.getId() + " ");
        System.out.println();
        /*adapter = new MensagemAdapter(idDoCliente, mensagens, this);
        listaDeMensagens.setAdapter(adapter);

        ouvirMensagem(categoryEvent);*/
    }

    public void carregarProdutos() {
        appService.enviar(new Query("", 0, 1)).enqueue(new EnviarCategoryCallback());
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
                    System.out.println(category.getId());
                }
            }
        }
       /* if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
*/
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
