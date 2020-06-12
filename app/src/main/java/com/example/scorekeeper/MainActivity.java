package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int outTeamA = 0;
    int scoreTeamB = 0;
    int OutTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamARun(scoreTeamA);
        displayForTeamAOut(outTeamA);
        //Team B
        displayForTeamBRun(scoreTeamB);
        displayForTeamBOut(OutTeamB);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //Score Team A //Score Team A //Score Team A //Score Team A //Score Team A //Score Team A //Score Team A //Score Team A //Score Team A
    public void RunA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamARun(scoreTeamA);
    }

    public void RunA_2(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamARun(scoreTeamA);
    }

    public void RunA_3(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamARun(scoreTeamA);
    }

    public void RunA_4(View v) {
        scoreTeamA = scoreTeamA + 4;
        displayForTeamARun(scoreTeamA);
    }

    public void RunA_6(View v) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamARun(scoreTeamA);
    }

    public void OutA(View v) {
        outTeamA = outTeamA + 1;
        displayForTeamAOut(outTeamA);
    }


    //Score Team A
    public void displayForTeamARun(int score) {
        TextView scoreView = (TextView) findViewById(R.id.run_team_a);
        scoreView.setText(String.valueOf(score));
    }

    //Out Team A
    public void displayForTeamAOut(int score) {
        TextView scoreView = (TextView) findViewById(R.id.out_team_a);
        scoreView.setText(String.valueOf(score));

    }


    //Score Team B //Score Team B//Score Team B//Score Team B//Score Team B//Score Team B//Score Team B//Score Team B//Score Team B//Score Team B


    //Run and Out Team B Button

    public void RunB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamBRun(scoreTeamB);
    }

    public void OutB(View v) {
        OutTeamB = OutTeamB + 1;
        displayForTeamBOut(OutTeamB);
    }

    public void RunB_2(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamBRun(scoreTeamB);
    }

    public void RunB_3(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamBRun(scoreTeamB);
    }

    public void RunB_4(View v) {
        scoreTeamB = scoreTeamB + 4;
        displayForTeamBRun(scoreTeamB);
    }

    public void RunB_6(View v) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamBRun(scoreTeamB);
    }

    //RESET RESET RESET RESET RESET RESET RESET RESET RESET RESET RESET RESET RESET RESET RESET RESET RESET RESET RESET RESET RESET
    public void resetScore(View v) {
        scoreTeamA = 0;
        outTeamA = 0;
        scoreTeamB = 0;
        OutTeamB = 0;
        displayForTeamARun(scoreTeamA);
        displayForTeamAOut(outTeamA);
        displayForTeamBRun(scoreTeamB);
        displayForTeamBOut(OutTeamB);

    }


    //Out and Run  Team B
    public void displayForTeamBRun(int score) {
        TextView scoreView = (TextView) findViewById(R.id.run_team_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBOut(int score) {
        TextView scoreView = (TextView) findViewById(R.id.out_team_b);
        scoreView.setText(String.valueOf(score));

    }

}
