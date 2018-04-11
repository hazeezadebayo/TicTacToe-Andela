package com.mobile.sampleapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by hazeezadebayo on 6/16/2017.
 */

public class Splash extends Activity {

    protected void onCreate(Bundle HazeezAdebayo) {
        // TODO Auto-generate method stub
        super.onCreate(HazeezAdebayo);
        setContentView(R.layout.nigga);
        Thread timer = new Thread(){
            public void run() {
                try {
                    sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                                        Intent openMainActivity = new Intent("com.mobile.sampleapp.TICTACTOE");
                                        startActivity(openMainActivity);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        //TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
