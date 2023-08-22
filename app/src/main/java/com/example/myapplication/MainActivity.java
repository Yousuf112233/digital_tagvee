package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


   TextView textView,AddOne,SubOne,ResetButton;
int count=0;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        AddOne=findViewById(R.id.AddOne);
        SubOne=findViewById(R.id.SubOne);
        ResetButton=findViewById(R.id.ResetButton);



        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });






        AddOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count =count+1;
                textView.setText(""+count);
            }
        });






        SubOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count =count-1;
                textView.setText(""+count);
            }
        });




        ResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count =0;
                textView.setText(""+count);
            }
        });





    }
}