package com.devanshusuthar.uniguide;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class StringArray extends ArrayAdapter<String> {
    public StringArray(@NonNull Context context, String... strings) {
        super(context,android.R.layout.simple_spinner_item);
        this.addAll(strings);
        this.setDropDownViewResource(android.R.layout.simple_spinner_item);
//        this.setDropDownViewResource(R.layout.c);
    }
}
