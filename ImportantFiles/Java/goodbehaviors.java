package com.example.raiven.itmd455final;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Raiven on 4/27/2018.
 */

public class goodbehaviors extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goodbehaviors);

        String student = getIntent().getStringExtra("name");
    }
}
