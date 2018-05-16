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
    int num =1;

    public void add (View view){
        num = num+1;
        display(num);

    }
    public void display(int score) {
        TextView scoreView = (TextView) findViewById(R.id.message);
        scoreView.setText(String.valueOf(score));
}
}

