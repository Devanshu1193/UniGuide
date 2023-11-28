package com.devanshusuthar.uniguide.Fragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.devanshusuthar.uniguide.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}