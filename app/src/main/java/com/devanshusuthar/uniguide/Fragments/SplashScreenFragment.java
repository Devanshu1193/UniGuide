package com.devanshusuthar.uniguide.Fragments;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.preference.PreferenceManager;

import com.devanshusuthar.uniguide.R;

public class SplashScreenFragment extends Fragment {

    VideoView videoView;
    Button getStartedButton;
    ImageView messageImage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_splash_screen, container, false);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        // Intro Screen
        getActivity().requestWindowFeature(1);
        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getActivity().getWindow().setStatusBarColor(Color.TRANSPARENT);


        // Button for next Activity
        getStartedButton = view.findViewById(R.id.getStartedButton);
        videoView = view.findViewById(R.id.introVideo);
        messageImage = view.findViewById(R.id.messageImage);

        String introPath = "android.resource://com.devanshusuthar.uniguide/" + R.raw.intro;
        // introPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.intro; <- also can be used

        Uri uri = Uri.parse(introPath);
        videoView.setVideoURI(uri);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.start();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    mediaPlayer.setPlaybackParams(new PlaybackParams().setSpeed(0.5f));
                }
                messageImage.setVisibility(View.GONE);

            }
        });

        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isSetup = preferences.getInt("completed_setup", 0) == 1;

                if (isSetup) {
                    Navigation.findNavController(view).navigate(R.id.action_nav_splash_screen_to_nav_main_menu);
                } else {
                    Navigation.findNavController(view).navigate(R.id.action_nav_splash_screen_to_nav_login);
                }
            }
        });

        return view;
    }
}