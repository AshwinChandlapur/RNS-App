package com.example.avinashk.rns.attendanceSection;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.avinashk.rns.R;


public class enter_usn_student extends Fragment
implements View.OnClickListener{

    Button submit_usn;
    EditText get_student_usn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.enter_usn_student, container, false);

        submit_usn = (Button)view.findViewById(R.id.submit_usn);
        get_student_usn = (EditText)view.findViewById(R.id.get_student_usn);
        submit_usn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        if(v.getId() == R.id.submit_usn){

            String str = get_student_usn.getText().toString();
            Student student = new Student();
            student.setUsn(str);

            fragment = new student_att_report();
            ft.replace(R.id.content_main, fragment);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();


        }
    }
}