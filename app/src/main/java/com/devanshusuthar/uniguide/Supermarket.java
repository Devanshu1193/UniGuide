package com.devanshusuthar.uniguide;

import android.content.Intent;

public class Supermarket {
    private int drawable;
    private String title;
    private String address;
    private double rating;
    private String time;
    private Intent callIntent;
    private Intent locationIntent;

    public Supermarket(int drawable, String title, String address, double rating, String time, Intent callIntent, Intent locationIntent) {
        this.drawable = drawable;
        this.title = title;
        this.address = address;
        this.rating = rating;
        this.time = time;
        this.callIntent = callIntent;
        this.locationIntent = locationIntent;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Intent getCallIntent() {
        return callIntent;
    }

    public void setCallIntent(Intent callIntent) {
        this.callIntent = callIntent;
    }

    public Intent getLocationIntent() {
        return locationIntent;
    }

    public void setLocationIntent(Intent locationIntent) {
        this.locationIntent = locationIntent;
    }
}
