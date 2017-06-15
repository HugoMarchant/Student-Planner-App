package com.development.hugomarchant.drawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Same for TabFragment2 and TabFragment3 except change this
// R.layout.tab_fragment_1 below

public class TabFragment4 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View v = inflater.inflate(R.layout.fragment_tab_fragment4, container, false);
        return v;
    }

}