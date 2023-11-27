package com.devanshusuthar.uniguide.Viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CreateViewAdapterSteps extends FragmentStateAdapter {

    public CreateViewAdapterSteps(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return InitialStepsFragment.newInstance("Step : 1", "Desc : 1",0);
            case 1: return InitialStepsFragment.newInstance("Step : 2", "Desc : 2",0);
            case 2: return InitialStepsFragment.newInstance("Step : 3", "Desc : 3",0);
            case 3: return InitialStepsFragment.newInstance("Step : 4", "Desc : 4",0);
            case 4: return InitialStepsFragment.newInstance("Step : 5", "Desc : 5",0);
            default: return InitialStepsFragment.newInstance("Error","Page not found",0);
        }
    }


    @Override
    public int getItemCount() {
        return 5;
    }
}
