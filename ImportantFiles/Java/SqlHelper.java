package com.example.raiven.itmd455final;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;
import java.util.ArrayList;

public class SqlHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "DB6";
    //   private static final int DATABASE_VERSION = 16;
    public static final String TABLE_STUDENTS = "students";
    public static final String TABLE_BEHAVIORS = "behaviors";

    // columns for students table
    private static final String TABLE_NAME = "name";
    private static final String TABLE_ID = "id";

    //columns for behaviors table
    private static final String TABLE_BID = "behavior_id";
    private static final String TABLE_SID = "student_id";
    private static final String TABLE_DATE = "date";
    private static final String TABLE_CONDUCT = "conduct";
    private static final String TABLE_DETAILS = "details";
    private static final String TABLE_ACTION = "action_taken";

    public SqlHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 16);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.d("Table create", "table being built");
        sqLiteDatabase.execSQL("CREATE TABLE students ( id INTEGER, name TEXT)");
        sqLiteDatabase.execSQL("CREATE TABLE behaviors ( behavior_id INTEGER, student_id INTEGER, date TEXT, conduct TEXT, details TEXT, action_taken TEXT )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int il) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS students");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS behaviors");
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


    public void addBehaviors(behavior behavior)
    {
        Log.d("Added behaviors:", behavior.toString());

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(TABLE_BID, behavior.getBehaviorId());
        cv.put(TABLE_SID, behavior.getStudentId());
        cv.put(TABLE_DATE, behavior.getDate());
        cv.put(TABLE_CONDUCT, behavior.getConduct());
        cv.put(TABLE_DETAILS, behavior.getDetails());
        cv.put(TABLE_ACTION, behavior.getAction());


        Log.d("Track", "attempting insert");
        sqLiteDatabase.insert(TABLE_BEHAVIORS, null, cv);

        sqLiteDatabase.close();
    }



    public ArrayList<student> getAllStudents()
    {
        ArrayList<student> students = new ArrayList<>();

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
                students.add(s);
            }
            while (cur.moveToNext());
        }
        Log.d("Checking all students:", students.toString());
        return students;
    }


    public ArrayList<behavior> getBehaviors()
    {
        ArrayList<behavior> behaviors = new ArrayList<>();

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cur = sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE_BEHAVIORS, null);

        behavior b = null;
        if (cur.moveToFirst())
        {
            do
            {
                b = new behavior();
                b.setBehaviorId(Integer.parseInt(cur.getString(0)));
                b.setStudentId(Integer.parseInt(cur.getString(1)));
                b.setDate(cur.getString(2));
                b.setConduct(cur.getString(3));
                b.setDetails(cur.getString(4));
                b.setAction(cur.getString(5));
                behaviors.add(b);
            }
            while (cur.moveToNext());
        }
        Log.d("Checking behaviors:", behaviors.toString());
        return behaviors;
    }



    public int updateStudent(student student)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(TABLE_ID, student.getId());
        cv.put(TABLE_NAME, student.getName());

        int i = sqLiteDatabase.update(TABLE_STUDENTS, cv, TABLE_ID+ " = ?", new String[] {String.valueOf(student.getId())});

        sqLiteDatabase.close();
        Log.d("Updating book:", student.toString());
        return i;
    }


    public int updateBehavior(behavior behavior)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(TABLE_BID, behavior.getBehaviorId());
        cv.put(TABLE_SID, behavior.getStudentId());
        cv.put(TABLE_DATE, behavior.getDate());
        cv.put(TABLE_CONDUCT, behavior.getConduct());
        cv.put(TABLE_DETAILS, behavior.getDetails());
        cv.put(TABLE_ACTION, behavior.getAction());

        int i = sqLiteDatabase.update(TABLE_BEHAVIORS, cv, TABLE_BID + " = ?", new String[] {String.valueOf(behavior.getBehaviorId())});

        sqLiteDatabase.close();
        Log.d("Updating behavior:", behavior.toString());
        return i;
    }


    public void deleteStudent(int id)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.delete(TABLE_STUDENTS, TABLE_ID + " = ?", new String[] {String.valueOf(id)});

        sqLiteDatabase.close();
    }

    public void deleteBehavior(behavior behavior)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.delete(TABLE_BEHAVIORS, TABLE_BID + " = ?", new String[] {String.valueOf(behavior.getBehaviorId())});

        sqLiteDatabase.close();
        Log.d("Deleted behavior:", behavior.toString());
    }

    public ArrayList<behavior> getStudentBehaviors(int id)
    {
        ArrayList<behavior> behaviors = new ArrayList<>();
        String whereclause=" WHERE "+ TABLE_SID + " = ? ";
        String[] values={String.valueOf(id)};
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cur = sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE_BEHAVIORS + whereclause, new String[] {String.valueOf(id)});

        behavior b = null;
        if (cur.moveToFirst())
        {
            do
            {
                b = new behavior();
                b.setBehaviorId(Integer.parseInt(cur.getString(0)));
                Log.d("bid",cur.getString(0));
                b.setStudentId(Integer.parseInt(cur.getString(1)));
                Log.d("sid",cur.getString(1));
                b.setDate(cur.getString(2));
                Log.d("date",cur.getString(2));
                b.setConduct(cur.getString(3));
                Log.d("date",cur.getString(3));
                b.setDetails(cur.getString(4));
                b.setAction(cur.getString(5));
                behaviors.add(b);
            }
            while (cur.moveToNext());
        }
        Log.d("Checking behaviors:", behaviors.toString());
        return behaviors;
    }
}
