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
import com.example.avinashk.rns.attendanceSection.Teacher;


public class handle_nav_notes extends Fragment
implements  View.OnClickListener{

    Button computerScience,informationScience,electronicsCommunication,electrical,instrumentationTechnology,mechanical,civil;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.handle_nav_notes,container,false);

        computerScience = (Button)view.findViewById(R.id.computerScience);
        informationScience = (Button)view.findViewById(R.id.informationScience);
        electronicsCommunication = (Button)view.findViewById(R.id.electronicsCommunication);
        electrical = (Button)view.findViewById(R.id.electrical);
        instrumentationTechnology = (Button)view.findViewById(R.id.instrumentationTechnology);
        mechanical = (Button)view.findViewById(R.id.mechanical);
        civil = (Button)view.findViewById(R.id.civil);

        computerScience.setOnClickListener(this);
        informationScience.setOnClickListener(this);
        electronicsCommunication.setOnClickListener(this);
        electrical.setOnClickListener(this);
        instrumentationTechnology.setOnClickListener(this);
        mechanical.setOnClickListener(this);
        civil.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        Teacher teacher = new Teacher();

        switch (v.getId()){
            case R.id.computerScience:
                teacher.setBranch("CS");
                break;

            case R.id.informationScience:
                teacher.setBranch("IS");

                break;

            case R.id.electronicsCommunication:
                teacher.setBranch("EC");

                break;

            case R.id.electrical:
                teacher.setBranch("EE");
                break;

            case R.id.instrumentationTechnology:
                teacher.setBranch("IT");

                break;


            case R.id.mechanical:
                teacher.setBranch("ME");

                break;

            case R.id.civil:
                teacher.setBranch("CIV");
                break;
        }
        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        fragment = new notes_semester_select();
        ft.replace(R.id.content_main,fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();
    }
}
