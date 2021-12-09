package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class negativescreen extends AppCompatActivity {
    LottieAnimationView homeicon4 ,homeicon5;
    Button  severitybutton,homebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.negativescreen);
        homeicon4=findViewById(R.id.home4);
        severitybutton=findViewById(R.id.button1);
        homebutton=findViewById(R.id.button2);
        homeicon5=findViewById(R.id.home5);
        homeicon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent4=new Intent(negativescreen.this, homepage.class);
                startActivity(homeintent4);
            }
        });
         severitybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent severityintent=new Intent(negativescreen.this, severityquestion.class);
                startActivity(severityintent);

            }
        });

        homeicon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent5=new Intent(negativescreen.this, homepage.class);
                startActivity(homeintent5);
            }
        });
       homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homebuttonintent=new Intent(negativescreen.this, homepage.class);
                startActivity(homebuttonintent);

            }
        });
    }
}