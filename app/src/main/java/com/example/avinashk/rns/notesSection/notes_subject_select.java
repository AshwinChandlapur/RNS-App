package com.example.avinashk.rns.notesSection;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.avinashk.rns.R;
import com.example.avinashk.rns.attendanceSection.Student;
import com.example.avinashk.rns.attendanceSection.Teacher;


public class notes_subject_select extends Fragment
implements View.OnClickListener{


    Button sub1,sub2,sub3,sub4,sub5,sub6;

    Teacher teacher = new Teacher();
    Student student = new Student();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notes_subject_select,container,false);

        sub1 = (Button)view.findViewById(R.id.sub1);
        sub2 = (Button)view.findViewById(R.id.sub2);
        sub3 = (Button)view.findViewById(R.id.sub3);
        sub4 = (Button)view.findViewById(R.id.sub4);
        sub5 = (Button)view.findViewById(R.id.sub5);
        sub6 = (Button)view.findViewById(R.id.sub6);

        sub1.setOnClickListener(this);
        sub2.setOnClickListener(this);
        sub3.setOnClickListener(this);
        sub4.setOnClickListener(this);
        sub5.setOnClickListener(this);
        sub6.setOnClickListener(this);



        if(teacher.getBranch().equals("CS")){

                if(student.getSemester() == 1){
                    sub1.setText("Mathematics 1");
                    sub2.setText("Physics");
                    sub3.setText("electrical");
                    sub4.setText("elements of mechanical engg");
                    sub5.setText("civil");
                    sub6.setText("cip");
                }else if(student.getSemester() == 2){
                    sub1.setText("Mathematics 2");
                    sub2.setText("chemistry");
                    sub3.setText("caed");
                    sub4.setText("electronics");
                    sub5.setText("ccp");
                    sub6.setText("evs");
                }else if(student.getSemester() == 3){

                }else if(student.getSemester() == 4){

                }else if(student.getSemester() == 5){
                    sub1.setText("Software engineering");
                    sub2.setText("system Software");
                    sub3.setText("operating system");
                    sub4.setText("dbms");
                    sub5.setText("computer networks 1");
                    sub6.setText("flat");
                }else if(student.getSemester() == 6){

                }else if(student.getSemester() == 7){

                }else if(student.getSemester() == 8){

                }
        }else if(teacher.getBranch().equals("IS")){

            if(student.getSemester() == 1){
                sub1.setText("Mathematics 1");
                sub2.setText("Physics");
                sub3.setText("electrical");
                sub4.setText("elements of mechanical engg");
                sub5.setText("civil");
                sub6.setText("cip");
            }else if(student.getSemester() == 2){
                sub1.setText("Mathematics 2");
                sub2.setText("chemistry");
                sub3.setText("caed");
                sub4.setText("electronics");
                sub5.setText("ccp");
                sub6.setText("evs");
            }else if(student.getSemester() == 3){

            }else if(student.getSemester() == 4){

            }else if(student.getSemester() == 5){
                sub1.setText("Software engineering");
                sub2.setText("system Software");
                sub3.setText("operating system");
                sub4.setText("dbms");
                sub5.setText("computer networks 1");
                sub6.setText("flat");
            }else if(student.getSemester() == 6){

            }else if(student.getSemester() == 7){

            }else if(student.getSemester() == 8){

            }
        }else if (teacher.getBranch().equals("EC")){

            if(student.getSemester() == 1){
                sub1.setText("Mathematics 1");
                sub2.setText("Physics");
                sub3.setText("electrical");
                sub4.setText("elements of mechanical engg");
                sub5.setText("civil");
                sub6.setText("cip");
            }else if(student.getSemester() == 2){
                sub1.setText("Mathematics 2");
                sub2.setText("chemistry");
                sub3.setText("caed");
                sub4.setText("electronics");
                sub5.setText("ccp");
                sub6.setText("evs");
            }else if(student.getSemester() == 3){

            }else if(student.getSemester() == 4){

            }else if(student.getSemester() == 5){

            }else if(student.getSemester() == 6){

            }else if(student.getSemester() == 7){

            }else if(student.getSemester() == 8){

            }
        }else if (teacher.getBranch().equals("EE")){

            if(student.getSemester() == 1){
                sub1.setText("Mathematics 1");
                sub2.setText("Physics");
                sub3.setText("electrical");
                sub4.setText("elements of mechanical engg");
                sub5.setText("civil");
                sub6.setText("cip");
            }else if(student.getSemester() == 2){
                sub1.setText("Mathematics 2");
                sub2.setText("chemistry");
                sub3.setText("caed");
                sub4.setText("electronics");
                sub5.setText("ccp");
                sub6.setText("evs");
            }else if(student.getSemester() == 3){

            }else if(student.getSemester() == 4){

            }else if(student.getSemester() == 5){

            }else if(student.getSemester() == 6){

            }else if(student.getSemester() == 7){

            }else if(student.getSemester() == 8){

            }
        }else if (teacher.getBranch().equals("IT")){

            if(student.getSemester() == 1){
                sub1.setText("Mathematics 1");
                sub2.setText("Physics");
                sub3.setText("electrical");
                sub4.setText("elements of mechanical engg");
                sub5.setText("civil");
                sub6.setText("cip");
            }else if(student.getSemester() == 2){
                sub1.setText("Mathematics 2");
                sub2.setText("chemistry");
                sub3.setText("caed");
                sub4.setText("electronics");
                sub5.setText("ccp");
                sub6.setText("evs");
            }else if(student.getSemester() == 3){

            }else if(student.getSemester() == 4){

            }else if(student.getSemester() == 5){

            }else if(student.getSemester() == 6){

            }else if(student.getSemester() == 7){

            }else if(student.getSemester() == 8){

            }
        }else if (teacher.getBranch().equals("ME")){

            if(student.getSemester() == 1){
                sub1.setText("Mathematics 1");
                sub2.setText("Physics");
                sub3.setText("electrical");
                sub4.setText("elements of mechanical engg");
                sub5.setText("civil");
                sub6.setText("cip");
            }else if(student.getSemester() == 2){
                sub1.setText("Mathematics 2");
                sub2.setText("chemistry");
                sub3.setText("caed");
                sub4.setText("electronics");
                sub5.setText("ccp");
                sub6.setText("evs");
            }else if(student.getSemester() == 3){

            }else if(student.getSemester() == 4){

            }else if(student.getSemester() == 5){

            }else if(student.getSemester() == 6){

            }else if(student.getSemester() == 7){

            }else if(student.getSemester() == 8){

            }
        }else if (teacher.getBranch().equals("CIV")){

            if(student.getSemester() == 1){
                sub1.setText("Mathematics 1");
                sub2.setText("Physics");
                sub3.setText("electrical");
                sub4.setText("elements of mechanical engg");
                sub5.setText("civil");
                sub6.setText("cip");
            }else if(student.getSemester() == 2){
                sub1.setText("Mathematics 2");
                sub2.setText("chemistry");
                sub3.setText("caed");
                sub4.setText("electronics");
                sub5.setText("ccp");
                sub6.setText("evs");
            }else if(student.getSemester() == 3){

            }else if(student.getSemester() == 4){

            }else if(student.getSemester() == 5){

            }else if(student.getSemester() == 6){

            }else if(student.getSemester() == 7){

            }else if(student.getSemester() == 8){

            }
        }


        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sem1:
                student.setSubject(1);
                break;


            case R.id.sem2:
                student.setSubject(2);
                break;


            case R.id.sem3:
                student.setSubject(3);
                break;


            case R.id.sem4:
                student.setSubject(4);
                break;


            case R.id.sem5:
                student.setSubject(5);
                break;


            case R.id.sem6:
                student.setSubject(6);
                break;
        }

        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        fragment = new notes_unit_select();
        ft.replace(R.id.content_main,fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();
    }
}
