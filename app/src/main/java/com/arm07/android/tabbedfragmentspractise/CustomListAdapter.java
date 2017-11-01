package com.arm07.android.tabbedfragmentspractise;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by rashmi on 10/31/2017.
 */

public class CustomListAdapter extends BaseAdapter {
    String[] courses;
    int[] imgIds;
    Context context;
    LayoutInflater inflater;


    public CustomListAdapter(String[] course, int[] imageIds,Context context){
        this.courses=course;
        this.imgIds=imageIds;
        this.context=context;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return courses.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    public static class MyViewHolder {
        ImageView iv;
        TextView tv;
    }

    @Override
    public View getView(final int postion, View view, ViewGroup viewGroup) {
        MyViewHolder myViewHolder = new MyViewHolder();
        if (view == null) {
            view = inflater.inflate(R.layout.item_layout, null);
            myViewHolder.iv = (ImageView) view.findViewById(R.id.imageViewItem);
            myViewHolder.tv = (TextView) view.findViewById(R.id.textViewItem);
            view.setTag(myViewHolder);
        } else {
            myViewHolder = (MyViewHolder) view.getTag();
        }
        myViewHolder.tv.setText(courses[postion]);
        myViewHolder.iv.setImageResource(imgIds[postion]);

        myViewHolder.tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = courses[postion];
                Toast.makeText(context, "item clicked " + item, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
