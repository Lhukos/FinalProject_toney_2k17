package com.example.sit.finalproject;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sit on 8/2/2017.
 */

public class TopSectionFrag extends Fragment {

    // define widget variables
    private static EditText topET;
    private static EditText bottomET;

    TopSectionListener activityCommander;

    public interface TopSectionListener {
        public void createMemey(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            activityCommander = (TopSectionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString());
        }
    }

    public TopSectionFrag () {
        // required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top_section, container, false);

        // get references to the widget
        topET = (EditText) view.findViewById(R.id.topET);
        bottomET = (EditText) view.findViewById(R.id.bottomET);
        final Button button = (Button) view.findViewById(R.id.button);

        // set the listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        return view;
    }

    public void buttonClick(View view) {
        activityCommander.createMemey(topET.toString(), bottomET.toString());
    }
}
