package com.example.raiven.itmd455final;

import android.app.Activity;
import android.os.Bundle;

public class goodbehaviors extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goodbehaviors);

        String student = getIntent().getStringExtra("name");
    }
}