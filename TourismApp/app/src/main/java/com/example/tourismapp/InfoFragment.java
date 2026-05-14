package com.example.tourismapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class InfoFragment extends Fragment {

    public InfoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_info,
                container,
                false);

        Button btnBack = view.findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> {

            requireActivity()
                    .getSupportFragmentManager()
                    .popBackStack();

        });

        return view;
    }
}