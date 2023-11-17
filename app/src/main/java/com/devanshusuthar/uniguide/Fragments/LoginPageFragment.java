package com.devanshusuthar.uniguide.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.devanshusuthar.uniguide.MainActivity;
import com.devanshusuthar.uniguide.R;
import com.devanshusuthar.uniguide.StringArray;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginPageFragment#newInstance} factory method to
 * create an instance of this fragment.
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

        MainActivity.getAppBar().show();

        Spinner citySpinner = view.findViewById(R.id.city_dropDown);
        Spinner provinceSpinner = view.findViewById(R.id.province_dropDown);

        // String Array of Provinces in Canada
        StringArray provinces = new StringArray(getContext(), "Alberta", "British Columbia", "Nova Scotia", "Ontario", "Manitoba");

        // Sting Array of Various Cities in Canada
        StringArray citiesAlberta = new StringArray(getContext(), "Calgary", "Edmonton", " Red Deer");
        StringArray citiesBC = new StringArray(getContext(),"Vancouver", "Surrey", "Burnaby");
        StringArray citiesManitoba = new StringArray(getContext(),"Vancouver", "Surrey", "Burnaby");
        StringArray citiesOntario = new StringArray(getContext(),"Toronto","Brampton","Windsor");
        StringArray citiesNovaScotia = new StringArray(getContext(), "Halifax","Cape Breton","New Glasgow");



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
                    case "Manitoba":
                        citySpinner.setAdapter(citiesManitoba);
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
                Navigation.findNavController(view).navigate(R.id.action_nav_login_to_mainMenuBlankFragment);
            }
        });

//        Bundle bundle = new Bundle();
//        bundle.putString("CITY", citySelected);
//        Navigation.findNavController(view).navigate(R.id.nav_somewhere, bundle);

        return view;
    }
}