package com.example.raiven.itmd455final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class badbehaviors extends Activity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
    String student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.badbehaviors);

        student = getIntent().getStringExtra("name");

        btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn1.getText());
                intent.putExtra("name", student);
                startActivity(intent);
            }
        });

        btn2 = (Button)findViewById(R.id.add);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn2.getText());
                intent.putExtra("name", student);
                startActivity(intent);
            }
        });

        btn3 = (Button)findViewById(R.id.remove);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn1.getText());
                intent.putExtra("name", student);
                startActivity(intent);
            }
        });

        btn4 = (Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn1.getText());
                intent.putExtra("name", student);
                startActivity(intent);
            }
        });

    }
}