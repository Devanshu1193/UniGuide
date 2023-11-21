package com.devanshusuthar.uniguide.Viewpager;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.devanshusuthar.uniguide.Accommodations;

import java.util.ArrayList;

public class CustomAccommodationAdapter extends RecyclerView.Adapter<CustomAccommodationAdapter.CustomViewHolder> {
    ArrayList<Accommodations> accommodations;

    public CustomAccommodationAdapter(ArrayList<Accommodations> accommodations) {this.accommodations = accommodations;}

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return accommodations.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
