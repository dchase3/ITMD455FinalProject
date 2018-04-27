package com.example.raiven.itmd455final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Raiven on 4/27/2018.
 */

public class badbehaviors extends Activity {
    Button btn4, btn5,bt6,btn7,bt8,btn9,bt10,btn11,bt12,btn13,bt14,btn15,bt16,btn17,bt18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.badbehaviors);

        String student = getIntent().getStringExtra("name");

        btn4 = (Button)findViewById(R.id.badbehavior);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn4.getText());
                startActivity(intent);
            }
        });


    }
}
