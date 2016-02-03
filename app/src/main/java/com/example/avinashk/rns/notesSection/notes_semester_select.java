package com.example.avinashk.rns.notesSection;

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
import com.example.avinashk.rns.attendanceSection.Student;
import com.example.avinashk.rns.attendanceSection.Teacher;

/**
 * Created by avinashk on 11/2/15.
 */
public class notes_semester_select extends Fragment
implements View.OnClickListener{

    TextView branch;
    Button sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notes_semester_select,container,false);
        branch = (TextView)view.findViewById(R.id.branch);
        sem1 = (Button)view.findViewById(R.id.sem1);
        sem2 = (Button)view.findViewById(R.id.sem2);
        sem3 = (Button)view.findViewById(R.id.sem3);
        sem4 = (Button)view.findViewById(R.id.sem4);
        sem5 = (Button)view.findViewById(R.id.sem5);
        sem6 = (Button)view.findViewById(R.id.sem6);
        sem7 = (Button)view.findViewById(R.id.sem7);
        sem8 = (Button)view.findViewById(R.id.sem8);

        sem1.setOnClickListener(this);
        sem2.setOnClickListener(this);
        sem3.setOnClickListener(this);
        sem4.setOnClickListener(this);
        sem5.setOnClickListener(this);
        sem6.setOnClickListener(this);
        sem7.setOnClickListener(this);
        sem8.setOnClickListener(this);


        Teacher teacher = new Teacher();
        if(teacher.getBranch().equals("CS")){
            branch.setText("COMPUTER SCIENCE");
        }else if(teacher.getBranch().equals("IS")){
            branch.setText("INFORMATION SCIENCE");
        }else if (teacher.getBranch().equals("EC")){
            branch.setText("ELECTRONICS AND COMMUNICATION");
        }else if(teacher.getBranch().equals("EE")){
            branch.setText("ELECTRICAL AND ELECTRONICS");
        }else if (teacher.getBranch().equals("IT")){
            branch.setText("INSTRUMENTATION TECHNOLOGY");
        }else if(teacher.getBranch().equals("ME")){
            branch.setText("MECHANICAL");
        }else if(teacher.getBranch().equals("CIV")){
            branch.setText("CIVIL");
        }else {
            branch.setText("");
        }

        return view;
    }

    @Override
    public void onClick(View v) {

        Student student = new Student();

        switch (v.getId()){
            case R.id.sem1:
                student.setSemester(1);
                break;

            case R.id.sem2:
                student.setSemester(2);
                break;

            case R.id.sem3:
                student.setSemester(3);
                break;

            case R.id.sem4:
                student.setSemester(4);
                break;

            case R.id.sem5:
                student.setSemester(5);
                break;

            case R.id.sem6:
                student.setSemester(6);
                break;

            case R.id.sem7:
                student.setSemester(7);
                break;

            case R.id.sem8:
                student.setSemester(8);
                break;
        }
        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        fragment = new notes_subject_select();
        ft.replace(R.id.content_main,fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();
    }
}
