package com.example.raiven.itmd455final;

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
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Raiven on 4/27/2018.
 */

public class behaviortracking extends Activity {
    String student;
    String behavior;
    String date;
    String details;
    String action;
    int sid;

    TextView behaviorDisplay;
    TextView studentDisplay;
    EditText additional;
    EditText act;

    Button add;
    ArrayList<String> dets = new ArrayList<String>();
    SqlHelper db = new SqlHelper(this);
    private ArrayList<behavior> behaviors = new ArrayList<>();

    private static final String TAG = "BehaviorTracking";

    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.behaviortracking);


        mDisplayDate = (TextView) findViewById(R.id.tvDate);
        behaviorDisplay=(TextView)findViewById(R.id.behaveDisp);
        studentDisplay=(TextView)findViewById(R.id.studentDisp);
        additional=(EditText)findViewById(R.id.additional);
        add=(Button)findViewById(R.id.button2);
        act=(EditText)findViewById(R.id.action);

        behavior = getIntent().getStringExtra("behavior");
        student = getIntent().getStringExtra("name");
        sid = getIntent().getIntExtra("id",0);
   //     behaviorid=getIntent().getIntExtra("behavior_id");


        behaviorDisplay.setText(behavior);
        studentDisplay.setText(student);

        RadioGroup rGroup = (RadioGroup)findViewById(R.id.radioGroup);
        // This will get the radiobutton in the radiogroup that is checked
        RadioButton checkedRadioButton = (RadioButton)rGroup.findViewById(rGroup.getCheckedRadioButtonId());
    // This overrides the radiogroup onCheckListener
        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                // This will get the radiobutton that has changed in its check state
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(checkedId);
                // This puts the value (true/false) into the variable
                boolean isChecked = checkedRadioButton.isChecked();
                // If the radiobutton that has changed in check state is now checked...
                if (isChecked)
                {
                    // Changes the textview's text to "Checked: example radiobutton text"
                    dets.add("Location : "+checkedRadioButton.getText().toString());
                }
            }
        });


        RadioButton tb = (RadioButton) findViewById(R.id.teacherButton);
        tb.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                dets.add("teacher present");
            }
        });

        RadioButton pb = (RadioButton) findViewById(R.id.peersButton);
        pb.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                dets.add("peers present");
            }
        });

        RadioButton ab = (RadioButton) findViewById(R.id.adminButton);
        ab.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                dets.add("admin present");
            }
        });


        add.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {

                StringBuilder details = new StringBuilder();
                for (String s : dets)
                {
                    details.append(s);
                    details.append(",\t");
                }

                details.append(additional.getText().toString());
                action=act.getText().toString();

                Intent i = new Intent(getApplicationContext(), singular_student_display.class);
                i.putExtra("name", student);
                db.addBehaviors(new behavior(1,sid,date,behavior,details.toString(),action));

                startActivity(i);
            }
        });



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

                date = month + "/" + day + "/" + year;
                mDisplayDate.setText(date);

            }
        };



    }


}