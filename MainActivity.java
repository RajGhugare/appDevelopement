
package android.example.com;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    int scoreA=0,scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB(int scoreA) {
        TextView scoreView =(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void addThreeForTeamB(View v){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }

    public void addThreeForTeamA(View V) {
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }

    public void addTwoForTeamA(View V) {
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }

    public void addTwoForTeamB(View v){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }

    public void addOneForTeamB(View v){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }

    public void addOneForTeamA(View V) {
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }

    public void resetScore(View V){
        scoreA=0;
        scoreB=0;
        displayForTeamB(scoreA);
        displayForTeamA(scoreB);
    }
}
