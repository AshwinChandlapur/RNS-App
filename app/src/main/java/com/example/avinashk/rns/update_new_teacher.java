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
import com.example.avinashk.rns.attendanceSection.Teacher;


public class update_new_teacher extends Fragment implements View.OnClickListener {
    Button submit_teacher_update;
    EditText n_teacher_name,n_teacher_id,n_teacher_branch;
    TextView teacher_message;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.update_new_teacher,container,false);

        n_teacher_name = (EditText)view.findViewById(R.id.n_teacher_name);
        n_teacher_id = (EditText) view.findViewById(R.id.n_teacher_id);
        n_teacher_branch = (EditText)view.findViewById(R.id.n_teacher_branch);

        teacher_message = (TextView)view.findViewById(R.id.teacher_message);

        submit_teacher_update = (Button) view.findViewById(R.id.submit_teacher_update);

        submit_teacher_update.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Teacher teacher = new Teacher();
        if(v.getId() == R.id.submit_teacher_update){
            teacher.setTeachername(n_teacher_name.getText().toString());
            teacher.setBranch(n_teacher_branch.getText().toString());
            int tid = Integer.parseInt(n_teacher_id.getText().toString());
            teacher.setTeacherid(tid);

            MyDBHandler db = new MyDBHandler(getActivity(),null,null,1);
            try{
                db.insertTeacher(teacher);
                teacher_message.setText("Successfully Updated!");
            }catch (Exception e){
                teacher_message.setText("Unsuccessful!!");
            }
        }
    }
}
