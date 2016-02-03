package com.example.avinashk.rns.attendanceSection;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.avinashk.rns.R;


public class hod_options extends Fragment
implements View.OnClickListener{

    Button hod_view,hod_contact,hod_shortage;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hod_optons,container,false);

        hod_view = (Button)view.findViewById(R.id.hod_view);
        hod_contact = (Button)view.findViewById(R.id.hod_contact);
        hod_shortage = (Button)view.findViewById(R.id.hod_shortage);

        hod_view.setOnClickListener(this);
        hod_contact.setOnClickListener(this);
        hod_shortage.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        switch (v.getId()){

            case R.id.hod_view:
                fragment = new hod_att_report();
                ft.replace(R.id.content_main, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
                break;

            case R.id.hod_contact:
                fragment = new hod_get_student_contact();
                ft.replace(R.id.content_main, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
                break;

            case R.id.hod_shortage:
                fragment = new hod_view_student_shortage();
                ft.replace(R.id.content_main, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
                break;
        }
    }
}
