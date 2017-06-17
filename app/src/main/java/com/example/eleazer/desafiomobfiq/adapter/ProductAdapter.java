package com.example.eleazer.desafiomobfiq.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eleazer.desafiomobfiq.R;
import com.example.eleazer.desafiomobfiq.modelos.Products;
import com.squareup.picasso.Picasso;

import java.util.List;

public abstract class ProductAdapter  extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    private Context mContext;
    private List<Products> products;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail, overflow;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            overflow = (ImageView) view.findViewById(R.id.overflow);
        }
    }


    public ProductAdapter(Context mContext, List<Products> products) {
        this.mContext = mContext;
        this.products = products;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Products product = this.products.get(position);
        holder.title.setText(product.getName());
        holder.count.setText(product.getBrand());

        if (this.products.size() > 6){
            if ((position >= getItemCount() - 1))
                load();
        }

        // loading album cover using Glide library
        Picasso.with(mContext).load(product.getSkus().get(0).getImages().get(0).getImageurl()).into(holder.thumbnail);

    }

    public abstract void load();

   @Override
    public int getItemCount() {
        return products.size();
    }
}
