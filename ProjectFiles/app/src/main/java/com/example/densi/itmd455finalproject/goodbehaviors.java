//first package will be different on each computer make use you add yours
//and comment out the others on your computer.
package com.example.densi.itmd455finalproject;
//package com.example.ssiruuk.itmd455finalproject;
//package com.example.raiven.itmd455final;

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
