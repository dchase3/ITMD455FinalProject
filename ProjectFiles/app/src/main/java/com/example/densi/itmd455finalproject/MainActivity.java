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
                String str = username.getText().toString();
                Intent i = new Intent(MainActivity.this, display.class);
                i.putExtra("Username", str);
                startActivity(i);
            }
        });
    }

    public boolean validate() {
        //simple test to see if fields were populated
        if (username.getText().toString().trim().length()<=0){
            Toast.makeText(MainActivity.this, "Please Enter a valid username",
                    Toast.LENGTH_LONG).show();
            return true;
        } else if (password.getText().toString().trim().length()<=0){
            Toast.makeText(MainActivity.this, "Please enter a valid password",
                    Toast.LENGTH_LONG).show();
            return true;
        }
        return false;
    }
}