package com.devanshusuthar.uniguide.Viewpager;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.devanshusuthar.uniguide.Accommodation;
import com.devanshusuthar.uniguide.R;

import java.util.ArrayList;
import java.util.List;

public class CustomAccommodationAdapter extends RecyclerView.Adapter<CustomAccommodationAdapter.CustomViewHolder> {
    private List<Accommodation> accommodations;
    private Context context;

    public CustomAccommodationAdapter(List<Accommodation> accommodations) {
        this.accommodations = accommodations;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.accommodation_menu_list,parent,false);

        this.context = parent.getContext();
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Accommodation accommodation = accommodations.get(position);
        Animation animation1 = AnimationUtils.loadAnimation(context, R.anim.slide_in);
        animation1.setStartOffset(position * 100L);

        holder.title.setText(accommodation.getTitle());
        holder.price.setText(accommodation.getPrice());
        holder.image.setImageResource(accommodation.getDrawable());
        holder.itemView.startAnimation(animation1);

        holder.itemView.setOnClickListener((v) -> {
            Bundle bundle = new Bundle();
            // pass all data into bundle
            bundle.putString("TITLE", accommodation.getTitle());
            bundle.putInt("IMAGE",accommodation.getDrawable());
            bundle.putString("PRICE",accommodation.getPrice());
            bundle.putString("DESCRIPTION", accommodation.getDescription());

            bundle.putParcelable("CALL_INTENT", accommodation.getCallIntent());
            bundle.putParcelable("MESSAGE_INTENT", accommodation.getMessageIntent());
            bundle.putParcelable("LOCATION_INTENT", accommodation.getLocationIntent());


            Navigation.findNavController(holder.itemView).navigate(R.id.nav_accomDetail, bundle);
        });
    }


    @Override
    public int getItemCount() {
        return accommodations.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public ImageView image;
        public TextView price;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.acco_title);
            this.image = itemView.findViewById(R.id.acco_main_image);
            this.price = itemView.findViewById(R.id.acco_price);
        }
    }
}
