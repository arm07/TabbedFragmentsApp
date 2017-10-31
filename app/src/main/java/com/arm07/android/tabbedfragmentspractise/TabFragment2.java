package com.arm07.android.tabbedfragmentspractise;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rashmi on 10/31/2017.
 */

public class TabFragment2 extends android.support.v4.app.Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstance){
        return inflater.inflate(R.layout.tab_fragment_2,viewGroup,false);
    }
}
