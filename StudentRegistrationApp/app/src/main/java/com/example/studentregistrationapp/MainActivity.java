package com.example.studentregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etName;

    RadioGroup radioGroup;
    RadioButton rbMale, rbFemale;

    Spinner spinnerCourse;

    CheckBox cbSports, cbMusic, cbCoding;

    Button btnRegister;

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);

        radioGroup = findViewById(R.id.radioGroup);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);

        spinnerCourse =
                findViewById(R.id.spinnerCourse);

        cbSports = findViewById(R.id.cbSports);
        cbMusic = findViewById(R.id.cbMusic);
        cbCoding = findViewById(R.id.cbCoding);

        btnRegister =
                findViewById(R.id.btnRegister);

        tvResult = findViewById(R.id.tvResult);

        // Spinner Data

        String[] courses = {
                "ENTC",
                "CSE",
                "Mechanical",
                "Civil"
        };

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_item,
                        courses
                );

        adapter.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item
        );

        spinnerCourse.setAdapter(adapter);

        // Button Click

        btnRegister.setOnClickListener(v -> {

            String name =
                    etName.getText().toString();

            // Gender

            String gender = "";

            int selectedId =
                    radioGroup.getCheckedRadioButtonId();

            if (selectedId == R.id.rbMale) {
                gender = "Male";
            }
            else if (selectedId == R.id.rbFemale) {
                gender = "Female";
            }

            // Spinner

            String course =
                    spinnerCourse
                            .getSelectedItem()
                            .toString();

            // Checkboxes

            String hobbies = "";

            if (cbSports.isChecked()) {
                hobbies += "Sports ";
            }

            if (cbMusic.isChecked()) {
                hobbies += "Music ";
            }

            if (cbCoding.isChecked()) {
                hobbies += "Coding ";
            }

            // Final Output

            String result =
                    "Name: " + name +
                            "\nGender: " + gender +
                            "\nCourse: " + course +
                            "\nHobbies: " + hobbies;

            tvResult.setText(result);

        });
    }
}