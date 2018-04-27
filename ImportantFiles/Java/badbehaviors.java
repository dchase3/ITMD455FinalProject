//first package will be different on each computer make use you add yours
//and comment out the others on your computer.
package com.example.densi.itmd455finalproject;
//package com.example.ssiruuk.itmd455finalproject;
//package com.example.raiven.itmd455final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class badbehaviors extends Activity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7,btn8,btn9,btn10,bt11,btn12,bt13,btn14,bt15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.badbehaviors);

        String student = getIntent().getStringExtra("name");

        btn1 = (Button)findViewById(R.id.badbehavior);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), behaviortracking.class);
                intent.putExtra("behavior", btn1.getText());
                startActivity(intent);
            }
        });


    }
}
