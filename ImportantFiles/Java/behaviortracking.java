package com.example.devonald.itmd455finalproject;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
    ArrayList<String> behaviors = new ArrayList<String>();

    private static final String TAG = "BehaviorTracking";

    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.behaviortracking);
        mDisplayDate = (TextView) findViewById(R.id.tvDate);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        behaviortracking.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener, year, month, day); //when dialog open set to today's date

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //make background transparent
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateset: mm/dd/yyyy: " + month + "/" + day + "/" + year);

                String date = month + "/" + day + "/" + year;
                mDisplayDate.setText(date);
            }
        };




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
