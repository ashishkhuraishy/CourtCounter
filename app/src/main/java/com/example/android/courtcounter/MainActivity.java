package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA, scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void updateScoreA(int number){
        TextView scoreTextview = (TextView) findViewById(R.id.team_a_score);
        scoreTextview.setText("" + number);
    }

    public void threePointsA(View view) {
        scoreA = scoreA + 3;
        updateScoreA(scoreA);
    }

    public void twoPointsA(View view) {
        scoreA = scoreA + 2;
        updateScoreA(scoreA);
    }

    public void freeThrowA(View view) {
        scoreA = scoreA + 1;
        updateScoreA(scoreA);
    }

    private void updateScoreB(int number){
        TextView scoreTextview = (TextView) findViewById(R.id.team_b_score);
        scoreTextview.setText("" + number);
    }

    public void threePointsB(View view) {
        scoreB = scoreB + 3;
        updateScoreB(scoreB);
    }

    public void twoPointsB(View view) {
        scoreB = scoreB + 2;
        updateScoreB(scoreB);
    }

    public void freeThrowB(View view) {
        scoreB = scoreB + 1;
        updateScoreB(scoreB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        updateScoreA(scoreA);
        updateScoreB(scoreB);
    }

}
