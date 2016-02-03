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
import com.example.avinashk.rns.attendanceSection.MyDBHandler;
import com.example.avinashk.rns.attendanceSection.Student;
import com.example.avinashk.rns.update_student_contact;

public class student_att_report extends Fragment
implements  View.OnClickListener{
    TextView report2,att_report_usn,att_report_name,att_report_mobno,att_report_email,att_report_sem,att_report_branch,att_report_section,att_report_sub1,att_report_sub2,att_report_sub3,att_report_sub4,att_report_sub5,att_report_sub6;
    Button updateStudentDetails;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.student_att_report, container, false);
        att_report_usn = (TextView)view.findViewById(R.id.att_report_usn);
        att_report_name = (TextView)view.findViewById(R.id.att_report_name);
        att_report_mobno = (TextView)view.findViewById(R.id.att_report_mobno);
        att_report_email = (TextView)view.findViewById(R.id.att_report_email);
        att_report_sem = (TextView)view.findViewById(R.id.att_report_sem);
        att_report_branch = (TextView)view.findViewById(R.id.att_report_branch);
        att_report_section = (TextView)view.findViewById(R.id.att_report_section);
        att_report_sub1 = (TextView)view.findViewById(R.id.att_report_sub1);
        att_report_sub2 = (TextView)view.findViewById(R.id.att_report_sub2);
        att_report_sub3 = (TextView)view.findViewById(R.id.att_report_sub3);
        att_report_sub4 = (TextView)view.findViewById(R.id.att_report_sub4);
        att_report_sub5 = (TextView)view.findViewById(R.id.att_report_sub5);
        att_report_sub6 = (TextView)view.findViewById(R.id.att_report_sub6);
        report2 = (TextView)view.findViewById(R.id.report2);
        updateStudentDetails = (Button)view.findViewById(R.id.updateStudentDetails);
        Student student = new Student();
        MyDBHandler db = new MyDBHandler(getActivity(), null, null, 1);
        String usn = student.getUsn().toString();

        try{
            String res =  db.studentDetails(student);
            String[] resarray = res.split(" ");
            att_report_usn.setText(resarray[0]);
            att_report_name.setText(resarray[1]);
            att_report_mobno.setText(resarray[2]);
            att_report_email.setText(resarray[3]);
            att_report_sem.setText(resarray[4]);
            att_report_branch.setText(resarray[5]);
            att_report_section.setText(resarray[6]);
            att_report_sub1.setText(resarray[7]);
            att_report_sub2.setText(resarray[8]);
            att_report_sub3.setText(resarray[9]);
            att_report_sub4.setText(resarray[10]);
            att_report_sub5.setText(resarray[11]);
            att_report_sub6.setText(resarray[12]);
            String res2 = db.studentShortage(student);
            report2.setText(res2);
        }catch (Exception e){
            report2.setText("No USN match found");
        }
        updateStudentDetails.setOnClickListener(this);
        return view;
   }

    @Override
    public void onClick(View v) {
        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        if(v.getId() == R.id.updateStudentDetails){

            fragment = new update_student_contact();
            ft.replace(R.id.content_main,fragment);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();

        }
    }
}
