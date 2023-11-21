package com.devanshusuthar.uniguide;

import android.widget.Button;

import java.io.StringReader;

public class Accommodations {
    private int drawable;
    private String title;
    private String price;
    private String description;

//    Button callButton = new Button();
//    Button locationButton = new Button();
//    Button messageButton = new Button();


    public Accommodations(int drawable, String title, String price, String description) {
        this.drawable = drawable;
        this.title = title;
        this.price = price;
        this.description = description;
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

}
