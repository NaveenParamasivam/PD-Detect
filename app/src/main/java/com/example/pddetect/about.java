package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class about extends AppCompatActivity {
    LottieAnimationView homeicon1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        homeicon1=findViewById(R.id.home1);
        homeicon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent1=new Intent(about.this, homepage.class);
                startActivity(homeintent1);
            }
        });

    }
}