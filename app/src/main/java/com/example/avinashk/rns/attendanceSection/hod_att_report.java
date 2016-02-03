package com.example.avinashk.rns.attendanceSection;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.avinashk.rns.R;


public class hod_att_report extends Fragment
implements View.OnClickListener{
    TextView dept_name_disp;
    Button s1,s2,s3,s4,s5,s6,s7,s8;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hod_att_report,container,false);

        dept_name_disp = (TextView)view.findViewById(R.id.dept_name_disp);
        s1 = (Button)view.findViewById(R.id.s1);
        s2 = (Button)view.findViewById(R.id.s2);
        s3 = (Button)view.findViewById(R.id.s3);
        s4 = (Button)view.findViewById(R.id.s4);
        s5 = (Button)view.findViewById(R.id.s5);
        s6 = (Button)view.findViewById(R.id.s6);
        s7 = (Button)view.findViewById(R.id.s7);
        s8 = (Button)view.findViewById(R.id.s8);


        s1.setOnClickListener(this);
        s2.setOnClickListener(this);
        s3.setOnClickListener(this);
        s4.setOnClickListener(this);
        s5.setOnClickListener(this);
        s6.setOnClickListener(this);
        s7.setOnClickListener(this);
        s8.setOnClickListener(this);

        Department department = new Department();

        if(department.getBranch().equals("IS")){
            dept_name_disp.setText("INFORMATION SCIENCE");

        }else if(department.getBranch().equals("CS")){
            dept_name_disp.setText("COMPUTER SCIENCE");

        }else if(department.getBranch().equals("EC")){
            dept_name_disp.setText("ELECTRONICS AND COMMUNICATION");

        }else if(department.getBranch().equals("EE")){
            dept_name_disp.setText("ELECTICAL AND ELECTRONICS");

        }else {
            dept_name_disp.setText("");
        }

        return view;
    }

    @Override
    public void onClick(View v) {
        Student student = new Student();
        switch (v.getId()){
            case R.id.s1:
                student.setSemester(1);
                break;

            case R.id.s2:
                student.setSemester(2);
                break;

            case R.id.s3:
                student.setSemester(3);
                break;

            case R.id.s4:
                student.setSemester(4);
                break;

            case R.id.s5:
                student.setSemester(5);
                break;

            case R.id.s6:
                student.setSemester(6);
                break;

            case R.id.s7:
                student.setSemester(7);
                break;

            case R.id.s8:
                student.setSemester(8);
                break;
        }
        Fragment fragment = new hod_final_att_report();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.content_main, fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();


    }
}
