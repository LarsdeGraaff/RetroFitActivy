package com.example.jeansmits.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jeansmits on 15/09/15.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS=3;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }


    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:

                return FragmentOne.newInstance(0, "Frag #1");
            case 1:
                return FragmentOne.newInstance(1, "Frag #2");
            case 2:
                return FragmentTwo.newInstance(2, "Frag #3");
            default:
                return null;
        }

    }


    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}
