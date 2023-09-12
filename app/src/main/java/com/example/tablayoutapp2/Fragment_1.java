package com.example.tablayoutapp2;



import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment_1 extends Fragment {

    TextView textView1;

    String string1;

    public Fragment_1(String s) {
        string1 = s;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container , false);

        textView1 = view.findViewById(R.id.textView1);

        textView1.setText(string1);

        return view;
    }
}