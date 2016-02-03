package com.example.avinashk.rns.attendanceSection;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.avinashk.rns.R;

/**
 * Created by avinashk on 10/28/15.
 */
public class hod_final_att_report extends Fragment {

    TextView d,s,r;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hod_final_att_report,container,false);

        d = (TextView)view.findViewById(R.id.d);
        r = (TextView)view.findViewById(R.id.r);
        s = (TextView)view.findViewById(R.id.s);

            Student student = new Student();
            Department department = new Department();
        if(department.getBranch().equals("IS")){
            d.setText("INFORMATION SCIENCE");

        }else if(department.getBranch().equals("CS")){
            d.setText("COMPUTER SCIENCE");

        }else if(department.getBranch().equals("EC")){
            d.setText("ELECTRONICS AND COMMUNICATION");

        }else if(department.getBranch().equals("EE")){
            d.setText("ELECTICAL AND ELECTRONICS");

        }else {
            d.setText("");
        }
        s.setText("SEMESTER"+student.getSemester());




        MyDBHandler db = new MyDBHandler(getActivity(),null,null,1);
        String res3 = db.hodGetAttendance(department, student.getSemester());
        r.setText(res3);
        return view;
    }
}
