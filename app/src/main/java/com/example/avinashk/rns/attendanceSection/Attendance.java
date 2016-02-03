package com.example.avinashk.rns.attendanceSection;

import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;

public class Attendance {

    private int teacherid, semester, total;
    private String section, subjectid;

    //Default Constructor
    public Attendance() {
    }

    //Constructor
    public Attendance(int teacherid, int semester, int total, String section, String subjectid) {
        this.teacherid = teacherid;
        this.semester = semester;
        this.total = total;
        this.section = section;
        this.subjectid = subjectid;
    }


    //SETTERS
    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }


    //GETTERS
    public int getTeacherid() {
        return teacherid;
    }

    public int getSemester() {
        return semester;
    }

    public int getTotal() {
        return total;
    }

    public String getSection() {
        return section;
    }

    public String getSubjectid() {
        return subjectid;
    }

    //Insert Data
    public void attendanceDataInput(SQLiteDatabase db) {
        ContentValues cValues = new ContentValues();

        cValues.put(MyDBHandler.COLUMN_TEACHERID, getTeacherid());
        cValues.put(MyDBHandler.COLUMN_SEMESTER, getSemester());
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, getSubjectid());
        cValues.put(MyDBHandler.COLUMN_SECTION, getSection());
        cValues.put(MyDBHandler.COLUMN_TOTAL, getTotal());
        db.insert(MyDBHandler.TABLE_ATTENDANCE, null, cValues);
    }
}

