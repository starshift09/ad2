package com.example.beautyproductsappusingrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends
        RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    ArrayList<Product> productList;

    public ProductAdapter(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public static class ViewHolder
            extends RecyclerView.ViewHolder {

        ImageView imgProduct;
        TextView tvName, tvPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProduct =
                    itemView.findViewById(R.id.imgProduct);

            tvName =
                    itemView.findViewById(R.id.tvName);

            tvPrice =
                    itemView.findViewById(R.id.tvPrice);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType) {

        View view = LayoutInflater.from(
                        parent.getContext())
                .inflate(
                        R.layout.product_item,
                        parent,
                        false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull ViewHolder holder,
            int position) {

        Product product =
                productList.get(position);

        holder.imgProduct.setImageResource(
                product.getImage());

        holder.tvName.setText(
                product.getName());

        holder.tvPrice.setText(
                product.getPrice());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}