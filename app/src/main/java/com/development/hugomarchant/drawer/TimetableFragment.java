package com.development.hugomarchant.drawer;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TabHost;
import android.view.Menu;
import android.view.MenuItem;

import static android.R.attr.host;
import static android.R.attr.visible;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimetableFragment extends Fragment {


    public TimetableFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_timetable, container, false);

        final TabHost mTabHost1 = (TabHost)v.findViewById(R.id.tabHost1);
        mTabHost1.setup();

        TabHost.TabSpec spec = mTabHost1.newTabSpec("Tab One");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Mon");
        mTabHost1.addTab(spec);

        //Tab 2
        spec = mTabHost1.newTabSpec("Tab Two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Tue");
        mTabHost1.addTab(spec);

        //Tab 3
        spec = mTabHost1.newTabSpec("Tab Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Wed");
        mTabHost1.addTab(spec);

        spec = mTabHost1.newTabSpec("Tab Four");
        spec.setContent(R.id.tab4);
        spec.setIndicator("Thur");
        mTabHost1.addTab(spec);

        spec = mTabHost1.newTabSpec("Tab Five");
        spec.setContent(R.id.tab5);
        spec.setIndicator("Fri");
        mTabHost1.addTab(spec);

        return v;
    }


}
