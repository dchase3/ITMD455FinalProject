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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class singular_student_display extends Activity {
    TextView name;
    Button good;
    Button bad;
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