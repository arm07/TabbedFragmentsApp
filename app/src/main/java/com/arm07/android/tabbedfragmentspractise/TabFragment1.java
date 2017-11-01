package com.arm07.android.tabbedfragmentspractise;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by rashmi on 10/31/2017.
 */

public class TabFragment1 extends android.support.v4.app.Fragment {

    ListView listView;
    String[] courses={"ANDROID","ANGULAR","NODE JS","IOS","JAVA","PYTHON"};
    View view;
    int[] imageIds={R.drawable.android,R.drawable.angular,R.drawable.node,R.drawable.ios,R.drawable.java,R.drawable.python};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.tab_fragment_1, container, false);

        listView=(ListView)view.findViewById(R.id.listItemTab1);
        CustomListAdapter myAdapter = new CustomListAdapter(courses,imageIds,getActivity());
        listView.setAdapter(myAdapter);

        return view;
    }

}








