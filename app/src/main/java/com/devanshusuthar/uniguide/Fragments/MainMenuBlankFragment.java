package com.devanshusuthar.uniguide.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.devanshusuthar.uniguide.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainMenuBlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainMenuBlankFragment extends Fragment {

    FragmentManager fm;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainMenuBlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainMenuBlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainMenuBlankFragment newInstance(String param1, String param2) {
        MainMenuBlankFragment fragment = new MainMenuBlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main_menu_blank, container, false);

        fm = getActivity().getSupportFragmentManager();

        // Accommodation Button
        Button accommodationButton = view.findViewById(R.id.accomodation_button);
        accommodationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm.beginTransaction()
                        .replace(R.id.nav_main_menu, new AccommodationFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        // Initial Steps Button
        Button initialStepButton = view.findViewById(R.id.initial_steps_button);
        initialStepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        // Supermarket Button
        Button supermarketButton = view.findViewById(R.id.supermarket_button);
        supermarketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        // Setting Button
        Button settingsButton = view.findViewById(R.id.settings_button);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return view;
    }
}