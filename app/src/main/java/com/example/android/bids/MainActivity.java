package com.example.android.bids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int age = 30;
    public void AddItUp(View view){
        age+=1;
        display(age);

    }
    public void SubItUp(View view){
        age-=1;
        display(age);
    }
    public void display(int integerCalledNumberWhichIsTheResultOfpassingTheAgeVariableToThisMethod){
        TextView age_number =(TextView)findViewById(R.id.textView);
        age_number.setText(""+ integerCalledNumberWhichIsTheResultOfpassingTheAgeVariableToThisMethod);
    }
    public void calculateDogYears (View view){
        int dage=age*7;
        displaydage(dage);

    }
    public void displaydage(int score) {
        TextView scoreView = (TextView) findViewById(R.id.question_text);
        scoreView.setText(String.valueOf(score));
    }

    }
