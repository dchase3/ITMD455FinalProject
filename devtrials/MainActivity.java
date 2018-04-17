package com.example.devonald.itmd455finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText username, password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        submit = (Button)findViewById(R.id.button);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (validate()){
            Toast.makeText(MainActivity.this, "Success..!", Toast.LENGTH_LONG)
                    .show();
        }
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
