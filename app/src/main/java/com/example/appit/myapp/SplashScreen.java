package com.example.appit.myapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        final Thread background=new Thread(){
            public void run(){
                try{
                    sleep(5*1000);

                    Intent intent=new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);

                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        background.start();

      /*  int SPLASH_SCREEN_TIME_OUT = 5000;
        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent=new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);

                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT); */
    }
}
