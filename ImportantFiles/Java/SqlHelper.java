//first package will be different on each computer make use you add yours
//and comment out the others on your computer.
package com.example.densi.itmd455finalproject;
//package com.example.ssiruuk.itmd455finalproject;
//package com.example.raiven.itmd455final;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;

import java.util.ArrayList;

public class SqlHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "DBStudents";
    //   private static final int DATABASE_VERSION = 16;
    public static final String TABLE_STUDENTS = "students";

    private static final String TABLE_NAME = "name";
    private static final String TABLE_ID = "id";

    public SqlHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 16);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.d("Table create", "table being built");
        sqLiteDatabase.execSQL("CREATE TABLE students ( id INTEGER, name TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int il) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS students");
        this.onCreate(sqLiteDatabase);
    }

    public void addStudent(student student)
    {
        Log.d("Added student:", student.toString());

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(TABLE_ID, student.getId());
        cv.put(TABLE_NAME, student.getName());



        sqLiteDatabase.insert(TABLE_STUDENTS, null, cv);

        sqLiteDatabase.close();
    }

    public ArrayList<student> getAllBooks()
    {
        ArrayList<student> books = new ArrayList<>();

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cur = sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE_STUDENTS, null);

        student s = null;
        if (cur.moveToFirst())
        {
            do
            {
                s = new student();
                s.setId(Integer.parseInt(cur.getString(0)));
                s.setName(cur.getString(1));
                books.add(s);
            }
            while (cur.moveToNext());
        }
        Log.d("Checking all books:", books.toString());
        return books;
    }

    public int updateStudent(student student)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(TABLE_ID, student.getId());
        cv.put(TABLE_NAME, student.getName());

        int i = sqLiteDatabase.update(TABLE_STUDENTS, cv, TABLE_NAME + " = ?", new String[] {String.valueOf(student.getId())});

        sqLiteDatabase.close();
        Log.d("Updating book:", student.toString());
        return i;
    }

    public void deleteStudent(student student)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.delete(TABLE_STUDENTS, TABLE_NAME + " = ?", new String[] {String.valueOf(student.getId())});

        sqLiteDatabase.close();
        Log.d("Deleted book:", student.toString());
    }
}