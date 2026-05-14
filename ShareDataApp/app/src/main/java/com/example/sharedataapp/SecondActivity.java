package com.example.sharedataapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvName;
    EditText etCourse;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvName = findViewById(R.id.tvName);
        etCourse = findViewById(R.id.etCourse);
        btnSubmit = findViewById(R.id.btnSubmit);

        String name =
                getIntent().getStringExtra("name");

        tvName.setText("Welcome " + name);

        btnSubmit.setOnClickListener(v -> {

            String course =
                    etCourse.getText().toString();

            Intent intent =
                    new Intent(SecondActivity.this,
                            ThirdActivity.class);

            intent.putExtra("name", name);
            intent.putExtra("course", course);

            startActivity(intent);

        });
    }
}