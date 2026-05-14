package com.example.beautyproductsappusingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<Product> productList;

    ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =
                findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(this));

        productList = new ArrayList<>();

        productList.add(
                new Product(
                        R.drawable.lipstick,
                        "Lipstick",
                        "₹499"));

        productList.add(
                new Product(
                        R.drawable.lipstick,
                        "Perfume",
                        "₹999"));

        productList.add(
                new Product(
                        R.drawable.lipstick,
                        "Shampoo",
                        "₹299"));

        productList.add(
                new Product(
                        R.drawable.lipstick,
                        "Face Wash",
                        "₹199"));
        productList.add(
                new Product(
                        R.drawable.lipstick,
                        "Sushant testing",
                        "₹499"));
        productList.add(
                new Product(
                        R.drawable.lipstick,
                        "Lipstick",
                        "₹499"));

        productList.add(
                new Product(
                        R.drawable.lipstick,
                        "Perfume",
                        "₹999"));

        productList.add(
                new Product(
                        R.drawable.lipstick,
                        "Shampoo",
                        "₹299"));

        productList.add(
                new Product(
                        R.drawable.lipstick,
                        "Face Wash",
                        "₹199"));
        productList.add(
                new Product(
                        R.drawable.lipstick,
                        "Sushant testing",
                        "₹499"));



        adapter = new ProductAdapter(productList);

        recyclerView.setAdapter(adapter);
    }
}