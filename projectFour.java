package com.mobile.sampleapp;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by hazeezadebayo on 12/1/2017.
 */

public class projectFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project_base);
}
    @Override
    public void setContentView(int layoutResID) {
        DrawerLayout fullView = (DrawerLayout)
                getLayoutInflater().inflate(R.layout.project_base, null);
        FrameLayout activityContainer = (FrameLayout) fullView.findViewById(R.id.activity_content);
        getLayoutInflater().inflate(layoutResID, activityContainer, true);
        super.setContentView(fullView);
        //android:background="@drawable/main_background" in the .xml o,not here
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView textCustomTitle = (TextView) findViewById(R.id.custom_title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //    setTitle("TheRealGameOfLife");
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        //TODO Auto-generated method stub
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.notsocool_menu, menu);
        return true;

    }

}
