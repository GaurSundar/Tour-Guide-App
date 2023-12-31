package com.example.delhitourguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class DelhiAdapter extends FragmentStateAdapter {
    public DelhiAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 0:
                return new SightsFragment();
            case 1:
                return new HotelsFragment();
            case 2:
                return new MallsFragment();
            case 3:
                return new CinemaFragment();
            default:
                return null;
        }

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
