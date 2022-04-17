package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView resultView;
    TextView welcomeView;
    int value=0;
    int n=0;
    int one=2,two=3,three=4,four=5,five=6,six=7,seven=8,eight=9,nine=10;
    TextView first,second,third,fourth,fifth,sixth,seventh,eighth,nineth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultView=findViewById(R.id.resultView);
        welcomeView=findViewById(R.id.welcomeView);
        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        third=findViewById(R.id.third);
        fourth=findViewById(R.id.fourth);
        fifth=findViewById(R.id.fifth);
        sixth=findViewById(R.id.sixth);
        seventh=findViewById(R.id.seventh);
        eighth=findViewById(R.id.eighth);
        nineth=findViewById(R.id.ninth);
    }
    public void setWorking(int value){
        if(n==0){
            if((one==two&&two==three)||(four==five&&five==six)||(seven==eight&&eight==nine)||(one==four&&four==seven)||(two==five&&five==eight)||(three==six&&six==nine)||(one==five&&five==nine)||(three==five&&five==seven))
            {   n=1;
                if(value==0)
                    resultView.setText("Congratulations...! Won..! Player 1");
                else
                    resultView.setText("Congratulations...! Won..! Player 0");
                Toast.makeText(this, "Congratulations....!   Restart the game...!", Toast.LENGTH_SHORT).show();
            }
            else{
                resultView.setText(" Your Turn : Player "+value);
            }
        }
        else{
            resultView.setText(" Restart the game ");
            Toast.makeText(this, "Restart the game", Toast.LENGTH_SHORT).show();
        }
    }
    public void restartOnClick(View view) {
        first.setText("-"); second.setText("-"); third.setText("-"); fourth.setText("-"); fifth.setText("-");
        sixth.setText("-"); seventh.setText("-"); eighth.setText("-"); nineth.setText("-");
        one=2;two=3;three=4;four=5;five=6;six=7;seven=8;eight=9;nine=10;
        value=0; n=0;
        resultView.setText(" Your Turn : Player 0");
    }
    public void firstOnClick(View view) {
        one=value;
        first.setText(" "+value);
        if(value==0)
            value=1;
        else
            value=0;
        setWorking(value);
    }

    public void secondOnClick(View view) {
        two=value;
        second.setText(" "+value);
        if(value==0)
            value=1;
        else
            value=0;
        setWorking(value);
    }

    public void thirdOnClick(View view) {
        three=value;
        third.setText(" "+value);
        if(value==0)
            value=1;
        else
            value=0;
        setWorking(value);
    }

    public void fourthOnClick(View view) {
        four=value;
        fourth.setText(" "+value);
        if(value==0)
            value=1;
        else
            value=0;
        setWorking(value);
    }

    public void fifthOnClick(View view) {
        five=value;
        fifth.setText(" "+value);
        if(value==0)
            value=1;
        else
            value=0;
        setWorking(value);
    }

    public void sixthOnClick(View view) {
        six=value;
        sixth.setText(" "+value);
        if(value==0)
            value=1;
        else
            value=0;
        setWorking(value);
    }

    public void seventhOnClick(View view) {
        seven=value;
        seventh.setText(" "+value);
        if(value==0)
            value=1;
        else
            value=0;
        setWorking(value);
    }

    public void eightOnClick(View view) {
        eight=value;
        eighth.setText(" "+value);
        if(value==0)
            value=1;
        else
            value=0;
        setWorking(value);
    }

    public void nineOnClick(View view) {
        nine=value;
        nineth.setText(" "+value);
        if(value==0)
            value=1;
        else
            value=0;
        setWorking(value);
    }
}