package com.devanshusuthar.uniguide;

import android.widget.Button;

import java.io.StringReader;

public class Accommodation {
    private int drawable;
    private String title;
    private String price;

//    Button callButton = new Button();
//    Button locationButton = new Button();
//    Button messageButton = new Button();


    public Accommodation(int drawable, String title, String price) {
        this.drawable = drawable;
        this.title = title;
        this.price = price;
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
}
