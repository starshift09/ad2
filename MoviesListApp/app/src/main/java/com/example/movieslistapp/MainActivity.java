package com.example.movieslistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<Movie> movieList;

    MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =
                findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(this));

        movieList = new ArrayList<>();

        movieList.add(
                new Movie(
                        R.drawable.avengers,
                        "Avengers",
                        "⭐ 9.2"));

        movieList.add(
                new Movie(
                        R.drawable.avengers,
                        "Interstellar",
                        "⭐ 9.5"));

        movieList.add(
                new Movie(
                        R.drawable.avengers,
                        "Pushpa",
                        "⭐ 8.8"));

        movieList.add(
                new Movie(
                        R.drawable.avengers,
                        "KGF",
                        "⭐ 9.0"));

        adapter = new MovieAdapter(movieList);

        recyclerView.setAdapter(adapter);
    }
}