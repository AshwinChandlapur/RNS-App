package com.example.avinashk.rns.settingsControl;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.avinashk.rns.R;
import com.example.avinashk.rns.update_std_teac_hod;


public class admin_password extends Fragment implements View.OnClickListener{
    Button adminP;
    EditText adminPasswordText;
    TextView adminPassword;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.update_db,container,false);

         adminP = (Button)view.findViewById(R.id.adminP);
         adminPasswordText = (EditText)view.findViewById(R.id.adminPasswordText);
         adminPassword = (TextView)view.findViewById(R.id.adminPassword);

         adminP.setOnClickListener(this);
         return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.adminP) {
            Fragment fragment;
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            String pass = adminPasswordText.getText().toString();
            if (!pass.equals("admin")) {
                adminPasswordText.setError("Invalid Password!");
            }else{
                fragment = new update_std_teac_hod();
                ft.replace(R.id.content_main,fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
            }
        }
    }
}
