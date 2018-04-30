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


    }
}