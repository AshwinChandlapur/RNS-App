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


public class hod_view_student_shortage extends Fragment
implements View.OnClickListener{

    Button se1,se2,se3,se4,se5,se6,se7,se8;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hod_view_student_shortage,container,false);

        se1 = (Button)view.findViewById(R.id.se1);
        se2 = (Button)view.findViewById(R.id.se2);
        se3 = (Button)view.findViewById(R.id.se3);
        se4 = (Button)view.findViewById(R.id.se4);
        se5 = (Button)view.findViewById(R.id.se5);
        se6 = (Button)view.findViewById(R.id.se6);
        se7 = (Button)view.findViewById(R.id.se7);
        se8 = (Button)view.findViewById(R.id.se8);

        se1.setOnClickListener(this);
        se2.setOnClickListener(this);
        se3.setOnClickListener(this);
        se4.setOnClickListener(this);
        se5.setOnClickListener(this);
        se6.setOnClickListener(this);
        se7.setOnClickListener(this);
        se8.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Student student = new Student();
        switch (v.getId()){
            case R.id.se1:
                student.setSemester(1);
                break;

            case R.id.se2:
                student.setSemester(2);
                break;

            case R.id.se3:
                student.setSemester(3);
                break;

            case R.id.se4:
                student.setSemester(4);
                break;

            case R.id.se5:
                student.setSemester(5);
                break;

            case R.id.se6:
                student.setSemester(6);
                break;

            case R.id.se7:
                student.setSemester(7);
                break;

            case R.id.se8:
                student.setSemester(8);
                break;
        }
        Fragment fragment = new hod_final_view_shortage();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.content_main, fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();

    }
}
