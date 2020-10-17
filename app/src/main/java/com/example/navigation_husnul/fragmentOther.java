package com.example.navigation_husnul;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class fragmentOther extends Fragment {

    private TextView txtNama;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_other, container, false);
        txtNama = view.findViewById(R.id.txtNama);
        assert getArguments() != null;
        txtNama.setText(getArguments().getString("nama"));
        return view;
    }
}