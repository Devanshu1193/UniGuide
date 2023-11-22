package com.devanshusuthar.uniguide;

import android.content.Intent;
import android.net.Uri;

import java.util.Arrays;
import java.util.List;

public class Accommodations {

    private static Intent call(String number) {
        return new Intent(Intent.ACTION_DIAL, Uri.parse(
                "tel:" + number
        ));
    }

    public static final List<Accommodation> WINDSOR_ACCOMMODATIONS = Arrays.asList(
        new Accommodation(R.drawable.basic, "Test 1", "2", "a", call("5190000000")),
        new Accommodation(R.drawable.basic, "Test 2", "2", "a", new Intent(
                Intent.ACTION_DIAL,
                Uri.parse("tel:5190000001")
        ))
    );

}
