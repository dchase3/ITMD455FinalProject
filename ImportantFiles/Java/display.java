package com.example.raiven.itmd455final;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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



    /*   String ListItemsName2[] = new String[]{ "Indian Rupee",
               "Pakistani Rupee",
               "Sri Lankan Rupee",
               "Renminbi"};
      */

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

        String username = getIntent().getStringExtra("Username");
        textView.setText(username);

        listView = (ListView)findViewById(R.id.students);

        SqlHelper db = new SqlHelper(this);
        Log.d("Name:", "Raiven Johnson");

        db.addStudent(new student("Darez Phillips"));
        db.addStudent(new student("Raiven Johnson"));
        db.addStudent(new student("Dennis Chase"));
        db.addStudent(new student("Devonald Manney"));
        db.addStudent(new student("Peisong Huang"));

        list = db.getAllBooks();



        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<list.size();i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", "Country : " + list.get(i).getName());
            //      hm.put("cur","Currency : " + ListItemsName2[i]);

            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "flag","txt","cur" };

        // Ids of views in listview_layout
        int[] to = { R.id.flag,R.id.txt,R.id.cur};

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

                String str = list.get(position).getName();
                Intent i = new Intent(display.this, singular_student_display.class);
                i.putExtra("name", str);
                startActivity(i);

            }
        });

        add = (Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), add_student.class);
                startActivity(i);
            }
        });

        remove = (Button)findViewById(R.id.remove);
        remove.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), add_student.class);
                startActivity(i);
            }
        });


    }
}