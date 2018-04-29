package com.example.raiven.itmd455final;


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