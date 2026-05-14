package com.example.collegeadmissionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAdmission, btnCourses,
            btnFees, btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdmission = findViewById(R.id.btnAdmission);
        btnCourses = findViewById(R.id.btnCourses);
        btnFees = findViewById(R.id.btnFees);
        btnContact = findViewById(R.id.btnContact);

        btnAdmission.setOnClickListener(v ->
                Toast.makeText(this,
                        "Admission Clicked",
                        Toast.LENGTH_SHORT).show());

        btnCourses.setOnClickListener(v ->
                Toast.makeText(this,
                        "Courses Clicked",
                        Toast.LENGTH_SHORT).show());

        btnFees.setOnClickListener(v ->
                Toast.makeText(this,
                        "Fees Clicked",
                        Toast.LENGTH_SHORT).show());

        btnContact.setOnClickListener(v ->
                Toast.makeText(this,
                        "Contact Clicked",
                        Toast.LENGTH_SHORT).show());
    }
}