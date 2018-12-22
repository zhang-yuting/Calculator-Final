package com.zht.compute.compute_zht;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by anne on 2018/12/10.
 */

public class AdapterOfCompute extends FragmentPagerAdapter {
private List<Fragment> pages;
    public AdapterOfCompute(FragmentManager fm,List<Fragment> pages) {
        super(fm);
        this.pages=pages;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return pages.get(position);
    }

    @Override
    public int getCount() {
        return pages.size();
    }
}
