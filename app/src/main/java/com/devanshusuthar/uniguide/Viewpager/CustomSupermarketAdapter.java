package com.devanshusuthar.uniguide.Viewpager;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.devanshusuthar.uniguide.Accommodation;
import com.devanshusuthar.uniguide.R;
import com.devanshusuthar.uniguide.Supermarket;
import com.devanshusuthar.uniguide.Supermarkets;

import java.util.List;

public class CustomSupermarketAdapter extends ArrayAdapter<Supermarket> {

    public CustomSupermarketAdapter(@NonNull Context context, @NonNull List<Supermarket> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Supermarket items = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.supermarket_listview, parent, false);

        }


        ImageView supermarket_image = convertView.findViewById(R.id.supermarket_listView_image);
        TextView supermarket_title = convertView.findViewById(R.id.supermarket_listView_title);
        TextView supermarket_address = convertView.findViewById(R.id.supermarket_listView_address);
        TextView supermarket_time = convertView.findViewById(R.id.supermarket_listView_time);
        RatingBar supermarket_ratings = convertView.findViewById(R.id.supermarket_listView_ratingBar);
        View supermarket_call_button = convertView.findViewById(R.id.supermarket_listView_callButton);
        View supermarket_location_button = convertView.findViewById(R.id.supermarket_listView_locationButton);

        // Show Ratings
        supermarket_title.setText(items.getTitle());
        supermarket_address.setText(items.getAddress());
        supermarket_image.setImageResource(items.getDrawable());
        supermarket_time.setText(items.getTime());
        supermarket_call_button.setOnClickListener(view -> {
            getContext().startActivity(items.getCallIntent());
        });
        supermarket_location_button.setOnClickListener(view -> {
            getContext().startActivity(items.getLocationIntent());
        });

        supermarket_ratings.setRating((float) items.getRating());

        return convertView;
    }
}
