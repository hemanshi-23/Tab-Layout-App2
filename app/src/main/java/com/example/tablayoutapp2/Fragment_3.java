package com.example.tablayoutapp2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_3 extends Fragment {

    TextView textView3;
    String string3;
    public Fragment_3(String s) {
        string3 = s;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container , false);

        textView3 = view.findViewById(R.id.textView3);

        textView3.setText(string3);

        return view;
    }
}