package com.example.sppuadmissionapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    // Load Menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(
                R.menu.main_menu,
                menu
        );

        return true;
    }

    // Menu Click Handling

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // About

        if (item.getItemId() == R.id.menuAbout) {

            AlertDialog.Builder builder =
                    new AlertDialog.Builder(this);

            builder.setTitle("About");
            builder.setMessage(
                    "SPPU Admission App\nDeveloped for Students"
            );

            builder.setPositiveButton(
                    "OK",
                    (dialog, which) -> dialog.dismiss()
            );

            builder.show();
        }

        // Courses

        else if (item.getItemId() == R.id.menuCourses) {

            AlertDialog.Builder builder =
                    new AlertDialog.Builder(this);

            builder.setTitle("Courses");

            builder.setMessage(
                    "ENTC\nCSE\nMechanical\nCivil"
            );

            builder.setPositiveButton(
                    "OK",
                    (dialog, which) -> dialog.dismiss()
            );

            builder.show();
        }

        // Exit

        else if (item.getItemId() == R.id.menuExit) {

            finish();
        }

        return true;
    }
}
