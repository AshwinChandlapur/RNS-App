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


public class update_new_student extends Fragment implements View.OnClickListener{

    Button submit_updated_details;
    EditText Name,Branch,Section,phone,email,sem,studentusn;
    TextView error_message;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.update_new_student, container, false);

        submit_updated_details = (Button)view.findViewById(R.id.submit_updated_details);
        Name = (EditText)view.findViewById(R.id.Name);
        Branch = (EditText)view.findViewById(R.id.Branch);
        Section = (EditText)view.findViewById(R.id.Section);
        phone = (EditText)view.findViewById(R.id.phone);
        email = (EditText)view.findViewById(R.id.email);
        sem = (EditText)view.findViewById(R.id.branch);
        error_message = (TextView)view.findViewById(R.id.error_message);
        studentusn = (EditText)view.findViewById(R.id.studentusn);

        submit_updated_details.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Student student = new Student();
        if(v.getId() == R.id.submit_updated_details){
            student.setUsn(studentusn.getText().toString());
            student.setName(Name.getText().toString());
            student.setBranch(Branch.getText().toString());
            student.setSection(Section.getText().toString());
            student.setPhoneno(phone.getText().toString());
            student.setEmail(email.getText().toString());
            String seme = sem.getText().toString();
            int semester = Integer.parseInt(seme);
            student.setSemester(semester);

            MyDBHandler db = new MyDBHandler(getActivity(),null,null,1);
            try{
                db.insertStudent(student);
                error_message.setText("Successsfully Inserted New Student");
            }catch (Exception e){
                error_message.setText("Failed to Insert Student");
            }
        }
    }
}
