package com.devanshusuthar.uniguide.Viewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.devanshusuthar.uniguide.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InitialStepsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

/**
 * Created Steps using View Pager which will show what are the initial steps that you have to carry out when you reach in canada.
 * @author Devanshu
 * @date Nov 17' 23
 */
public class InitialStepsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_STEPS_DESC = "stepsDesc";
    private static final String ARG_STEPS_TITLE = "stepsTitle";
    private static final int ARG_STEPS_IMAGE = Integer.parseInt("stepsImage");

    // TODO: Rename and change types of parameters
    private String stepsDesc;
    private String stepsTitle;
    private int stepsImage;

    public InitialStepsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param stepsTitle Parameter 1.
     * @param stepsDesc Parameter 2.
     * @return A new instance of fragment InitialStepsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InitialStepsFragment newInstance(String stepsTitle, String stepsDesc, int stepsImage) {
        InitialStepsFragment fragment = new InitialStepsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_STEPS_DESC, stepsDesc);
        args.putString(ARG_STEPS_TITLE, stepsTitle);
        args.putInt(String.valueOf(ARG_STEPS_IMAGE), stepsImage);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            stepsDesc = getArguments().getString(ARG_STEPS_DESC);
            stepsTitle = getArguments().getString(ARG_STEPS_TITLE);
            stepsImage = getArguments().getInt(String.valueOf(ARG_STEPS_IMAGE));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_initial_steps, container, false);

        TextView stepsTitleView = view.findViewById(R.id.steps_title);
        ImageView stepsImageView = view.findViewById(R.id.initial_steps_image);
        TextView stepsDescView = view.findViewById(R.id.steps_desc);

        stepsTitleView.setText(stepsTitle);
        stepsDescView.setText(stepsDesc);
//        stepsImageView.setImag(R.id.initial_steps_image);
//
//        if (imageResource != 0){
//            imageView.setImageResource(imageResource);
//        }




        return view;
    }
}