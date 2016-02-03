package com.example.avinashk.rns;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.avinashk.rns.attendanceSection.MyDBHandler;
import com.example.avinashk.rns.attendanceSection.Student;


public class update_student_contact extends Fragment
implements  View.OnClickListener{

    Button updateStudentContact;
    EditText email,phone;
    TextView updateSubmit;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.update_student_contact,container,false);
        updateStudentContact = (Button)view.findViewById(R.id.updateStudentContact);
        email = (EditText)view.findViewById(R.id.email);
        phone = (EditText)view.findViewById(R.id.phone);
        updateSubmit = (TextView)view.findViewById(R.id.updateSubmit);
        updateStudentContact.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        MyDBHandler db = new MyDBHandler(getActivity(), null, null, 1);
        Student student = new Student();
        String mail = email.getText().toString();
        String number = phone.getText().toString();

        if(v.getId() == R.id.updateStudentContact){

                student.setEmail(mail);
                student.setPhoneno(number);
                if(db.studentUpdate(student)==0){
                    updateSubmit.setText("Update successful");

                }else {
                    updateSubmit.setText("Update unsuccessful");

                }

        }
    }
}
