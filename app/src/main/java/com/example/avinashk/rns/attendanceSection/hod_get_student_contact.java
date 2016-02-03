package com.example.avinashk.rns.attendanceSection;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.avinashk.rns.R;

/**
 * Created by avinashk on 10/28/15.
 */
public class hod_get_student_contact extends Fragment
        implements View.OnClickListener {

    Button get_contact_details;
    EditText hod_enter_usn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hod_get_student_contact, container, false);

        get_contact_details = (Button)view.findViewById(R.id.get_contact_details);
        hod_enter_usn = (EditText)view.findViewById(R.id.hod_enter_usn);

        get_contact_details.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        Student student = new Student();
        if(v.getId() == R.id.get_contact_details){
            String u = hod_enter_usn.getText().toString();
            student.setUsn(u);
            fragment = new hod_display_contact_details();
            ft.replace(R.id.content_main, fragment);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
    }
}