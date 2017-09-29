package com.example.keshav.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.keshav.courtcounter.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int points = 0, pointsB = 0;

    public void submit3p(View view) {
        points = points + 3;
        displayPoints(points);

    }

    public void submit3pB(View view) {
        pointsB = pointsB + 3;
        displayPointsB(pointsB);

    }

    public void submit2p(View view) {
        points = points + 2;
        displayPoints(points);

    }

    public void submit2pB(View view) {
        pointsB = pointsB + 2;
        displayPointsB(pointsB);

    }

    public void submitft(View view) {
        points = points + 1;
        displayPoints(points);
    }

    public void submitftB(View view) {
        pointsB = pointsB + 1;
        displayPointsB(pointsB);
    }


    public void displayPoints(int number) {
        TextView points = (TextView) findViewById(R.id.team_A_points);
        points.setText("" + number);
    }

    public void displayPointsB(int number) {
        TextView points = (TextView) findViewById(R.id.team_B_points);
        points.setText("" + number);
    }

    public void reset(View view) {
        TextView pointsAt = (TextView) findViewById(R.id.team_A_points);
        TextView pointsBt = (TextView) findViewById(R.id.team_B_points);
        TextView end = (TextView) findViewById(R.id.winner);
        pointsAt.setText("0");
        pointsBt.setText("0");
        end.setText("");
        points = 0;
        pointsB = 0;
    }

    public void end(View view) {
        TextView end = (TextView) findViewById(R.id.winner);
        if (points > pointsB)
            end.setText("Team A WINS!");
        else if (points < pointsB)
            end.setText("Team B WINS");
        else
            end.setText("It's a DRAW");

    }

    public void next(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
