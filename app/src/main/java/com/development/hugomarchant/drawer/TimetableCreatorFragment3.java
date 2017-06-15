package com.development.hugomarchant.drawer;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;



/**
 * A simple {@link Fragment} subclass.
 */
public class TimetableCreatorFragment3 extends Fragment {

    private RecyclerView mRecyclerView2;
    private RecyclerView.Adapter mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager2;
    private static String LOG_TAG = "CardViewActivity";

    @Override
    public View onCreateView(LayoutInflater inflater2, ViewGroup container2,
                             Bundle savedInstanceState) {

        View v = inflater2.inflate(R.layout.card_view_row2, container2, false);
        super.onCreate(savedInstanceState);

        mRecyclerView2 = (RecyclerView)v.findViewById(R.id.my_recycler_view2);

        mRecyclerView2.setHasFixedSize(true);
        mLayoutManager2 = new LinearLayoutManager(getActivity());
        mRecyclerView2.setLayoutManager(mLayoutManager2);
        mAdapter2 = new MyRecyclerViewAdapter2(getDataSet2());
        mRecyclerView2.setAdapter(mAdapter2);

        // Code to Add an item with default animation
        //((MyRecyclerViewAdapter) mAdapter).addItem(obj, index);

        // Code to remove an item with default animation
        //((MyRecyclerViewAdapter) mAdapter).deleteItem(index);
        return v;
    }


    @Override
    public void onResume() {
        super.onResume();
        ((MyRecyclerViewAdapter2) mAdapter2).setOnItemClickListener(new MyRecyclerViewAdapter2
                .MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Log.i(LOG_TAG, " Clicked on Item " + position);
            }
        });
    }



    private ArrayList<DataObject2> getDataSet2() {

        ArrayList stuff = new ArrayList();
        stuff.add("1");
        stuff.add("2");
        stuff.add("3");
        stuff.add("4");

        ArrayList results = new ArrayList<DataObject2>();
        for (int index = 0; index < 21; index++) {
            DataObject2 obj = new DataObject2("Subject: " + index,
                    "Due date " + index);
            results.add(index, obj);
        }
        return results;

    }


}
