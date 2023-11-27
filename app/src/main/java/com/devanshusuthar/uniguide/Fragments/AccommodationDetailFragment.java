package com.devanshusuthar.uniguide.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.devanshusuthar.uniguide.R;

public class AccommodationDetailFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_accommodation_detail, container, false);

        Bundle bundle = getArguments();
        if (bundle == null) return view;

        String title = bundle.getString("TITLE");
        String price = bundle.getString("PRICE");
        String description = bundle.getString("DESCRIPTION");
        int image = bundle.getInt("IMAGE");

        Intent callIntent = bundle.getParcelable("CALL_INTENT");
        Intent messageIntent = bundle.getParcelable("MESSAGE_INTENT");
        Intent locationIntent = bundle.getParcelable("LOCATION_INTENT");


        TextView titleView = view.findViewById(R.id.accom_detail_title);
        ImageView imageView = view.findViewById(R.id.accom_detail_image);
        TextView priceView = view.findViewById(R.id.accom_detail_price);
        TextView descriptionView = view.findViewById(R.id.accom_detail_desc);

        titleView.setText(title);
        imageView.setImageResource(image);
        priceView.setText(price);
        descriptionView.setText(description);

        view.findViewById(R.id.accom_detail_call_button).setOnClickListener((v) -> {
            startActivity(callIntent);
        });

        view.findViewById(R.id.accom_detail_message_button).setOnClickListener((v)-> {
            startActivity(messageIntent);
        });

        view.findViewById(R.id.accom_detail_location_button).setOnClickListener((v)-> {
            startActivity(locationIntent);
        });

        return view;
    }
}