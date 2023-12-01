package com.devanshusuthar.uniguide.Viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.devanshusuthar.uniguide.R;

public class CreateViewAdapterSteps extends FragmentStateAdapter {

    public CreateViewAdapterSteps(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return InitialStepsFragment.newInstance("Health Insurance & Health Card", R.drawable.health_card, "- Get your Health Insurance activated\n" +
                    "- For students it is already included in the college fees, students can get details about it by reaching out International Student Department in college\n" +
                    "- For those who are not students, they have to contact the company they have opt for the Insurance or else they can get one from various companies.\n" +
                    "- People need to go to nearby Service Ontario for their Health Card.\n" +
                    "- If you already have your insurance then you need to call to customer care of that particular company with your policy number and ask what we need to do to activate our Health Insurance & it not when it can be done.\n" +
                    "- Get information about your Insurance like what amount will it cover? what benefits you will get? How much it will cover with Hospitals, Clinics, Dental, Eyes related etc?\n" +
                    "- Medical is Expensive here."
                    );
            case 1: return InitialStepsFragment.newInstance("Bus Pass / Transit Pass", R.drawable.presto_card,
                    "- - Get your Bus pass or Transit Pass or Presto Card for traveling");
            case 2: return InitialStepsFragment.newInstance("Step : 3", 0,"Desc : 3");
            case 3: return InitialStepsFragment.newInstance("Step : 4", 0,"Desc : 4");
            case 4: return InitialStepsFragment.newInstance("Step : 5", 0,"Desc : 5");
            default: return InitialStepsFragment.newInstance("Error",0,"Page not found");
        }
    }


    @Override
    public int getItemCount() {
        return 5;
    }
}
