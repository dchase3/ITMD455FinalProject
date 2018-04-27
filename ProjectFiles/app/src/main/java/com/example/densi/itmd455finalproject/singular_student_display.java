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
import android.widget.TextView;

public class singular_student_display extends Activity {
    TextView name;
    Button good;
    Button bad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singular_student_display);
        name = (TextView)findViewById(R.id.studentname);

        String student = getIntent().getStringExtra("name");
        name.setText(student);

        good = (Button)findViewById(R.id.goodbehvaior);
        bad = (Button)findViewById(R.id.badbehavior);



        good.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), goodbehaviors.class);
                intent.putExtra("name", name.getText());
                startActivity(intent);
            }
        });

        bad.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), badbehaviors.class);
                intent.putExtra("name", name.getText());
                startActivity(intent);
            }
        });




    }
}
