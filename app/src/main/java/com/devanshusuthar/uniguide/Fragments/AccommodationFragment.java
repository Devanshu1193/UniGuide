package com.devanshusuthar.uniguide.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devanshusuthar.uniguide.R;

public class AccommodationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_accomodation, container, false);

        Bundle bundle = getArguments();
        if (bundle == null) return view;

        String city = bundle.getString("CITY");

        switch (city) {
            case "Windsor":
//                someText.text = "";
                break;
        }

        return view;
    }

}