package com.example.raiven.itmd455final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
    String student;
    SqlHelper db = new SqlHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_student);
        submit = (Button) findViewById(R.id.addStudentButton);
        name = (EditText) findViewById(R.id.addStudentName);

        //on click sends entered name to be inserted in the database
        submit.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                student=name.getText().toString();
                Intent i = new Intent(getApplicationContext(), display.class);
                db.addStudent(new student(student));
                startActivity(i);
            }
        });

    }
}