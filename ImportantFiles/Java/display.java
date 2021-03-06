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