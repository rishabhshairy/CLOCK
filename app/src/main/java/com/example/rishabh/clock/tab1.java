package com.example.rishabh.clock;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Rishabh on 2/4/2018.
 */

public class tab1 extends Fragment {
    ViewPager pager;
    ImageSwip swip;



    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
         //pager=(ViewPager)getActivity().findViewById(R.id.viewPagerTab1);
        View view=inflater.inflate(R.layout.tab1,container,false);
        pager=view.findViewById(R.id.viewPagerTab1);
        swip=new ImageSwip(getContext());
        pager.setAdapter(swip);
        return view;
    }
}
