package com.example.raiven.itmd455final;

/**
 * Created by Raiven on 4/27/2018.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;

public class BehaviorsSqlHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "DBStudents";
    //   private static final int DATABASE_VERSION = 16;
    public static final String TABLE_NAME = "behaviors";

    private static final String TABLE_BID = "behavior_id";
    private static final String TABLE_SID = "student_id";
    private static final String TABLE_DATE = "date";
    private static final String TABLE_CONDUCT = "conduct";
    private static final String TABLE_DETAILS = "details";
    private static final String TABLE_ACTION = "action_taken";

    public BehaviorsSqlHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 16);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.d("Table create", "table being built");
        sqLiteDatabase.execSQL("CREATE TABLE behaviors ( behavior_id INTEGER, student_id INTEGER, date TEXT, conduct TEXT, details, TEXT, action_taken TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int il) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS behaviors");
        this.onCreate(sqLiteDatabase);
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



        sqLiteDatabase.insert(TABLE_NAME, null, cv);

        sqLiteDatabase.close();
    }

    public ArrayList<behavior> getBehaviors()
    {
        ArrayList<behavior> behaviors = new ArrayList<>();

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cur = sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE_NAME, null);

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

        int i = sqLiteDatabase.update(TABLE_NAME, cv, TABLE_NAME + " = ?", new String[] {String.valueOf(behavior.getBehaviorId())});

        sqLiteDatabase.close();
        Log.d("Updating behavior:", behavior.toString());
        return i;
    }

    public void deleteBehavior(behavior behavior)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.delete(TABLE_BID, TABLE_NAME + " = ?", new String[] {String.valueOf(behavior.getBehaviorId())});

        sqLiteDatabase.close();
        Log.d("Deleted behavior:", behavior.toString());
    }
}
