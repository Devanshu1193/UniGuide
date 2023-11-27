package com.devanshusuthar.uniguide.Fragments;

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

import com.devanshusuthar.uniguide.Accommodations;
import com.devanshusuthar.uniguide.R;
import com.devanshusuthar.uniguide.Viewpager.CustomAccommodationAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AccommodationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AccommodationFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AccommodationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AccommodationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AccommodationFragment newInstance(String param1, String param2) {
        AccommodationFragment fragment = new AccommodationFragment();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_accommodation, container, false);

        Bundle bundle = getArguments();
        if (bundle == null) return view;

        String city = bundle.getString("CITY");
        Log.d("citytest", "onCreateView: " + city);

        RecyclerView recyclerView = view.findViewById(R.id.recycler);

        boolean staggered = PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("staggeredLayout",false);

        if (staggered){
            recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,1));
        }else {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        }

        switch (city) {
            case "Calgary":
                recyclerView.setAdapter(new CustomAccommodationAdapter(Accommodations.CALGARY_ACCOMMODATIONS));
                break;
            case "Edmonton":
                recyclerView.setAdapter(new CustomAccommodationAdapter(Accommodations.EDMONTON_ACCOMMODATIONS));
                break;
            case "Red Deer":
                recyclerView.setAdapter(new CustomAccommodationAdapter(Accommodations.RED_DEER_ACCOMMODATIONS));
                break;
            case "Vancouver":
                recyclerView.setAdapter(new CustomAccommodationAdapter(Accommodations.VANCOUVER_ACCOMMODATIONS));
                break;
            case "Surrey":
                recyclerView.setAdapter(new CustomAccommodationAdapter(Accommodations.SURREY_ACCOMMODATIONS));
                break;
            case "Burnaby":
                recyclerView.setAdapter(new CustomAccommodationAdapter(Accommodations.BURNABY_ACCOMMODATIONS));
                break;
            case "Halifax":
                recyclerView.setAdapter(new CustomAccommodationAdapter(Accommodations.HALIFAX_ACCOMMODATIONS));
                break;
            case "New Glasgow":
                recyclerView.setAdapter(new CustomAccommodationAdapter(Accommodations.NEW_GLASGOW_ACCOMMODATIONS));
                break;
            case "Toronto":
                recyclerView.setAdapter(new CustomAccommodationAdapter(Accommodations.TORONTO_ACCOMMODATIONS));
                break;
            case "Brampton":
                recyclerView.setAdapter(new CustomAccommodationAdapter(Accommodations.BRAMPTON_ACCOMMODATIONS));
                break;
            case "Windsor":
//                someText.text = "";
                recyclerView.setAdapter(new CustomAccommodationAdapter(Accommodations.WINDSOR_ACCOMMODATIONS));
                break;
        }

//        recyclerView.setAdapter(new CustomAccommodationAdapter(accomm));
        return view;
    }
}