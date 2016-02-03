package com.example.avinashk.rns.attendanceSection;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.avinashk.rns.R;


public class hod_final_view_shortage extends Fragment {
    TextView seme,resu,ee;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hod_final_view_shortage,container,false);

        seme = (TextView)view.findViewById(R.id.seme);
        resu = (TextView)view.findViewById(R.id.resu);
        ee = (TextView)view.findViewById(R.id.ee);

        Student student = new Student();
        Department department = new Department();
        MyDBHandler db = new MyDBHandler(getActivity(),null,null,1);

        seme.setText("SEMESTER "+student.getSemester());
        if(department.getBranch().equals("IS")){
            ee.setText("INFORMATION SCIENCE");

        }else if(department.getBranch().equals("CS")){
            ee.setText("COMPUTER SCIENCE");

        }else if(department.getBranch().equals("EC")){
            ee.setText("ELECTRONICS AND COMMUNICATION");

        }else if(department.getBranch().equals("EE")){
            ee.setText("ELECTICAL AND ELECTRONICS");

        }else {
            ee.setText("");
        }

        try{
            String str = db.hodShortage(department,student.getSemester());
                resu.setText(str);

        }catch (Exception e){
            resu.setText("Data not available");
        }


        return view;
    }
}
