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


public class enter_teacher_id extends Fragment implements View.OnClickListener {
    Button teacher_login_submit;
    EditText login_teacher_no,teacher_pp;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.enter_teacher_id,container,false);

        teacher_login_submit = (Button) view.findViewById(R.id.teacher_login_submit);
        login_teacher_no = (EditText)view.findViewById(R.id.login_teacher_no);
        teacher_pp = (EditText)view.findViewById(R.id.teacher_pp);


        teacher_login_submit.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Teacher teacher = new Teacher();
        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        if( v.getId() == R.id.teacher_login_submit){
            if(login_teacher_no.getText().length()!=0){
                if(teacher_pp.getText().toString().equals("teacher")){

                    int tid = Integer.parseInt(login_teacher_no.getText().toString());
                    teacher.setTeacherid(tid);

                    fragment = new teacher_attendance_report();
                    ft.replace(R.id.content_main, fragment);
                    ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    ft.addToBackStack(null);
                    ft.commit();
                }else {
                    teacher_pp.setError("Invalid password");
                }
            }


        }
    }
}
