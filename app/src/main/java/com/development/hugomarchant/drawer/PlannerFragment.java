package com.development.hugomarchant.drawer;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.development.hugomarchant.drawer.stab.SlidingTabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlannerFragment extends Fragment {


    public PlannerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_planner, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mViewPager.setAdapter(new MyAdapter(getChildFragmentManager()));

        SlidingTabLayout slidingTabLayout = (SlidingTabLayout)view.findViewById(R.id.sliding_tabs);

        // Connect the viewPager with the sliding tab layout
        slidingTabLayout.setViewPager(mViewPager);
        mViewPager.setCurrentItem(2);

    }

    public static class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public Fragment getItem(int position) {
            if(position == 0){
                return new TabFragment1();
            } else if(position == 1) {
                return new TabFragment2();
            } else if(position == 2) {
                return new TabFragment3();
            } else if(position == 3) {
                return new TabFragment4();
            }

            return null;
        }


        private String tabTitles[] = new String[] { "2 weeks ago", "Last week", "This week", "Next week" };

        @Override
        public CharSequence getPageTitle(int position) {
            // Return the tab title to SlidingTabLayout
            return tabTitles[position];
        }
    }
}
