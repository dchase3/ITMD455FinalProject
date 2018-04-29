# Behavior Tracking

ITMD 455: Intelligence Device Applications - Final Project

## Team
- Raiven Johnson
- Dennis Chase
- Devonald Manney

## Project Description
Our Application is being made to help teachers track the good and bad behaviors of students within their classes with ease.

## Abstract
This documentation contains all source code, layout screens and snapshots of the app running. It starts with the code documentation and ends with the screenshots.

<!-- TOC depthFrom:1 depthTo:2 withLinks:1 updateOnSave:1 orderedList:0 -->

- [JAVA Code](#java-code)
  - [MainActivity](#mainactivity.java)
  - [badbehaviors](#badbehaviors.java)
  - [behaviortracking](#behaviortracking.java)
  - [display](#display.java)
  - [goodbehaviors](#goodbehaviors.java)
  - [singular_student_display](#singular_student_display.java)
  - [SqlHelper](#sqlhelper.java)
  - [student](#student.java)
  - [add_student](#add_student.java)
  - [behaviors](#behaviors.java)
  - [delete_display](#delete_display.java)
  - [stats](#stats.java)
- [XML Code](#xml-code)
  - [activity_main](#activity_main.xml)
  - [add_student](#add_student.xml)
  - [badbehaviors](#badbehaviors.xml)
  - [behaviortracking](#behaviortracking.xml)
  - [display](#display.xml)
  - [displaystudents](#displaystudents.xml)
  - [goodbehaviors](#goodbehaviors.xml)
  - [singular_student_display](#singular_student_display.xml)
  - [singular_student_display_list](#singular_student_display_list.xml)
- [Screenshots](#screenshots)

<!-- /TOC -->

# Code Documentation

## Java Code

The following section includes all java code with small descriptions of each file.

### MainActivity.java

Starting file, includes the login.

```java
//first package will be different on each computer make use you add yours
//and comment out the others on your computer.
package com.example.densi.itmd455finalproject;
//package com.example.ssiruuk.itmd455finalproject;
//package com.example.raiven.itmd455final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        submit = findViewById(R.id.badbehavior);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if(validate(user,pass)==true) {
                    Intent i = new Intent(MainActivity.this, display.class);
                    startActivity(i);
                }
            }
        });
    }

    public boolean validate(String username, String password) {
        //simple test to see if fields were populated
        if ((username.equals("admin"))&&(password.equals("admin"))){
            return true;
        } else {
            Toast.makeText(MainActivity.this, "Invalid credentials",
                Toast.LENGTH_LONG).show();
            return false;
        }
    }
}
```

### badbehaviors.java

Connects the layout buttons for bad behaviors into the java code.

```java
//first package will be different on each computer make use you add yours
//and comment out the others on your computer.
package com.example.densi.itmd455finalproject;
//package com.example.ssiruuk.itmd455finalproject;
//package com.example.raiven.itmd455final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class badbehaviors extends Activity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
    String student;
    int sid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.badbehaviors);

        student = getIntent().getStringExtra("name");
        sid = getIntent().getIntExtra("id",0);

        btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn1.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn2.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn3 = (Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn3.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn4 = (Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn4.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn5 = (Button)findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn5.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn6 = (Button)findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn6.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn7 = (Button)findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn7.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn8 = (Button)findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn8.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn9 = (Button)findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn9.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn10 = (Button)findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn10.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn11 = (Button)findViewById(R.id.button11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn11.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn12 = (Button)findViewById(R.id.button12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn12.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn13 = (Button)findViewById(R.id.button13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn13.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn14 = (Button)findViewById(R.id.add);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn14.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn15 = (Button)findViewById(R.id.button15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn15.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

    }
}
```

### behaviortracking.java

```java
//first package will be different on each computer make use you add yours
//and comment out the others on your computer.
package com.example.densi.itmd455finalproject;
//package com.example.ssiruuk.itmd455finalproject;
//package com.example.raiven.itmd455final;

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
```

### display.java

displays the list of students.

```java
//first package will be different on each computer make use you add yours
//and comment out the others on your computer.
package com.example.densi.itmd455finalproject;
//package com.example.ssiruuk.itmd455finalproject;
//package com.example.raiven.itmd455final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Devonald on 4/22/2018.
 */

public class display extends Activity {

    TextView textView;
    List<student> list;
    ListView listView;
    SimpleAdapter listAdapter;
    Button add;
    Button remove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        textView = (TextView)findViewById(R.id.behaveDisp);


        listView = (ListView)findViewById(R.id.students);

        SqlHelper db = new SqlHelper(this);

        //only execute the addStudent lines the first time you run the program
        //otherwise your table with populate the same values everytime you run it
   //     db.addStudent(new student("Darez Phillips"));
    //    db.addStudent(new student("Raiven Johnson"));
    //    db.addStudent(new student("Dennis Chase"));
     //   db.addStudent(new student("Devonald Manney"));
      //  db.addStudent(new student("Peisong Huang"));

        list = db.getAllStudents();



        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        //populates hashmap with names of the students in the database
        for(int i=0;i<list.size();i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", list.get(i).getName());

            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "txt","cur" };

        // Ids of views in listview_layout
        int[] to = {R.id.txt};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.displaystudents, from, to);

        // Getting a reference to listview of main.xml layout file
        ListView listView = ( ListView ) findViewById(R.id.students);

        // Setting the adapter to the listView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                //passes student name and student id to the next activity
                String str = list.get(position).getName();
                int sid = list.get(position).getId();
                Intent i = new Intent(display.this, singular_student_display.class);
                i.putExtra("name", str);
                i.putExtra("id", sid);
                startActivity(i);

            }
        });

        //leads to screen to add a new student
        add = (Button)findViewById(R.id.button2);
        add.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), add_student.class);
                startActivity(i);
            }
        });

        remove = (Button)findViewById(R.id.button3);
        remove.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), delete_display.class);
                startActivity(i);
            }
        });


    }
}
```

### goodbehaviors.java

Connects the layout buttons for good behaviors into the java code.

```java
//first package will be different on each computer make use you add yours
//and comment out the others on your computer.
package com.example.densi.itmd455finalproject;
//package com.example.ssiruuk.itmd455finalproject;
//package com.example.raiven.itmd455final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class goodbehaviors extends Activity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7,btn8,btn9,btn10,btn11,btn12,btn13;
    String student;
    int sid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goodbehaviors);

        student = getIntent().getStringExtra("name");
        sid = getIntent().getIntExtra("id",0);

        btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn1.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn2.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn3 = (Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn3.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn4 = (Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn4.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn5 = (Button)findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn5.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn6 = (Button)findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn6.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn7 = (Button)findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn7.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn8 = (Button)findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn8.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn9 = (Button)findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn9.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn10 = (Button)findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn10.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn11 = (Button)findViewById(R.id.button11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn11.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn12 = (Button)findViewById(R.id.button12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn12.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        btn13 = (Button)findViewById(R.id.button13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn13.getText());
                intent.putExtra("name", student);
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });
    }
}
```

### singular_student_display.java

Connects layout widgets for the display of a single students behavior's tracked.

```java
//first package will be different on each computer make use you add yours
//and comment out the others on your computer.
package com.example.densi.itmd455finalproject;
//package com.example.ssiruuk.itmd455finalproject;
//package com.example.raiven.itmd455final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class singular_student_display extends Activity {
    TextView name;
    Button good;
    Button bad;
    Button stats;
    int sid;
    ArrayList<behavior> behaviors= new ArrayList<behavior>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singular_student_display);
        SqlHelper db = new SqlHelper(this);

        name = (TextView)findViewById(R.id.studentname);

        String student = getIntent().getStringExtra("name");
        sid = getIntent().getIntExtra("id",0);


        name.setText(student);

        good = (Button)findViewById(R.id.goodbehvaior);
        bad = (Button)findViewById(R.id.badbehavior);



        good.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), goodbehaviors.class);
                intent.putExtra("name", name.getText());
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

        bad.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), badbehaviors.class);
                intent.putExtra("name", name.getText());
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });

/*        stats.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), stats.class);
                intent.putExtra("name", name.getText());
                intent.putExtra("id", sid);
                startActivity(intent);
            }
        });
*/
        behaviors=db.getStudentBehaviors(sid);
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int j=0;j<behaviors.size();j++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("date",  behaviors.get(j).getDate());
            hm.put("conduct", behaviors.get(j).getConduct());
            hm.put("details", behaviors.get(j).getDetails());
            hm.put("action", behaviors.get(j).getAction());
            //      hm.put("cur","Currency : " + ListItemsName2[i]);

            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "date","conduct","details", "action" };

        // Ids of views in listview_layout
        int[] to = { R.id.date,R.id.conduct,R.id.details, R.id.action};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.singular_student_display_list, from, to);

        // Getting a reference to listview of main.xml layout file
        ListView listView = ( ListView ) findViewById(R.id.behaviorlist);

        // Setting the adapter to the listView
        listView.setAdapter(adapter);





    }
}
```

### SqlHelper.java

Connected the project to the database to save data

```java
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
```

### student.java

Contains the object variables for students.

```java
//first package will be different on each computer make use you add yours
//and comment out the others on your computer.
package com.example.densi.itmd455finalproject;
//package com.example.ssiruuk.itmd455finalproject;
//package com.example.raiven.itmd455final;

public class student {

    private int id;
    private String name;

    public student()
    {
        id++;
        name="Stacey Adams";
    }
    public student(String name)
    {
        super();
        this.name=name;
        id++;
    }

     public int getId() {
            return id;
    }

    public void setId(int i) {
            id = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String toString()
    {
        return "Id : " + id + "\tName: " + name;
    }
}
```

### add_student.java

added object student to the database.

```java
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
```

### behavior.java

```java
package com.example.raiven.itmd455final;

/**
 * Created by Raiven on 4/28/2018.
 */


public class behavior {

    private int behaviorId;
    private int studentId;
    private String date;
    private String conduct;
    private String details;
    private String action;

    public behavior()
    {
        behaviorId++;
        studentId=3;
        date="1/21/18";
        conduct="Blurting";
        details="Repeatedly using the F word";
        action="Sent in hall way plus verbal warning";
    }
    public behavior(int bid,int id, String date, String conduct, String details, String action)
    {
        super();
        behaviorId=bid;
        this.studentId=id;
        this.date=date;
        this.conduct=conduct;
        this.details= details;
        this.action=action;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String d) {
        date = d;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int i) {
        studentId = i;
    }

    public int getBehaviorId() {  return behaviorId; }

    public void setBehaviorId(int i) {
        behaviorId = i;
    }

    public String getConduct() {
        return conduct;
    }

    public void setConduct (String c) {
        conduct = c;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String d) {
        details = d;
    }


    public String getAction() {
        return action;
    }

    public void setAction(String a) {
        action = a;
    }


    public String toString()
    {
        return "bId : " + behaviorId + "\tsid: " + studentId+"\tconduct : " + conduct + "\tdetails: " + details+"\tdate : " + date + "\taction taken: " + action;
    }
}
```

### delete_display.java

```java
package com.example.raiven.itmd455final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Raiven on 4/29/2018.
 */

public class delete_display extends Activity {

    TextView textView;
    List<student> list;
    ListView listView;
    SimpleAdapter listAdapter;
    Button add;
    Button remove;
    SqlHelper db = new SqlHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_display);
        listView = (ListView)findViewById(R.id.students);

        list = db.getAllStudents();



        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        //populates hashmap with names of the students in the database
        for(int i=0;i<list.size();i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", list.get(i).getName());

            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = {"txt"};

        // Ids of views in listview_layout
        int[] to = {R.id.txt};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.displaystudents, from, to);

        // Getting a reference to listview of main.xml layout file
        ListView listView = ( ListView ) findViewById(R.id.students);

        // Setting the adapter to the listView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                //passes student name and student id to the next activity
                String str = list.get(position).getName();
                int sid = list.get(position).getId();
                Intent i = new Intent(getApplicationContext(), display.class);
                db.deleteStudent(sid);
                startActivity(i);

            }
        });

        //leads to screen to add a new student
        add = (Button)findViewById(R.id.button2);
        add.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), add_student.class);
                startActivity(i);
            }
        });

        remove = (Button)findViewById(R.id.button3);
        remove.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), add_student.class);
                startActivity(i);
            }
        });


    }
}
```

### stats.java

```java
package com.example.raiven.itmd455final;

import android.app.Activity;
import android.os.Bundle;
/*
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

/**
 * Created by Raiven on 4/29/2018.
 */

public class stats extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats);

/*
        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3)
        });
        graph.addSeries(series);
*/
    }

}
```



## XML Code

Includes the XML files and code as well as screenshots of layout files.

### activity_main.xml

![Figure1](https://github.com/dchase3/ITMD455FinalProject/blob/master/ImportantFiles/Images/figure1.png)

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#1e1e1e"
    tools:context="com.example.densi.itmd455finalproject.MainActivity">


    <ImageView
        android:id="@+id/imageView"
        android:layout_width="106dp"
        android:layout_height="95dp"
        android:layout_marginBottom="5dp"
        android:layout_marginEnd="200dp"
        android:layout_marginStart="200dp"
        android:layout_marginTop="74dp"
        app:layout_constraintBottom_toTopOf="@+id/textView"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@mipmap/ic_launcher" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="110dp"
        android:layout_height="26dp"
        android:layout_marginBottom="95dp"
        android:layout_marginEnd="212dp"
        android:layout_marginStart="216dp"
        android:layout_marginTop="5dp"
        android:text="LOGIN"
        android:textColor="#00b0ca"
        android:textAlignment="center"
        android:textSize="18sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@+id/editText"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/imageView" />

    <EditText
        android:id="@+id/editText"
        android:layout_width="340dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="45dp"
        android:layout_marginStart="45dp"
        android:layout_marginTop="92dp"
        android:ems="10"
        android:textColor="#00b0ca"
        android:hint="Username"
        android:inputType="textPersonName"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView" />

    <EditText
        android:id="@+id/editText2"
        android:layout_width="340dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="42dp"
        android:layout_marginEnd="45dp"
        android:layout_marginStart="45dp"
        android:layout_marginTop="35dp"
        android:ems="10"
        android:textColor="#00b0ca"
        android:hint="Password"
        android:inputType="textPassword"
        app:layout_constraintBottom_toTopOf="@+id/badbehavior"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editText" />

    <Button
        android:id="@+id/badbehavior"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="225dp"
        android:layout_marginStart="225dp"
        android:layout_marginTop="42dp"
        android:text="SUBMIT"
        android:textColor="#1e1e1e"
        android:background="#00b0ca"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editText2" />
</android.support.constraint.ConstraintLayout>
```

### add_student.xml

![Figure2](https://github.com/dchase3/ITMD455FinalProject/blob/master/ImportantFiles/Images/figure2.png)

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#1e1e1e">

    <TextView
        android:id="@+id/textView6"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="16dp"
        android:layout_marginTop="16dp"
        android:text="Add Student Name:"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Display1"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/addStudentName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="16dp"
        android:layout_marginTop="16dp"
        android:ems="10"
        android:textColor="#00b0ca"
        android:inputType="textPersonName"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView6" />

    <Button
        android:id="@+id/addStudentButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="18dp"
        android:layout_marginEnd="149dp"
        android:layout_marginStart="147dp"
        android:background="#00b0ca"
        android:text="Submit"
        android:textAppearance="@style/TextAppearance.AppCompat.Display2"
        android:textColor="#1e1e1e"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

</android.support.constraint.ConstraintLayout>
```

### badbehaviors.xml

![Figure3](https://github.com/dchase3/ITMD455FinalProject/blob/master/ImportantFiles/Images/figure3.png)

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/constraintLayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#1e1e1e">

    <Button
        android:id="@+id/button1"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="16dp"
        android:text="Classwork Incomplete"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toStartOf="@+id/button2"
        app:layout_constraintHorizontal_bias="0.4"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView8" />

    <Button
        android:id="@+id/button2"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="16dp"
        android:text="Disrespectful"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button1"
        app:layout_constraintTop_toBottomOf="@+id/textView8" />

    <Button
        android:id="@+id/button3"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="4dp"
        android:text="Distracts Others"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toStartOf="@+id/button4"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button1" />

    <Button
        android:id="@+id/button4"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="4dp"
        android:text="Interrupter"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button3"
        app:layout_constraintTop_toBottomOf="@+id/button2" />

    <Button
        android:id="@+id/button5"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="4dp"
        android:text="Late"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toStartOf="@+id/button6"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button3" />

    <Button
        android:id="@+id/button6"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="4dp"
        android:text="No Break Return"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button5"
        app:layout_constraintTop_toBottomOf="@+id/button4" />

    <Button
        android:id="@+id/button7"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="4dp"
        android:text="Left during instruction"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toStartOf="@+id/button8"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button5" />

    <Button
        android:id="@+id/button8"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="4dp"
        android:text="Unorganized Space"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button7"
        app:layout_constraintTop_toBottomOf="@+id/button6" />

    <Button
        android:id="@+id/button9"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="4dp"
        android:text="No Homework"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toStartOf="@+id/button10"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button7" />

    <Button
        android:id="@+id/button10"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="4dp"
        android:text="Non-Participation"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button9"
        app:layout_constraintTop_toBottomOf="@+id/button8" />

    <Button
        android:id="@+id/button11"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="4dp"
        android:text="Unable to follow directions"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toStartOf="@+id/button12"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button9" />

    <Button
        android:id="@+id/button12"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="4dp"
        android:text="Off Task"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button11"
        app:layout_constraintTop_toBottomOf="@+id/button10" />

    <Button
        android:id="@+id/button13"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="4dp"
        android:text="Out of Chair"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toStartOf="@+id/button14"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button11" />

    <Button
        android:id="@+id/button14"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="4dp"
        android:text="Unprepared"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button13"
        app:layout_constraintTop_toBottomOf="@+id/button12" />

    <Button
        android:id="@+id/button15"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="8dp"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="8dp"
        android:text="Add Your Own"
        android:textSize="12sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button13" />

    <TextView
        android:id="@+id/textView8"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:text="Bad Behavior"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Display1"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</android.support.constraint.ConstraintLayout>
```

### behaviortracking.xml

![Figure4](https://github.com/dchase3/ITMD455FinalProject/blob/master/ImportantFiles/Images/figure4.png)

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/relativeLayout3"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#1e1e1e"
    tools:layout_editor_absoluteY="81dp">

    <TextView
        android:id="@+id/studentDisp"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:text="Student Name"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Headline"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/usernameDisp"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/usernameDisp"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="8dp"
        android:textColor="#00b0ca"
        android:text="Behavior Name:"
        android:textAppearance="@style/TextAppearance.AppCompat.Headline"
        app:layout_constraintEnd_toStartOf="@+id/studentDisp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="24dp"
        android:layout_marginTop="8dp"
        android:text="Location"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Headline"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/usernameDisp" />

    <RadioButton
        android:id="@+id/radioButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="32dp"
        android:layout_marginTop="8dp"
        android:text="Classroom"
        android:textColor="#00b0ca"
        android:buttonTint="#00b0ca"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView3" />

    <RadioButton
        android:id="@+id/radioButton2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="32dp"
        android:layout_marginTop="8dp"
        android:text="Hallway"
        android:textColor="#00b0ca"
        android:buttonTint="#00b0ca"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/radioButton" />

    <RadioButton
        android:id="@+id/radioButton3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="32dp"
        android:layout_marginTop="8dp"
        android:text="Bus"
        android:textColor="#00b0ca"
        android:buttonTint="#00b0ca"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/radioButton2" />

    <RadioButton
        android:id="@+id/radioButton4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="32dp"
        android:layout_marginTop="8dp"
        android:text="Cafeteria"
        android:textColor="#00b0ca"
        android:buttonTint="#00b0ca"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/radioButton3" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="24dp"
        android:textColor="#00b0ca"
        android:layout_marginTop="8dp"
        android:text="Faculty/Staff Present"
        android:textAppearance="@style/TextAppearance.AppCompat.Headline"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/radioButton4" />

    <RadioButton
        android:id="@+id/radioButton5"
        android:layout_width="wrap_content"
        android:layout_height="0dp"
        android:layout_marginStart="32dp"
        android:layout_marginTop="8dp"
        android:text="Teacher"
        android:textColor="#00b0ca"
        android:buttonTint="#00b0ca"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView4" />

    <RadioButton
        android:id="@+id/radioButton6"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="32dp"
        android:layout_marginTop="8dp"
        android:text="Administration"
        android:textColor="#00b0ca"
        android:buttonTint="#00b0ca"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/radioButton5" />

    <RadioButton
        android:id="@+id/radioButton7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="32dp"
        android:layout_marginTop="8dp"
        android:text="Peers"
        android:textColor="#00b0ca"
        android:buttonTint="#00b0ca"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/radioButton6" />

    <Button
        android:id="@+id/button19"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="8dp"
        android:text="Add Behavior"
        android:textColor="#1e1e1e"
        android:background="#00b0ca"
        app:layout_constraintBottom_toBottomOf="parent"
        tools:layout_editor_absoluteX="131dp" />

    <TextView
        android:id="@+id/textView5"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_marginBottom="8dp"
        android:textColor="#00b0ca"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="8dp"
        android:text="Additional Comments ..."
        app:layout_constraintBottom_toTopOf="@+id/button19"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/radioButton7" />

</android.support.constraint.ConstraintLayout>
```

### display.xml

![Figure5](https://github.com/dchase3/ITMD455FinalProject/blob/master/ImportantFiles/Images/figure5.png)

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#1e1e1e">

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_marginStart="12dp"
        android:layout_marginTop="13dp"
        android:text="Student Name"
        android:textColor="#00b0ca"
        android:textSize="16sp" />

    <TextView
        android:id="@+id/usernameDisp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignBottom="@+id/textView2"
        android:layout_alignTop="@+id/textView2"
        android:layout_marginStart="13dp"
        android:layout_toEndOf="@+id/textView2"
        android:text="TextView"
        android:textColor="#00b0ca"
        android:textSize="16sp" />

    <ListView
        android:id="@+id/students"
        android:layout_width="match_parent"
        android:layout_height="375dp"
        android:layout_alignEnd="@+id/usernameDisp"
        android:layout_alignParentStart="true"
        android:layout_below="@+id/textView2" />

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignStart="@+id/textView2"
        android:layout_below="@+id/students"
        android:layout_marginTop="19dp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        android:text="Add Student" />

    <Button
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignBaseline="@+id/button2"
        android:layout_alignBottom="@+id/button2"
        android:layout_alignParentEnd="true"
        android:layout_marginEnd="13dp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        android:text="Remove Student" />

</RelativeLayout>
```

### displaystudents.xml

![Figure6](https://github.com/dchase3/ITMD455FinalProject/blob/master/ImportantFiles/Images/figure6.png)

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal"
    android:background="#1e1e1e">

    <ImageView
        android:id="@+id/flag"
        android:layout_width="400px"
        android:layout_height="400px"
        android:layout_marginLeft="4px"
        android:layout_marginRight="4px"
        android:layout_marginTop="4px"/>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        >
        <TextView
            android:id="@+id/txt"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#00b0ca"
            android:text="@+id/label"
            android:textSize="20sp"
            />

        <TextView
            android:id="@+id/cur"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#00b0ca"
            android:text="@+id/label"
            />
    </LinearLayout>
</LinearLayout>
```

### goodbehaviors.xml

![Figure7](https://github.com/dchase3/ITMD455FinalProject/blob/master/ImportantFiles/Images/figure7.png)

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/relativeLayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#1e1e1e"
    tools:layout_editor_absoluteY="81dp">

    <Button
        android:id="@+id/button1"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="16dp"
        android:text="Work timely submitted"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toStartOf="@+id/button9"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView10" />

    <Button
        android:id="@+id/button2"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="4dp"
        android:text="Classwork Complete"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toStartOf="@+id/button10"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button1" />

    <Button
        android:id="@+id/button3"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="4dp"
        android:text="Organized"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toStartOf="@+id/button11"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button2" />

    <Button
        android:id="@+id/button4"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="4dp"
        android:text="Good Manners"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toStartOf="@+id/button12"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button3" />

    <Button
        android:id="@+id/button5"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="4dp"
        android:text="Follows Directions"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toStartOf="@+id/button13"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button4" />

    <Button
        android:id="@+id/button6"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="4dp"
        android:text="Hard Work"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toStartOf="@+id/button7"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button5" />

    <Button
        android:id="@+id/button7"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="4dp"
        android:text="Helping Others"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button6"
        app:layout_constraintTop_toBottomOf="@+id/button13" />

    <Button
        android:id="@+id/button8"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="115dp"
        android:layout_marginStart="115dp"
        android:layout_marginTop="4dp"
        android:text="Homework Complete"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button6" />

    <Button
        android:id="@+id/button9"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="16dp"
        android:text="On Task"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button1"
        app:layout_constraintTop_toBottomOf="@+id/textView10" />

    <Button
        android:id="@+id/button10"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="4dp"
        android:text="On Time"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button2"
        app:layout_constraintTop_toBottomOf="@+id/button9" />

    <Button
        android:id="@+id/button11"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="4dp"
        android:text="Participation"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button3"
        app:layout_constraintTop_toBottomOf="@+id/button10" />

    <Button
        android:id="@+id/button12"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="4dp"
        android:text="Positive Attitude"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button4"
        app:layout_constraintTop_toBottomOf="@+id/button11" />

    <Button
        android:id="@+id/button13"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="4dp"
        android:text="Respectful"
        android:textSize="10sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/button5"
        app:layout_constraintTop_toBottomOf="@+id/button12" />

    <Button
        android:id="@+id/button14"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="16dp"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="4dp"
        android:text="Add Your Own"
        android:textSize="12sp"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button8" />

    <TextView
        android:id="@+id/textView10"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="71dp"
        android:layout_marginStart="72dp"
        android:layout_marginTop="16dp"
        android:text="Good Behaviors"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Display1"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</android.support.constraint.ConstraintLayout>
```

### singular_student_display.xml

![Figure8](https://github.com/dchase3/ITMD455FinalProject/blob/master/ImportantFiles/Images/figure8.png)

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#1e1e1e">

    <TextView
        android:id="@+id/studentname"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="83dp"
        android:layout_marginStart="83dp"
        android:layout_marginTop="16dp"
        android:text="Student Name"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Display1"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/badbehavior"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="16dp"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="16dp"
        android:text="Negative Behavior"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        android:textSize="12sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/goodbehvaior"
        app:layout_constraintStart_toStartOf="parent" />

    <ListView
        android:id="@+id/behaviorlist"
        android:layout_width="368dp"
        android:layout_height="369dp"
        android:layout_marginBottom="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        app:layout_constraintBottom_toTopOf="@+id/badbehavior"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/studentname" />

    <Button
        android:id="@+id/goodbehvaior"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="16dp"
        android:layout_marginEnd="16dp"
        android:layout_marginStart="8dp"
        android:text="Positive Behavior"
        android:background="#00b0ca"
        android:textColor="#1e1e1e"
        android:textSize="12sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/badbehavior" />

</android.support.constraint.ConstraintLayout>
```

### singular_student_display_list.xml

![Figure9](https://github.com/dchase3/ITMD455FinalProject/blob/master/ImportantFiles/Images/figure9.png)

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#1e1e1e">

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="24dp"
        android:text="Date:"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Body2"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/date"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="24dp"
        android:text="Error N/A"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Body1"
        app:layout_constraintStart_toEndOf="@+id/textView3"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:text="Conduct:"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Body2"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView3" />

    <TextView
        android:id="@+id/conduct"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:text="Error N/A"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Body1"
        app:layout_constraintStart_toEndOf="@+id/textView2"
        app:layout_constraintTop_toBottomOf="@+id/date" />

    <TextView
        android:id="@+id/textView7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:text="Details:"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Body2"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView2" />

    <TextView
        android:id="@+id/details"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:text="Error N/A"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Body1"
        app:layout_constraintStart_toEndOf="@+id/textView7"
        app:layout_constraintTop_toBottomOf="@+id/textView2" />

    <TextView
        android:id="@+id/textView9"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:text="Action Taken:"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Body2"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView7" />

    <TextView
        android:id="@+id/action"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:text="Error N/A"
        android:textColor="#00b0ca"
        android:textAppearance="@style/TextAppearance.AppCompat.Body1"
        app:layout_constraintStart_toEndOf="@+id/textView9"
        app:layout_constraintTop_toBottomOf="@+id/details" />
</android.support.constraint.ConstraintLayout>
```



## Screenshots