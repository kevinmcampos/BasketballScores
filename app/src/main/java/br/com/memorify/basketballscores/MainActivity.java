package br.com.memorify.basketballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView scoreTeamATextView;
    private TextView scoreTeamBTextView;

    private int mScoreTeamA = 0;
    private int mScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        refreshScore();
    }

    private void bindViews() {
        scoreTeamATextView = (TextView) findViewById(R.id.team_a_score);
        scoreTeamBTextView = (TextView) findViewById(R.id.team_b_score);
    }

    public void addOneForTeamA(View v) {
        mScoreTeamA += 1;
        refreshScore();
    }

    public void addTwoForTeamA(View v) {
        mScoreTeamA += 2;
        refreshScore();
    }

    public void addThreeForTeamA(View v) {
        mScoreTeamA += 3;
        refreshScore();
    }

    public void addOneForTeamB(View v) {
        mScoreTeamB += 1;
        refreshScore();
    }

    public void addTwoForTeamB(View v) {
        mScoreTeamB += 2;
        refreshScore();
    }

    public void addThreeForTeamB(View v) {
        mScoreTeamB += 3;
        refreshScore();
    }

    public void resetScore(View v) {
        mScoreTeamA = 0;
        mScoreTeamB = 0;
        refreshScore();
    }

    private void refreshScore() {
        scoreTeamATextView.setText(String.valueOf(mScoreTeamA));
        scoreTeamBTextView.setText(String.valueOf(mScoreTeamB));
    }
}
