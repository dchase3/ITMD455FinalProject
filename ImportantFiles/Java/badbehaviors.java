package com.example.raiven.itmd455final;

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