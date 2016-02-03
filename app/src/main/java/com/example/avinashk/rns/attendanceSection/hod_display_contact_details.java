package com.example.avinashk.rns.attendanceSection;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.avinashk.rns.R;


public class hod_display_contact_details extends Fragment {

    TextView usn_hod_details, res_hod_contact_details;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hod_display_contact_details, container, false);

        usn_hod_details = (TextView) view.findViewById(R.id.usn_hod_details);
        res_hod_contact_details = (TextView) view.findViewById(R.id.res_hod_contact_details);

        Student student = new Student();
        Department department = new Department();
        MyDBHandler db = new MyDBHandler(getActivity(),null,null,1);

        usn_hod_details.setText(student.getUsn().toString()+" DETAILS");
        String res1 = db.hodGetContact(department,student);
        res_hod_contact_details.setText(res1);
        return view;

    }
}
