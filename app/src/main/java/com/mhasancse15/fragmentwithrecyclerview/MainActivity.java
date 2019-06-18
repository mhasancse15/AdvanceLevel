package com.mhasancse15.fragmentwithrecyclerview;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mhasancse15.fragmentwithrecyclerview.Adapter.ViewPagerAdapter;
import com.mhasancse15.fragmentwithrecyclerview.Fragment.CallFragment;
import com.mhasancse15.fragmentwithrecyclerview.Fragment.ContactFragment;
import com.mhasancse15.fragmentwithrecyclerview.Fragment.FavFragment;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tabLayout_id);
        viewPager=findViewById(R.id.viewPager_id);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());

        //Add Fragment
        adapter.addFragment(new CallFragment(),"");
        adapter.addFragment(new ContactFragment(),"");
        adapter.addFragment(new FavFragment(),"");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //Add Tab Icon
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_star);

        //Remove Shadow
        ActionBar actionBar=getSupportActionBar();
        actionBar.setElevation(0);

    }
}
