package com.vu.nit6120lab03_task1_basketballapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    public void submitScore(View view)
    {
        //int quantity = 2;
        //display(quantity);
        displayScore();
    }

    private void display(int number)
    {
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view);
        scoreTextView.setText("" + number);
    }

    private void displayScore()
    {
        int number = 0;
        number = score;
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view);
        scoreTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }

    public void incrementOnePoint(View view)
    {
        //int quantity = 2;

        score = score + 1;
        display(score);
    }

    public void incrementTwoPoints(View view)
    {
        //int quantity = 2;

        score = score + 2;
        display(score);


    }

    public void incrementThreePoints(View view)
    {
        //int quantity = 2;

        score = score + 3;
        display(score);


    }




}
