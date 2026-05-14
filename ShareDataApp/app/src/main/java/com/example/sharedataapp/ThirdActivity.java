package com.example.sharedataapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvResult = findViewById(R.id.tvResult);

        String name =
                getIntent().getStringExtra("name");

        String course =
                getIntent().getStringExtra("course");

        tvResult.setText(
                "Name: " + name +
                        "\nCourse: " + course
        );
    }
}