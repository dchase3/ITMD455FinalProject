package com.example.raiven.itmd455final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Raiven on 4/27/2018.
 */

public class behaviortracking extends Activity {
    String student;
    String behavior;
    String extras;

    TextView behaviorDisplay;
    TextView studentDisplay;
    TextView additional;

    Button add;
    ArrayList<String> behaviors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.behaviortracking);



   //     extras = getIntent().getStringArrayExtra("extras");

        behavior = getIntent().getStringExtra("behavior");
        student = getIntent().getStringExtra("name");

        behaviors.add("1");
        behaviors.add(student);
        behaviors.add("blurting");
  //      behaviors.add(behavior);

        behaviorDisplay=(TextView)findViewById(R.id.behaveDisp);
        studentDisplay=(TextView)findViewById(R.id.studentDisp);
        additional=(TextView)findViewById(R.id.additional);

        add=(Button)findViewById(R.id.add);

 //       behaviorDisplay.setText(behavior);
        studentDisplay.setText(student);


        RadioButton tb = (RadioButton) findViewById(R.id.teacherButton);
        tb.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                behaviors.add("teacher");
            }
        });

        RadioButton pb = (RadioButton) findViewById(R.id.peersButton);
        pb.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                behaviors.add("peers");
            }
        });

        RadioButton ab = (RadioButton) findViewById(R.id.adminButton);
        ab.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                behaviors.add("admin");
            }
        });

        add.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), singular_student_display.class);
                i.putExtra("name", student);
                i.putExtra("behavior", behaviors);
                startActivity(i);
            }
        });


    }


}

