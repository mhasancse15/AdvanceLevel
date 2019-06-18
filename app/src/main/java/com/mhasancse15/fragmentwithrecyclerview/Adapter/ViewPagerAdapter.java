package com.mhasancse15.fragmentwithrecyclerview.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment>listFragment=new ArrayList<>();
    private final List<String> listTitles=new ArrayList<String>();


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listTitles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return (CharSequence) listTitles.get(position);
    }

    public void addFragment(Fragment fragment,String title){

        listFragment.add(fragment);
        listTitles.add(title);

    }
}
