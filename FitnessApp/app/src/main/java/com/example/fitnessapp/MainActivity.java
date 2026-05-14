package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnYoga, btnGym, btnDiet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnYoga = findViewById(R.id.btnYoga);
        btnGym = findViewById(R.id.btnGym);
        btnDiet = findViewById(R.id.btnDiet);

        // Yoga Activity

        btnYoga.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity.this,
                            YogaActivity.class);

            startActivity(intent);
        });

        // Gym Activity

        btnGym.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity.this,
                            GymActivity.class);

            startActivity(intent);
        });

        // Diet Activity

        btnDiet.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity.this,
                            DietActivity.class);

            startActivity(intent);
        });
    }
}