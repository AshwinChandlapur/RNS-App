package com.example.avinashk.rns;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class update_std_teac_hod extends Fragment
implements  View.OnClickListener{
    Button updateStudent,updateTeacher,updateHod;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.update_std_teac_hod,container,false);

        updateStudent = (Button)view.findViewById(R.id.updateStudent);
        updateTeacher = (Button)view.findViewById(R.id.updateTeacher);

        updateStudent.setOnClickListener(this);
        updateTeacher.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        switch (v.getId()){
            case R.id.updateTeacher:
                fragment = new update_new_teacher();
                ft.replace(R.id.content_main, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
                break;
            case R.id.updateStudent:
                fragment = new update_new_student();
                ft.replace(R.id.content_main, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
                break;
        }
    }
}
