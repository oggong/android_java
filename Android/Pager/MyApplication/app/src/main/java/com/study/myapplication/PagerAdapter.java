package com.study.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public PagerAdapter(FragmentManager fragmentManager, int tabCount) {
        super(fragmentManager);
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: {
                FragmentOne fragmentOne = new FragmentOne();
                return fragmentOne;
            }
            case 1: {
                FragmentTwo fragmentTwo = new FragmentTwo();
                return fragmentTwo;
            }
            case 2: {
                FragmentThree fragmentThree = new FragmentThree();
                return fragmentThree;
            }
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // 페이지 수
        return tabCount;
    }
}
