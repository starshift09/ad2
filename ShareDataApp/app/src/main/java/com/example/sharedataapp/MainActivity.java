package com.example.sharedataapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(v -> {

            String name = etName.getText().toString();

            Intent intent =
                    new Intent(MainActivity.this,
                            SecondActivity.class);

            intent.putExtra("name", name);

            startActivity(intent);

        });
    }
}