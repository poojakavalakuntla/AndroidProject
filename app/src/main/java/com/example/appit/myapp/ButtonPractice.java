package com.example.appit.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ButtonPractice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        Toolbar toolbar=(Toolbar)findViewById(R.id.button_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.drawable.ic_button_toolbar);
        getSupportActionBar().setTitle(R.string.button_toolbar_title);
        getSupportActionBar().setSubtitle(R.string.button_toolbar_date);


    }
}
