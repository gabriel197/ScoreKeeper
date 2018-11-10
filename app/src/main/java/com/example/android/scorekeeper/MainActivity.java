package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulB(foulTeamB);
        displayFoulA(foulTeamA);

    }

    public void addToA(View v) {
        scoreTeamA = scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void addToB(View v) {
        scoreTeamB = scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void foulA(View v) {
        foulTeamA = foulTeamA++;
        displayFoulA(foulTeamA);
    }

    public void foulB(View v) {
        foulTeamB = foulTeamB++;
        displayFoulB(foulTeamB);
    }


    //Displays the given score for Team A.
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    //Display the given number of fouls for team A.
    public void displayFoulA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.fault_team_a);
        foulView.setText(String.valueOf(foul));
    }

    //Display the given number of fouls for team B.

    public void displayFoulB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.fault_team_b);
        foulView.setText(String.valueOf(foul));
    }


    //Displays the given score for Team B.
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}