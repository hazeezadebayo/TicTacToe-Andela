package com.mobile.sampleapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by hazeezadebayo on 4/10/2018.
 */


public class VsPlayer extends projectFour {
    int  w[][];
    int i, j, k = 0;
    int z11=0,z12=0,z13=0,z21=0,z22=0,z23=0,z31=0,z32=0,z33=0;
    Button feedback, p[][];
    TextView textView;
    //Called when the activity is first created
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuItem item = menu.add("New Game"); return true;}
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intents = new Intent(VsPlayer.this, VsPlayer.class);
        intents.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                | Intent.FLAG_ACTIVITY_CLEAR_TOP
                | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intents);
        setvsBoard();
    return true; }
    //Set up the game board.

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictactoe);
        setvsBoard();
        feedback = (Button) findViewById(R.id.feedBack);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailAppIntent = new Intent(Intent.ACTION_SENDTO);
                emailAppIntent.setData(Uri.parse("mailto:"));
                emailAppIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"hazeezadebayo@gmail.com"});
                emailAppIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback from App");
                // emailAppIntent.putExtra(Intent.EXTRA_TEXT, feedbackk);
                if (emailAppIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(emailAppIntent);
                }
            }
        });
    }

    public void setvsBoard() {
        k = 0;
        p = new Button[4][4];
        w = new int[4][4];
        textView = (TextView) findViewById(R.id.dialogue);
        p[1][3] = (Button) findViewById(R.id.one);
        p[1][2] = (Button) findViewById(R.id.two);
        p[1][1] = (Button) findViewById(R.id.three);
        p[2][3] = (Button) findViewById(R.id.four);
        p[2][2] = (Button) findViewById(R.id.five);
        p[2][1] = (Button) findViewById(R.id.six);
        p[3][3] = (Button) findViewById(R.id.seven);
        p[3][2] = (Button) findViewById(R.id.eight);
        p[3][1] = (Button) findViewById(R.id.nine);
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++)
                w[i][j] = 2;
        }
        ////////////////////////////////////////////////////////
        textView.setText("Click a button to start.");
// add the click listeners for each button
        p[1][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {  if(z13==0) {
                if (k==1){ k=0; p[1][3].setText("O"); w[1][3] = 0; textView.setText("player 1 turn"); checkBoardvs();}
                else if (k==0) {k=1; p[1][3].setText("X"); w[1][3] = 1; textView.setText("player 2 turn"); checkBoardvs();} z13=1;  }    }
        });
        p[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { if(z12==0) {
                if (k==1){ k=0; p[1][2].setText("O"); w[1][2] = 0; textView.setText("player 1 turn"); checkBoardvs();}
                else if (k==0) {k=1; p[1][2].setText("X"); w[1][2] = 1; textView.setText("player 2 turn"); checkBoardvs();} z12=1;} }
        });
        p[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { if(z11==0) {
                if (k==1){ k=0; p[1][1].setText("O"); w[1][1] = 0; textView.setText("player 1 turn"); checkBoardvs();}
                else if (k==0) {k=1; p[1][1].setText("X"); w[1][1] = 1; textView.setText("player 2 turn"); checkBoardvs();} z11=1;} }
        });
        p[2][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { if(z23==0) {
                if (k==1){ k=0; p[2][3].setText("O"); w[2][3] = 0; textView.setText("player 1 turn"); checkBoardvs();}
                else if (k==0) {k=1; p[2][3].setText("X"); w[2][3] = 1; textView.setText("player 2 turn"); checkBoardvs();} z23=1;}}
        });
        p[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { if(z22==0) {
                if (k==1){ k=0; p[2][2].setText("O"); w[2][2] = 0; textView.setText("player 1 turn"); checkBoardvs();}
                else if (k==0) {k=1; p[2][2].setText("X"); w[2][2] = 1; textView.setText("player 2 turn"); checkBoardvs();} z22=1;}}
        });
        p[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { if(z21==0) {
                if (k==1){ k=0; p[2][1].setText("O"); w[2][1] = 0; textView.setText("player 1 turn"); checkBoardvs();}
                else if (k==0) {k=1; p[2][1].setText("X"); w[2][1] = 1; textView.setText("player 2 turn"); checkBoardvs();} z21=1;}}
        });
        p[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { if(z33==0) {
                if (k==1){ k=0; p[3][3].setText("O"); w[3][3] = 0; textView.setText("player 1 turn"); checkBoardvs();}
                else if (k==0) {k=1; p[3][3].setText("X"); w[3][3] = 1; textView.setText("player 2 turn"); checkBoardvs();} z33=1;}}
        });
        p[3][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { if(z32==0) {
                if (k==1){ k=0; p[3][2].setText("O"); w[3][2] = 0; textView.setText("player 1 turn"); checkBoardvs();}
                else if (k==0) {k=1; p[3][2].setText("X"); w[3][2] = 1; textView.setText("player 2 turn"); checkBoardvs();} z32=1;}}
        });
        p[3][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { if(z31==0) {
                if (k==1){ k=0; p[3][1].setText("O"); w[3][1] = 0; textView.setText("player 1 turn"); checkBoardvs();}
                else if (k==0) {k=1; p[3][1].setText("X"); w[3][1] = 1; textView.setText("player 2 turn"); checkBoardvs();} z31=1;}}
        });
    }
    public void checkBoardvs() {
        if ((w[1][1] == 0 && w[2][2] == 0 && w[3][3] == 0)
                || (w[1][3] == 0 && w[2][2] == 0 && w[3][1] == 0)
                || (w[1][2] == 0 && w[2][2] == 0 && w[3][2] == 0)
                || (w[1][3] == 0 && w[2][3] == 0 && w[3][3] == 0)
                || (w[1][1] == 0 && w[1][2] == 0 && w[1][3] == 0)
                || (w[2][1] == 0 && w[2][2] == 0 && w[2][3] == 0)
                || (w[3][1] == 0 && w[3][2] == 0 && w[3][3] == 0)
                || (w[1][1] == 0 && w[2][1] == 0 && w[3][1] == 0))
        {textView.setText("player 1 wins!");
        } else if ((w[1][1] == 1 && w[2][2] == 1 && w[3][3] == 1)
                || (w[1][3] == 1 && w[2][2] == 1 && w[3][1] == 1)
                || (w[1][2] == 1 && w[2][2] == 1 && w[3][2] == 1)
                || (w[1][3] == 1 && w[2][3] == 1 && w[3][3] == 1)
                || (w[1][1] == 1 && w[1][2] == 1 && w[1][3] == 1)
                || (w[2][1] == 1 && w[2][2] == 1 && w[2][3] == 1)
                || (w[3][1] == 1 && w[3][2] == 1 && w[3][3] == 1)
                || (w[1][1] == 1 && w[2][1] == 1 && w[3][1] == 1))
        {textView.setText("player 2 wins!");}
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        try {
            Intent intents = new Intent(VsPlayer.this, TicTacToe.class);
            intents.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                    | Intent.FLAG_ACTIVITY_CLEAR_TOP
                    | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intents);
            finish();
        } catch (Exception e) {
            e.printStackTrace();}
    }
}