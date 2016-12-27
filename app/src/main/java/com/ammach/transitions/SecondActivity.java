package com.ammach.transitions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
//            Explode explode=new Explode();
//            explode.setDuration(2000);
//            getWindow().setEnterTransition(explode);
//        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
