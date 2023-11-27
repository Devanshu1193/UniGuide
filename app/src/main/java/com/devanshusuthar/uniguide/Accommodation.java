package com.devanshusuthar.uniguide;

import android.content.Intent;
import android.widget.Button;

import java.io.StringReader;

public class Accommodation {
    private int drawable;
    private String title;
    private String price;
    private String description;
    private Intent callIntent;
    private Intent messageIntent;
    private Intent locationIntent;


//    Button callButton = new Button();
//    Button locationButton = new Button();
//    Button messageButton = new Button();



    public Accommodation(int drawable, String title, String price, String description, Intent callIntent, Intent messageIntent, Intent locationIntent) {
        this.drawable = drawable;
        this.title = title;
        this.price = price;
        this.description = description;
        this.callIntent = callIntent;
        this.messageIntent = messageIntent;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Intent getCallIntent() {
        return callIntent;
    }

    public void setCallIntent(Intent callIntent) {
        this.callIntent = callIntent;
    }
    public Intent getMessageIntent() {
        return messageIntent;
    }

    public void setMessageIntent(Intent messageIntent) {
        this.messageIntent = messageIntent;
    }

    public Intent getLocationIntent() {
        return locationIntent;
    }

    public void setLocationIntent(Intent locationIntent) {
        this.locationIntent = locationIntent;
    }

}
