package com.example.avinashk.rns.attendanceSection;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class Department {

    private static String branch= null, hodname=null;

    //Default Constructor
    public Department() {
    }


    //Constructor
    public Department(String branch, String hodname) {
        this.branch = branch;
        this.hodname = hodname;
    }


    //SETTERS
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setHodname(String hodname) {
        this.hodname = hodname;
    }


    //GETTERS
    public String getBranch() {
        return branch;
    }

    public String getHodName() {
        return hodname;
    }

    //Insert Data
    public void departmentDataInput(SQLiteDatabase db) {
        ContentValues cValues = new ContentValues();

        cValues.put(MyDBHandler.COLUMN_BRANCH, getBranch());
        cValues.put(MyDBHandler.COLUMN_HODNAME, getHodName());
        db.insert(MyDBHandler.TABLE_DEPARTMENT, null, cValues);

    }
}