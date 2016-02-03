package com.example.avinashk.rns.attendanceSection;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class InsertData {

    public void insert(SQLiteDatabase db) {
        ContentValues cValues = new ContentValues();

        //DEPARTMENT TABLE
        cValues.put(MyDBHandler.COLUMN_BRANCH, "CS");
        cValues.put(MyDBHandler.COLUMN_HODNAME, "Dr. G.T Raju");
        db.insert(MyDBHandler.TABLE_DEPARTMENT, null, cValues);

        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        cValues.put(MyDBHandler.COLUMN_HODNAME, "Dr. M.V Sudamani");
        db.insert(MyDBHandler.TABLE_DEPARTMENT, null, cValues);

        cValues.put(MyDBHandler.COLUMN_BRANCH, "EC");
        cValues.put(MyDBHandler.COLUMN_HODNAME, "Dr. Vipula Singh");
        db.insert(MyDBHandler.TABLE_DEPARTMENT, null, cValues);

        cValues.put(MyDBHandler.COLUMN_BRANCH, "EE");
        cValues.put(MyDBHandler.COLUMN_HODNAME, "Dr. Sumathi S");
        db.insert(MyDBHandler.TABLE_DEPARTMENT, null, cValues);


        //TEACHER TABLE
        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 1);
        cValues.put(MyDBHandler.COLUMN_TEACHERNAME, "Leelavathi");
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        db.insert(MyDBHandler.TABLE_TEACHER, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 2);
        cValues.put(MyDBHandler.COLUMN_TEACHERNAME, "Navya");
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        db.insert(MyDBHandler.TABLE_TEACHER, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 3);
        cValues.put(MyDBHandler.COLUMN_TEACHERNAME, "Prakash");
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        db.insert(MyDBHandler.TABLE_TEACHER, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 4);
        cValues.put(MyDBHandler.COLUMN_TEACHERNAME, "Niharika");
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        db.insert(MyDBHandler.TABLE_TEACHER, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 5);
        cValues.put(MyDBHandler.COLUMN_TEACHERNAME, "Manoj");
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        db.insert(MyDBHandler.TABLE_TEACHER, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 6);
        cValues.put(MyDBHandler.COLUMN_TEACHERNAME, "Kusuma");
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        db.insert(MyDBHandler.TABLE_TEACHER, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 7);
        cValues.put(MyDBHandler.COLUMN_TEACHERNAME, "Iris");
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        db.insert(MyDBHandler.TABLE_TEACHER, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 8);
        cValues.put(MyDBHandler.COLUMN_TEACHERNAME, "Hema");
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        db.insert(MyDBHandler.TABLE_TEACHER, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 9);
        cValues.put(MyDBHandler.COLUMN_TEACHERNAME, "Soumya");
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        db.insert(MyDBHandler.TABLE_TEACHER, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 10);
        cValues.put(MyDBHandler.COLUMN_TEACHERNAME, "Niharika");
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        db.insert(MyDBHandler.TABLE_TEACHER, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 11);
        cValues.put(MyDBHandler.COLUMN_TEACHERNAME, "Rajkumar");
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        db.insert(MyDBHandler.TABLE_TEACHER, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 12);
        cValues.put(MyDBHandler.COLUMN_TEACHERNAME, "Suda");
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        db.insert(MyDBHandler.TABLE_TEACHER, null, cValues);


        //SUBJECT TABLE
        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS51");
        cValues.put(MyDBHandler.COLUMN_SUBJECTNAME, "Software Engineering");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        db.insert(MyDBHandler.TABLE_SUBJECT, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS52");
        cValues.put(MyDBHandler.COLUMN_SUBJECTNAME, "System Software");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        db.insert(MyDBHandler.TABLE_SUBJECT, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS53");
        cValues.put(MyDBHandler.COLUMN_SUBJECTNAME, "Operating Systems");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        db.insert(MyDBHandler.TABLE_SUBJECT, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS54");
        cValues.put(MyDBHandler.COLUMN_SUBJECTNAME, "DBMS");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        db.insert(MyDBHandler.TABLE_SUBJECT, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS55");
        cValues.put(MyDBHandler.COLUMN_SUBJECTNAME, "Computer Networks-1");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        db.insert(MyDBHandler.TABLE_SUBJECT, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS56");
        cValues.put(MyDBHandler.COLUMN_SUBJECTNAME, "FLAT");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        db.insert(MyDBHandler.TABLE_SUBJECT, null, cValues);

        cValues.clear();


        //ATTENDANCE TABLE
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 1);
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS51");
        cValues.put(MyDBHandler.COLUMN_SECTION, "A");
        cValues.put(MyDBHandler.COLUMN_TOTAL, 50);
        db.insert(MyDBHandler.TABLE_ATTENDANCE, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 2);
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS52");
        cValues.put(MyDBHandler.COLUMN_SECTION, "A");
        cValues.put(MyDBHandler.COLUMN_TOTAL, 50);
        db.insert(MyDBHandler.TABLE_ATTENDANCE, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 3);
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS53");
        cValues.put(MyDBHandler.COLUMN_SECTION, "A");
        cValues.put(MyDBHandler.COLUMN_TOTAL, 50);
        db.insert(MyDBHandler.TABLE_ATTENDANCE, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 4);
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS54");
        cValues.put(MyDBHandler.COLUMN_SECTION, "A");
        cValues.put(MyDBHandler.COLUMN_TOTAL, 50);
        db.insert(MyDBHandler.TABLE_ATTENDANCE, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 5);
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS55");
        cValues.put(MyDBHandler.COLUMN_SECTION, "A");
        cValues.put(MyDBHandler.COLUMN_TOTAL, 50);
        db.insert(MyDBHandler.TABLE_ATTENDANCE, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 6);
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS56");
        cValues.put(MyDBHandler.COLUMN_SECTION, "A");
        cValues.put(MyDBHandler.COLUMN_TOTAL, 50);
        db.insert(MyDBHandler.TABLE_ATTENDANCE, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 7);
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS51");
        cValues.put(MyDBHandler.COLUMN_SECTION, "B");
        cValues.put(MyDBHandler.COLUMN_TOTAL, 50);
        db.insert(MyDBHandler.TABLE_ATTENDANCE, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 8);
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS52");
        cValues.put(MyDBHandler.COLUMN_SECTION, "B");
        cValues.put(MyDBHandler.COLUMN_TOTAL, 50);
        db.insert(MyDBHandler.TABLE_ATTENDANCE, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 9);
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS53");
        cValues.put(MyDBHandler.COLUMN_SECTION, "B");
        cValues.put(MyDBHandler.COLUMN_TOTAL, 50);
        db.insert(MyDBHandler.TABLE_ATTENDANCE, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 10);
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS54");
        cValues.put(MyDBHandler.COLUMN_SECTION, "B");
        cValues.put(MyDBHandler.COLUMN_TOTAL, 50);
        db.insert(MyDBHandler.TABLE_ATTENDANCE, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 11);
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS55");
        cValues.put(MyDBHandler.COLUMN_SECTION, "B");
        cValues.put(MyDBHandler.COLUMN_TOTAL, 50);
        db.insert(MyDBHandler.TABLE_ATTENDANCE, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_TEACHERID, 12);
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_SUBJECTID, "10CS56");
        cValues.put(MyDBHandler.COLUMN_SECTION, "B");
        cValues.put(MyDBHandler.COLUMN_TOTAL, 50);
        db.insert(MyDBHandler.TABLE_ATTENDANCE, null, cValues);


        cValues.clear();


        //STUDENT TABLE
        cValues.put(MyDBHandler.COLUMN_USN, "1RN13IS001");
        cValues.put(MyDBHandler.COLUMN_NAME, "Abhay");
        cValues.put(MyDBHandler.COLUMN_PHONENO, "9900123456");
        cValues.put(MyDBHandler.COLUMN_EMAILID, "abhay@gmail.com");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        cValues.put(MyDBHandler.COLUMN_SECTION, "A");
        cValues.put(MyDBHandler.COLUMN_SUB1, 46);
        cValues.put(MyDBHandler.COLUMN_SUB2, 43);
        cValues.put(MyDBHandler.COLUMN_SUB3, 38);
        cValues.put(MyDBHandler.COLUMN_SUB4, 20);
        cValues.put(MyDBHandler.COLUMN_SUB5, 41);
        cValues.put(MyDBHandler.COLUMN_SUB6, 41);
        db.insert(MyDBHandler.TABLE_STUDENT, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_USN, "1RN13IS002");
        cValues.put(MyDBHandler.COLUMN_NAME, "Abhijeet");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        cValues.put(MyDBHandler.COLUMN_SECTION, "A");
        cValues.put(MyDBHandler.COLUMN_SUB1, 44);
        cValues.put(MyDBHandler.COLUMN_SUB2, 41);
        cValues.put(MyDBHandler.COLUMN_SUB3, 47);
        cValues.put(MyDBHandler.COLUMN_SUB4, 42);
        cValues.put(MyDBHandler.COLUMN_SUB5, 49);
        cValues.put(MyDBHandler.COLUMN_SUB6, 45);
        db.insert(MyDBHandler.TABLE_STUDENT, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_USN, "1RN13IS003");
        cValues.put(MyDBHandler.COLUMN_NAME, "Abhishek");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        cValues.put(MyDBHandler.COLUMN_SECTION, "A");
        cValues.put(MyDBHandler.COLUMN_SUB1, 41);
        cValues.put(MyDBHandler.COLUMN_SUB2, 42);
        cValues.put(MyDBHandler.COLUMN_SUB3, 48);
        cValues.put(MyDBHandler.COLUMN_SUB4, 41);
        cValues.put(MyDBHandler.COLUMN_SUB5, 50);
        cValues.put(MyDBHandler.COLUMN_SUB6, 39);
        db.insert(MyDBHandler.TABLE_STUDENT, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_USN, "1RN13IS062");
        cValues.put(MyDBHandler.COLUMN_NAME, "Rakshith");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        cValues.put(MyDBHandler.COLUMN_SECTION, "B");
        cValues.put(MyDBHandler.COLUMN_SUB1, 40);
        cValues.put(MyDBHandler.COLUMN_SUB2, 49);
        cValues.put(MyDBHandler.COLUMN_SUB3, 45);
        cValues.put(MyDBHandler.COLUMN_SUB4, 41);
        cValues.put(MyDBHandler.COLUMN_SUB5, 43);
        cValues.put(MyDBHandler.COLUMN_SUB6, 49);
        db.insert(MyDBHandler.TABLE_STUDENT, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_USN, "1RN13IS063");
        cValues.put(MyDBHandler.COLUMN_NAME, "Nivas");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        cValues.put(MyDBHandler.COLUMN_SECTION, "B");
        cValues.put(MyDBHandler.COLUMN_SUB1, 45);
        cValues.put(MyDBHandler.COLUMN_SUB2, 46);
        cValues.put(MyDBHandler.COLUMN_SUB3, 42);
        cValues.put(MyDBHandler.COLUMN_SUB4, 40);
        cValues.put(MyDBHandler.COLUMN_SUB5, 50);
        cValues.put(MyDBHandler.COLUMN_SUB6, 48);
        db.insert(MyDBHandler.TABLE_STUDENT, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_USN, "1RN13IS090");
        cValues.put(MyDBHandler.COLUMN_NAME, "Vignesh");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 5);
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        cValues.put(MyDBHandler.COLUMN_SECTION, "B");
        cValues.put(MyDBHandler.COLUMN_SUB1, 41);
        cValues.put(MyDBHandler.COLUMN_SUB2, 40);
        cValues.put(MyDBHandler.COLUMN_SUB3, 46);
        cValues.put(MyDBHandler.COLUMN_SUB4, 43);
        cValues.put(MyDBHandler.COLUMN_SUB5, 42);
        cValues.put(MyDBHandler.COLUMN_SUB6, 43);
        db.insert(MyDBHandler.TABLE_STUDENT, null, cValues);

       //new Data
        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_USN, "1RN14IS001");
        cValues.put(MyDBHandler.COLUMN_NAME, "Abhishek");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 3);
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        cValues.put(MyDBHandler.COLUMN_SECTION, "B");
        cValues.put(MyDBHandler.COLUMN_SUB1, 41);
        cValues.put(MyDBHandler.COLUMN_SUB2, 40);
        cValues.put(MyDBHandler.COLUMN_SUB3, 39);
        cValues.put(MyDBHandler.COLUMN_SUB4, 43);
        cValues.put(MyDBHandler.COLUMN_SUB5, 42);
        cValues.put(MyDBHandler.COLUMN_SUB6, 43);
        db.insert(MyDBHandler.TABLE_STUDENT, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_USN, "1RN14IS002");
        cValues.put(MyDBHandler.COLUMN_NAME, "AkshayRaj");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 3);
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        cValues.put(MyDBHandler.COLUMN_SECTION, "B");
        cValues.put(MyDBHandler.COLUMN_SUB1, 41);
        cValues.put(MyDBHandler.COLUMN_SUB2, 40);
        cValues.put(MyDBHandler.COLUMN_SUB3, 46);
        cValues.put(MyDBHandler.COLUMN_SUB4, 43);
        cValues.put(MyDBHandler.COLUMN_SUB5, 42);
        cValues.put(MyDBHandler.COLUMN_SUB6, 43);
        db.insert(MyDBHandler.TABLE_STUDENT, null, cValues);

        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_USN, "1RN14IS003");
        cValues.put(MyDBHandler.COLUMN_NAME, "Abhijit");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 3);
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        cValues.put(MyDBHandler.COLUMN_SECTION, "B");
        cValues.put(MyDBHandler.COLUMN_SUB1, 41);
        cValues.put(MyDBHandler.COLUMN_SUB2, 40);
        cValues.put(MyDBHandler.COLUMN_SUB3, 46);
        cValues.put(MyDBHandler.COLUMN_SUB4, 43);
        cValues.put(MyDBHandler.COLUMN_SUB5, 20);
        cValues.put(MyDBHandler.COLUMN_SUB6, 43);
        db.insert(MyDBHandler.TABLE_STUDENT, null, cValues);


        cValues.clear();
        cValues.put(MyDBHandler.COLUMN_USN, "1RN12IS003");
        cValues.put(MyDBHandler.COLUMN_NAME, "Abhijit");
        cValues.put(MyDBHandler.COLUMN_SEMESTER, 6);
        cValues.put(MyDBHandler.COLUMN_BRANCH, "IS");
        cValues.put(MyDBHandler.COLUMN_SECTION, "B");
        cValues.put(MyDBHandler.COLUMN_SUB1, 41);
        cValues.put(MyDBHandler.COLUMN_SUB2, 40);
        cValues.put(MyDBHandler.COLUMN_SUB3, 46);
        cValues.put(MyDBHandler.COLUMN_SUB4, 43);
        cValues.put(MyDBHandler.COLUMN_SUB5, 20);
        cValues.put(MyDBHandler.COLUMN_SUB6, 43);
        db.insert(MyDBHandler.TABLE_STUDENT, null, cValues);


        cValues.clear();
    }
}
