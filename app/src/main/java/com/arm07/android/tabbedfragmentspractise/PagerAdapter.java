package com.arm07.android.tabbedfragmentspractise;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by rashmi on 10/31/2017.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    int numTabs;

    public PagerAdapter(FragmentManager fm,int numTabs) {
        super(fm);
        this.numTabs=numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabFragment1 tab1 = new TabFragment1();
                return tab1;
            case 1:
                TabFragment2 tab2 = new TabFragment2();
                return tab2;
            case 2:
                TabFragment3 tab3 = new TabFragment3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
