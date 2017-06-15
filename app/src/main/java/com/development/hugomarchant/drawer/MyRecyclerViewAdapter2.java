package com.development.hugomarchant.drawer;

/**
 * Created by Hugo Marchant on 13/06/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter2 extends RecyclerView
        .Adapter<MyRecyclerViewAdapter2
        .DataObject2Holder> {
    private static String LOG_TAG = "MyRecyclerViewAdapter2";
    private ArrayList<DataObject2> mDataset2;
    private static MyClickListener myClickListener2;

    public static class DataObject2Holder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView label2;
        TextView dateTime2;

        public DataObject2Holder(View itemView) {
            super(itemView);
            label2 = (TextView) itemView.findViewById(R.id.textView21);
            dateTime2 = (TextView) itemView.findViewById(R.id.textView22);
            Log.i(LOG_TAG, "Adding Listener");
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            myClickListener2.onItemClick(getAdapterPosition(), v);
        }
    }

    public void setOnItemClickListener(MyClickListener myClickListener2) {
        this.myClickListener2 = myClickListener2;
    }

    public MyRecyclerViewAdapter2(ArrayList<DataObject2> myDataset2) {
        mDataset2 = myDataset2;
    }

    @Override
    public DataObject2Holder onCreateViewHolder(ViewGroup parent2,
                                               int viewType) {
        View view = LayoutInflater.from(parent2.getContext())
                .inflate(R.layout.card_view_row2, parent2, false);

        DataObject2Holder dataObject2Holder = new DataObject2Holder(view);
        return dataObject2Holder;
    }

    @Override
    public void onBindViewHolder(DataObject2Holder holder2, int position2) {
        holder2.label2.setText(mDataset2.get(position2).getmText21());
        holder2.dateTime2.setText(mDataset2.get(position2).getmText22());
    }

    public void addItem(DataObject2 dataObj2, int index) {
        mDataset2.add(index, dataObj2);
        notifyItemInserted(index);
    }

    public void deleteItem(int index) {
        mDataset2.remove(index);
        notifyItemRemoved(index);
    }

    @Override
    public int getItemCount() {
        return mDataset2.size();
    }

    public interface MyClickListener {
        public void onItemClick(int position, View v);
    }
}