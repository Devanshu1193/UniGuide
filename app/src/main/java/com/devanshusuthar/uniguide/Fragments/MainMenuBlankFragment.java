package com.devanshusuthar.uniguide.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.devanshusuthar.uniguide.R;
import com.devanshusuthar.uniguide.Viewpager.InitialStepsFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainMenuBlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainMenuBlankFragment extends Fragment {



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
        Bundle bundle = getArguments();
        if (bundle == null) return view;

        // Accommodation Button
        Button accommodationButton = view.findViewById(R.id.accomodation_button);
        accommodationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Replace the current fragment with a new one
//                replaceFragment(new AccommodationFragment());

                Navigation.findNavController(view).navigate(R.id.action_nav_main_menu_to_nav_accommodation, bundle);

            }
        });

        // Initial Steps Button
        Button initialStepButton = view.findViewById(R.id.initial_steps_button);
        initialStepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                replaceFragment(new InitialStepsFragment());
                Navigation.findNavController(view).navigate(R.id.action_nav_main_menu_to_nav_vphost, bundle);
            }
        });


        // Supermarket Button
        Button supermarketButton = view.findViewById(R.id.supermarket_button);
        supermarketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                replaceFragment(new SupermarketsFragment());
                Navigation.findNavController(view).navigate(R.id.action_nav_main_menu_to_nav_supermarkets, bundle);
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


    // Created a function to go from one fragment to another and to add transitions
    private void replaceFragment(Fragment fragment) {
        // Get the FragmentManager and start a transaction
        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        // Replace the current fragment with the new one
        fragmentTransaction.replace(R.id.main_menu_id, fragment);

        // Commit the transaction
        fragmentTransaction.commit();
    }
}
