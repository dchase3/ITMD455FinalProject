package com.example.raiven.itmd455final;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Raiven on 4/27/2018.
 */

public class add_student extends Activity {
    EditText name;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_student);
        submit = (Button) findViewById(R.id.addStudentButton);
        name = (EditText) findViewById(R.id.addStudentName);
        String student=name.getText().toString();

        SqlHelper db = new SqlHelper(this);
        Log.d("Name:", "Raiven Johnson");

        db.addStudent(new student(student));

    }
}