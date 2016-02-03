package com.example.avinashk.rns.attendanceSection;



import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.avinashk.rns.attendanceSection.MyDBHandler;

public class Teacher {

    private static int teacherid;
    private static String teachername, branch;

    //Default Constructor
    public Teacher() {
    }

    //Constructor
    public Teacher(int teacherid, String teachername, String branch) {
        this.teacherid = teacherid;
        this.teachername = teachername;
        this.branch = branch;
    }

    //SETTERS
    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    //GETTERS
    public int getTeacherid() {
        return teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public String getBranch() {
        return branch;
    }

    //Insert Data
    public void teacherDataInput (SQLiteDatabase db) {
        ContentValues cValues = new ContentValues();

        cValues.put(MyDBHandler.COLUMN_TEACHERID, getTeacherid());
        cValues.put(MyDBHandler.COLUMN_TEACHERNAME, getTeachername());
        cValues.put(MyDBHandler.COLUMN_BRANCH, getBranch());
        db.insert(MyDBHandler.TABLE_TEACHER, null, cValues);

    }
}
