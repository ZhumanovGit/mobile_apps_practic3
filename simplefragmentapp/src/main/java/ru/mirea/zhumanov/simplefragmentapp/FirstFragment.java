package ru.mirea.zhumanov.simplefragmentapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstFragment extends Fragment {


    private static final String PARAM1 = "param1";
    private static final String PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public FirstFragment() {

    }


    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(PARAM1, param1);
        args.putString(PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(PARAM1);
            mParam2 = getArguments().getString(PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_first, container, false);
    }
}