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

/**
 * Created by avinashk on 10/28/15.
 */
public class teacher_attendance_report extends Fragment implements View.OnClickListener {
    TextView teacher_attendance_details,teacher_cc,teacher_subject_name;
    Button teacher_shortage;
    Teacher teacher = new Teacher();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.teacher_attendance_report,container,false);
        teacher_shortage = (Button)view.findViewById(R.id.teacher_shortage);

        teacher_subject_name = (TextView) view.findViewById(R.id.teacher_Subject_Name);
        teacher_attendance_details = (TextView) view.findViewById(R.id.teacher_attendance_details);
        teacher_cc = (TextView) view.findViewById(R.id.teacher_cc);

        MyDBHandler db = new MyDBHandler(getActivity(),null,null,1);

        try{
            String subject = db.showSubject(teacher);
            teacher_subject_name.setText(subject);

            String teach = db.showTeacher(teacher);
            teacher_subject_name.append(teach);

            String report = db.teacherGetAttendance(teacher);
            teacher_attendance_details.setText(report);
        }catch(Exception e){
            teacher_attendance_details.setText("TEACHER DOES NOT EXIST");
        }

        teacher_shortage.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        if( v.getId() == R.id.teacher_shortage){

            fragment = new teacher_view_shortage();
            ft.replace(R.id.content_main, fragment);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
    }
}
