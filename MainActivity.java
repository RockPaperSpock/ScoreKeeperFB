
package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //Increase scores for team1
    //by 1
    public void increment1a(View view) {
        score = score +1;
        display1(score);

    }
    //by 2
    public void increment2a(View view) {
        score = score +2;
        display1(score);
    }
    //by 6
    public void increment6a(View view) {
        score = score + 6;
        Toast.makeText(this, "Touch Down!", Toast.LENGTH_SHORT).show();
        display1(score);
    }

    //Decrease scores for team1 by 1
    public void decrement(View view) {
        if(score == 0) {
            Toast.makeText(this, "You cannot have a negative score", Toast.LENGTH_SHORT).show();
            return;
        }

        score = score - 1;
        display1(score);
    }

    //Increase scores for team2
    //by 1
    public void increment1b(View view) {
        score2 = score2 +1;
        display2(score2);

    }
    //by 2
    public void increment2b(View view) {
        score2 = score2 +2;
        display2(score2);
    }
    //by 6
    public void increment6b(View view) {
        score2 = score2 + 6;
        Toast.makeText(this, "Touch Down!", Toast.LENGTH_SHORT).show();
        display2(score2);
    }

    //Decrease scores for teanm2 by 1
    public void decrement2(View view) {
        if(score2 == 0) {
            Toast.makeText(this, "You cannot have a negative score", Toast.LENGTH_SHORT).show();
            return;
        }

        score2 = score2 - 1;
        display2(score2);
    }

    //reset all scores
    public void reset(View view) {
        score = 0;
        score2 = 0;
        Toast.makeText(this, "Scores reset to zero", Toast.LENGTH_SHORT).show();
        display1(score);
        display2(score2);
    }

    //display team1 score
    private void display1(int score) {
        TextView currentScore = (TextView)findViewById(R.id.score1);
        currentScore.setText("" + score);
    }
    //display team2 score
    private void display2(int score) {
        TextView currentScore = (TextView)findViewById(R.id.score2);
        currentScore.setText("" + score);
    }


}
