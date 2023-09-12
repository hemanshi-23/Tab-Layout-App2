package com.example.tablayoutapp2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_2 extends Fragment {

    TextView textView2;
    String string2;
    public Fragment_2(String s) {
       string2 = s;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container , false);

        textView2 = view.findViewById(R.id.textView2);

        textView2.setText(string2);

        return view;
    }
}