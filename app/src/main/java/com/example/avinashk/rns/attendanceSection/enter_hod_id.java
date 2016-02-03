package com.example.avinashk.rns.attendanceSection;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.avinashk.rns.R;


public class enter_hod_id extends Fragment
        implements View.OnClickListener{
    Button d_is,d_cs,d_ec,d_eee,d_it,d_mech,d_civ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.enter_hod_id,container,false);
        d_is = (Button)view.findViewById(R.id.d_is);
        d_cs = (Button)view.findViewById(R.id.d_cs);
        d_ec = (Button)view.findViewById(R.id.d_ec);
        d_eee = (Button)view.findViewById(R.id.d_eee);
        d_it = (Button)view.findViewById(R.id.d_it);
        d_mech = (Button)view.findViewById(R.id.d_mech);
        d_civ = (Button)view.findViewById(R.id.d_civ);

        d_is.setOnClickListener(this);
        d_cs.setOnClickListener(this);
        d_ec.setOnClickListener(this);
        d_eee.setOnClickListener(this);
        d_it.setOnClickListener(this);
        d_civ.setOnClickListener(this);
        d_mech.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        Department department = new Department();
        switch (v.getId()){
            case R.id.d_is:
                department.setBranch("IS");
                break;

            case R.id.d_cs:
                department.setBranch("CS");
                break;

            case R.id.d_ec:
                department.setBranch("EC");
                break;

            case R.id.d_eee:
                department.setBranch("EE");
                break;

            case R.id.d_it:
                department.setBranch("");
                break;

            case R.id.d_mech:
                department.setBranch("");
                break;

            case R.id.d_civ:
                department.setBranch("");
                break;
        }
        fragment = new hod_options();
        ft.replace(R.id.content_main, fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();
    }
}
