package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static int score_A = 0, score_B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(score_A);
        displayForTeamB(score_B);
    }

    //Use - Resets the score to 0
    public void reset(View view) {
        score_A = 0;
        score_B = 0;
        displayForTeamA(score_A);
        displayForTeamB(score_B);
    }

    /**
     * Scores for A
     */

    //Use - Displays the score for team A
    public void displayForTeamA(int score_A) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score_A));
    }

    //Use - Adds 3 points to the total score
    public void threePoint(View view) {
        score_A += 3;
        displayForTeamA(score_A);
    }

    //Use - Adds 2 points to the total score
    public void twoPoint(View view) {
        score_A += 2;
        displayForTeamA(score_A);
    }

    //Use - Adds 1 point to the total score
    public void onePoint(View view) {
        score_A++;
        displayForTeamA(score_A);
    }


    /**
     * Scores of B
     */

    //Use - Displays the score for team A
    public void displayForTeamB(int score_B) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score_B));
    }

    //Use - Adds 3 points to the total score
    public void threePoint_B(View view) {
        score_B += 3;
        displayForTeamB(score_B);
    }

    //Use - Adds 2 points to the total score
    public void twoPoint_B(View view) {
        score_B += 2;
        displayForTeamB(score_B);
    }

    //Use - Adds 1 point to the total score
    public void onePoint_B(View view) {
        score_B++;
        displayForTeamB(score_B);
    }

}
