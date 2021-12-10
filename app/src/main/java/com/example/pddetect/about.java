package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class about extends AppCompatActivity {
    LottieAnimationView homeicon1;
    TextView aboutapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        homeicon1=findViewById(R.id.home1);
        aboutapp=findViewById(R.id.aboutdescription);
        aboutapp.setText("Parkinson’s Disease (PD) is a disorder of the central nervous system that affects movement, often including tremors. We have designed a system that uses deep learning to detect Parkinson’s Disease at an earlier stage.");
        homeicon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent1=new Intent(about.this, homepage.class);
                startActivity(homeintent1);
            }
        });

    }
}