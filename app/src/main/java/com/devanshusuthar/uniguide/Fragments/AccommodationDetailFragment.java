package com.devanshusuthar.uniguide.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.devanshusuthar.uniguide.R;

public class AccommodationDetailFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_accommodation_detail, container, false);

        Bundle bundle = getArguments();
        if (bundle == null) return view;

        String title = bundle.getString("TITLE");
        Intent callIntent = bundle.getParcelable("CALL_INTENT");

        TextView titleView = view.findViewById(R.id.accom_detail_title);
        titleView.setText(title);

        view.findViewById(R.id.accom_detail_call_button).setOnClickListener((v) -> {
            startActivity(callIntent);
        });

        return view;
    }
}