package com.example.devonald.itmd455finalproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Devonald on 4/22/2018.
 */

public class display extends Activity {

    TextView textView;
    String ListItemsName[] = new String[]{ "India",
            "Pakistan",
            "Sri Lanka",
            "China",
            "Bangladesh",
            "Nepal",
            "Afghanistan",
            "North Korea",
            "South Korea",
            "Japan"};
    int ImageName[] = new int[]{ R.drawable.india,
            R.drawable.paki,
            R.drawable.sril,
            R.drawable.china,
            R.drawable.bang,
            R.drawable.nepal,
            R.drawable.afg,
            R.drawable.nk,
            R.drawable.sk,
            R.drawable.jap};
    String ListItemsName2[] = new String[]{ "Indian Rupee",
            "Pakistani Rupee",
            "Sri Lankan Rupee",
            "Renminbi",
            "Bangladeshi Taka",
            "Nepalese Rupee",
            "Afghani",
            "North Korean Won",
            "South Korean Won",
            "Japanese Yen"};
    ListView listView;
    SimpleAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        textView = (TextView)findViewById(R.id.usernameDisp);

        String username = getIntent().getStringExtra("Username");
        textView.setText(username);

        listView = (ListView)findViewById(R.id.students);

        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<10;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", "Country : " + ListItemsName[i]);
            hm.put("cur","Currency : " + ListItemsName2[i]);
            hm.put("flag", Integer.toString(ImageName[i]) );
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
                Toast.makeText(getApplicationContext(),
                        ListItemsName[position],
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}

