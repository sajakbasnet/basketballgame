package com.example.basketball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamAScore;
    private int teamBScore;
    private TextView teamATextViewScore;
    private TextView teamBTextViewScore;

    protected void onCreate(Bundle savedInstanceState){
        setContentView(R.layout.game);
        super.onCreate(savedInstanceState);
        teamATextViewScore = findViewById(R.id.team_a_score);
        teamBTextViewScore=findViewById(R.id.team_b_score);
    }
    public void updateForTeamAPoint3(View view){
        teamAScore = teamAScore + 3;
        displayScoreTeamA(teamAScore);
    }
    public void updateForTeamAPoint2(View view){
        teamAScore = teamAScore + 2;
        displayScoreTeamA(teamAScore);
    }
    public void updateForTeamAPoint1(View view){
        teamAScore = teamAScore + 1;
        displayScoreTeamA(teamAScore);
    }
    public void updateForTeamBPoint1(View view){
        teamBScore = teamBScore + 1;
        displayScoreTeamB(teamBScore);
    }
    public void updateForTeamBPoint2(View view){
        teamBScore = teamBScore + 2;
        displayScoreTeamB(teamBScore);
    }
    public void updateForTeamBPoint3(View view){
        teamBScore = teamBScore + 3;
        displayScoreTeamB(teamBScore);
    }
    private void displayScoreTeamA(int score) {
        teamATextViewScore.setText(String.valueOf(score));
    }
    private void displayScoreTeamB(int score) {
        teamBTextViewScore.setText(String.valueOf(score));
    }
}




