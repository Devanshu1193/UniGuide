package com.devanshusuthar.uniguide.Fragments;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.preference.PreferenceManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Switch;

import com.devanshusuthar.uniguide.MainActivity;
import com.devanshusuthar.uniguide.R;
import com.devanshusuthar.uniguide.StringArray;

/**
 * This is the login page
 * @author Devanshu
 */

public class LoginPageFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LoginPageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoginPage.
     */
    // TODO: Rename and change types and number of parameters
    public static LoginPageFragment newInstance(String param1, String param2) {
        LoginPageFragment fragment = new LoginPageFragment();
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
    public void onResume() {
        super.onResume();
        MainActivity.getAppBar().show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login_page, container, false);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());

        MainActivity.getAppBar().show();

        Spinner citySpinner = view.findViewById(R.id.city_dropDown);
        Spinner provinceSpinner = view.findViewById(R.id.province_dropDown);
        Spinner collegeSpinner = view.findViewById(R.id.college_dropDown);

        // String Array of Provinces in Canada
        StringArray provinces = new StringArray(getContext(), "Alberta", "British Columbia", "Nova Scotia", "Ontario");

        preferences.edit().putString("province", "No").apply();

        // Sting Array of Various Cities in Canada
        StringArray citiesAlberta = new StringArray(getContext(), "Calgary", "Edmonton", "Red Deer");
        StringArray citiesBC = new StringArray(getContext(),"Vancouver", "Surrey", "Burnaby");
        StringArray citiesOntario = new StringArray(getContext(),"Toronto","Brampton","Windsor");
        StringArray citiesNovaScotia = new StringArray(getContext(), "Halifax","New Glasgow");

        // List 0f Universities in ALBERTA
        StringArray collegeInCalgary = new StringArray(getContext(),"University of Calgary", "Bow Valley College", "Alberta University of Arts");
        StringArray collegeInEdmonton = new StringArray(getContext(),"University of Alberta", "MacEwan University", "Concordia University of Edmonton");
        StringArray collegeInRedDeer = new StringArray(getContext(),"Red Deer College");

        // List 0f Universities in BRITISH COLUMBIA
        StringArray collegeInVancouver = new StringArray(getContext(),"The University of British Columbia", "Simon Fraser University", "Capilano University");
        StringArray collegeInSurrey = new StringArray(getContext(),"CDI College Surrey", "Douglas College", "Brighton College");
        StringArray collegeInBurnaby = new StringArray(getContext(),"Fraser International College", "British Columbia Institute of Tech.", "Alexander College");

        // List 0f Universities in NOVA SCOTIA
        StringArray collegeInHalifax = new StringArray(getContext(),"Mount Saint Vincent University", "Saint Mary/'s University", "Dalhousie University");
        StringArray collegeInNewGlasgow = new StringArray(getContext(),"Cape Breton University", "St. Francis Xavier University", "Nova Scotia Community College");

        // List 0f Universities in ONTARIO
        StringArray collegeInToronto = new StringArray(getContext(),"Seneca College", "University of Toronto", "Humber College");
        StringArray collegeInBrampton = new StringArray(getContext(),"Sheridan College", "Centennial College", "Cambrian College");
        StringArray collegeInWindsor = new StringArray(getContext(),"University of Windsor", "Saint Clair College");


        provinceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String province = provinces.getItem(i);

                switch (province) {
                    case "Alberta":
                        citySpinner.setAdapter(citiesAlberta);
                        break;

                    case "British Columbia":
                        citySpinner.setAdapter(citiesBC);
                        break;

                    case "Nova Scotia":
                        citySpinner.setAdapter(citiesNovaScotia);
                        break;

                    case "Ontario":
                        citySpinner.setAdapter(citiesOntario);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

// Created a spinner for city
        citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                StringArray adapter = (StringArray) citySpinner.getAdapter();
                String selected = adapter.getItem(i);

                switch (selected) {
                    case "Calgary":
                        collegeSpinner.setAdapter(collegeInCalgary);
                        break;
                    case "Edmonton":
                        collegeSpinner.setAdapter(collegeInEdmonton);
                        break;
                    case "Red Deer":
                        collegeSpinner.setAdapter(collegeInRedDeer);
                        break;
                    case "Vancouver":
                        collegeSpinner.setAdapter(collegeInVancouver);
                        break;
                    case "Surrey":
                        collegeSpinner.setAdapter(collegeInSurrey);
                        break;
                    case "Burnaby":
                        collegeSpinner.setAdapter(collegeInBurnaby);
                        break;
                    case "Halifax":
                        collegeSpinner.setAdapter(collegeInHalifax);
                        break;
                    case "New Glasgow":
                        collegeSpinner.setAdapter(collegeInNewGlasgow);
                        break;
                    case "Toronto":
                        collegeSpinner.setAdapter(collegeInToronto);
                        break;
                    case "Brampton":
                        collegeSpinner.setAdapter(collegeInBrampton);
                        break;
                    case "Windsor":
                        collegeSpinner.setAdapter(collegeInWindsor);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        provinceSpinner.setAdapter(provinces);
        citySpinner.setAdapter(citiesAlberta);


        view.findViewById(R.id.main_login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringArray cityAdapter = (StringArray) citySpinner.getAdapter();
                StringArray provinceAdapter = (StringArray) provinceSpinner.getAdapter();
                StringArray collegeAdapter = (StringArray) collegeSpinner.getAdapter();

                Bundle bundle = new Bundle();
                bundle.putString("CITY", cityAdapter.getItem(citySpinner.getSelectedItemPosition()));

                preferences.edit().putInt("completed_setup", 1)
                        .putString("province", provinceAdapter.getItem(provinceSpinner.getSelectedItemPosition()))
                        .putString("college", collegeAdapter.getItem(collegeSpinner.getSelectedItemPosition()))
                        .putString("city", cityAdapter.getItem(citySpinner.getSelectedItemPosition())).apply();

                Navigation.findNavController(view).navigate(R.id.action_nav_login_to_mainMenuBlankFragment, bundle);
            }
        });

        return view;
    }
}