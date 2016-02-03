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
import com.example.avinashk.rns.attendanceSection.enter_hod_id;
import com.example.avinashk.rns.attendanceSection.enter_teacher_id;
import com.example.avinashk.rns.attendanceSection.enter_usn_student;


public class handle_nav_attendance extends Fragment
implements View.OnClickListener{


    Button studentLogin,teacherLogin,hodLogin;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.handle_nav_attendance,container,false);

        studentLogin = (Button)view.findViewById(R.id.studentLogin);
        teacherLogin = (Button)view.findViewById(R.id.teacherLogin);
        hodLogin = (Button)view.findViewById(R.id.hodLogin);
        studentLogin.setOnClickListener(this);
        teacherLogin.setOnClickListener(this);
        hodLogin.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        switch (v.getId()){


            case R.id.studentLogin:
                fragment = new enter_usn_student();
                ft.replace(R.id.content_main,fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
                break;

            case R.id.teacherLogin:
                fragment = new enter_teacher_id();
                ft.replace(R.id.content_main,fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
                break;

            case R.id.hodLogin:
                fragment = new enter_hod_id();
                ft.replace(R.id.content_main,fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
                break;
        }
    }
}
