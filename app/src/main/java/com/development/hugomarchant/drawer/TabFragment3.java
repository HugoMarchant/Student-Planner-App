package com.development.hugomarchant.drawer;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;


import java.util.ArrayList;
import java.util.List;

import static com.development.hugomarchant.drawer.R.id.fab3;

// Same for TabFragment2 and TabFragment3 except change this
// R.layout.tab_fragment_1 below

public class TabFragment3 extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_tab_fragment3, container, false);
        super.onCreate(savedInstanceState);

        mRecyclerView = (RecyclerView)v.findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);

        FloatingActionButton mfab3 = (FloatingActionButton)v.findViewById(fab3);
        mfab3.show();

        mfab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        // Code to Add an item with default animation
        //((MyRecyclerViewAdapter) mAdapter).addItem(obj, index);

        // Code to remove an item with default animation
        //((MyRecyclerViewAdapter) mAdapter).deleteItem(index);
        return v;
    }


    @Override
    public void onResume() {
        super.onResume();
        ((MyRecyclerViewAdapter) mAdapter).setOnItemClickListener(new MyRecyclerViewAdapter
                .MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Log.i(LOG_TAG, " Clicked on Item " + position);
            }
        });
    }



    private ArrayList<DataObject> getDataSet() {

        ArrayList stuff = new ArrayList();
        stuff.add("1");
        stuff.add("2");
        stuff.add("3");
        stuff.add("4");

        ArrayList results = new ArrayList<DataObject>();
        for (int index = 0; index < 21; index++) {
            DataObject obj = new DataObject("Subject: " + index,
                    "Due date " + index);
            results.add(index, obj);
        }
        return results;

    }









}




