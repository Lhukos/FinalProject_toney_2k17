package com.example.sit.finalproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;

/**
 * Created by sit on 8/2/2017.
 */

public class BottomPicFrag extends Fragment {

    // define widget variables
    private static TextView topTV;
    private static TextView bottomTV;

    public BottomPicFrag() {
        // required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom_pic, container, false);

        // get references to the widget
        topTV = (TextView) view.findViewById(R.id.topTV);
        bottomTV = (TextView) view.findViewById(R.id.bottomTV);

        return view;
    }

    public void setMemeText(String top, String bottom) {
        topTV.setText(top);
        bottomTV.setText(bottom);
    }
}
