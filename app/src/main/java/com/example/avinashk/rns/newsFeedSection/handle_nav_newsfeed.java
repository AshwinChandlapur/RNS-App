package com.example.avinashk.rns.newsFeedSection;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avinashk.rns.R;

/**
 * Created by avinashk on 10/25/15.
 */
public class handle_nav_newsfeed extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.handle_nav_newsfeed,container,false);

        return view;
    }
}
