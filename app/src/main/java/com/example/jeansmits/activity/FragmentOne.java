package com.example.jeansmits.activity;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by jeansmits on 15/09/15.
 */
public class FragmentOne extends Fragment{

    public String title;
    public int page;

    public static FragmentOne newInstance(int page, String title){

        FragmentOne fragmentOne= new FragmentOne();
        Bundle args=new Bundle();
        args.putInt("some Int", page);
        args.putString("some String", title);
        fragmentOne.setArguments(args);
        return fragmentOne;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        page=getArguments().getInt("some Int",0);
        title=getArguments().getString("some String");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_one, container, false);
        TextView label= (TextView) view.findViewById(R.id.label);
        label.setText(page + " -- " + title);

        return view;

    }


}
