package com.devanshusuthar.uniguide.Fragments;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.devanshusuthar.uniguide.Accommodations;
import com.devanshusuthar.uniguide.R;
import com.devanshusuthar.uniguide.Supermarket;
import com.devanshusuthar.uniguide.Supermarkets;
import com.devanshusuthar.uniguide.Viewpager.CustomAccommodationAdapter;
import com.devanshusuthar.uniguide.Viewpager.CustomSupermarketAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SupermarketsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SupermarketsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SupermarketsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SupermarketsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SupermarketsFragment newInstance(String param1, String param2) {
        SupermarketsFragment fragment = new SupermarketsFragment();
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


        View view = inflater.inflate(R.layout.fragment_supermarkets, container, false);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());

        String city = preferences.getString("city", "Windsor");
        ListView listView = view.findViewById(R.id.supermarket_listView);
        List<Supermarket> supermarkets;

        switch (city) {
                case "Calgary":
                    supermarkets = Supermarkets.CALGARY_SUPERMARKET;
                    break;
                case "Edmonton":
                    supermarkets = Supermarkets.EDMONTON_SUPERMARKET;
                    break;
                case "Red Deer":
                    supermarkets = Supermarkets.RED_DEER_SUPERMARKET;
                    break;
                case "Vancouver":
                    supermarkets = Supermarkets.VANCOUVER_SUPERMARKET;
                    break;
                case "Surrey":
                    supermarkets = Supermarkets.SURREY_SUPERMARKET;
                    break;
                case "Burnaby":
                    supermarkets = Supermarkets.BURNABY_SUPERMARKET;
                    break;
                case "Halifax":
                    supermarkets = Supermarkets.HALIFAX_SUPERMARKET;
                    break;
                case "New Glasgow":
                    supermarkets = Supermarkets.NEW_GLASGOW_SUPERMARKET;
                    break;
                case "Toronto":
                    supermarkets = Supermarkets.TORONTO_SUPERMARKET;
                    break;
                case "Brampton":
                    supermarkets = Supermarkets.BRAMPTON_SUPERMARKET;
                    break;
                case "Windsor":
//                someText.text = "";
                    supermarkets = Supermarkets.WINDSOR_SUPERMARKET;
                    break;
                default:
                    supermarkets = Collections.emptyList();
            }
        
        CustomSupermarketAdapter adapter = new CustomSupermarketAdapter(getContext(), supermarkets);
        listView.setAdapter(adapter);
        return view;
    }
}