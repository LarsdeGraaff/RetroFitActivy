package com.example.jeansmits.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jeansmits on 15/09/15.
 */
public class FragmentTwo extends Fragment {

    public String title;
    public int page;

    public static FragmentTwo newInstance(int page, String title){
        FragmentTwo fragmentTwo=new FragmentTwo();
        Bundle args=new Bundle();
        args.putInt("some int", page);
        args.putString("some String", title );
        fragmentTwo.setArguments(args);
        return  fragmentTwo;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page=getArguments().getInt("someInt",0);
        title=getArguments().getString("someTitle");    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_two, container, false);
        TextView label= (TextView) view.findViewById(R.id.label);
        label.setText(page + " -- " + title);

        return view;

    }
}
