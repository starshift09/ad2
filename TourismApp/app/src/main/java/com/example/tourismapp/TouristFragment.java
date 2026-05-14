package com.example.tourismapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TouristFragment extends Fragment {

    public TouristFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_tourist,
                container,
                false);

        Button btnNext = view.findViewById(R.id.btnNext);

        btnNext.setOnClickListener(v -> {

            requireActivity()
                    .getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.bottomContainer,
                            new InfoFragment())
                    .commit();

        });

        return view;
    }
}