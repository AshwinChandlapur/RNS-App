package com.example.avinashk.rns.attendanceSection;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.avinashk.rns.R;
import com.example.avinashk.rns.attendanceSection.MyDBHandler;
import com.example.avinashk.rns.attendanceSection.Teacher;

/**
 * Created by avinashk on 10/28/15.
 */
public class teacher_view_shortage extends Fragment {
    TextView teacher_shortage_report;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.teacher_view_shortage,container,false);


        Teacher teacher = new Teacher();
        teacher_shortage_report = (TextView)view.findViewById(R.id.teacher_shortage_report);

        MyDBHandler db = new MyDBHandler(getActivity(),null,null,1);

        String shortage = db.teacherShortage(teacher);
        teacher_shortage_report.setText(shortage);

        return view;
    }
}
