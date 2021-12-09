package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class positivescreen extends AppCompatActivity {
    LottieAnimationView homeicon2 , homeicon3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.positivescreen);
        homeicon2=findViewById(R.id.home2);
        homeicon3=findViewById(R.id.home3);
        homeicon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent2=new Intent(positivescreen.this, homepage.class);
                startActivity(homeintent2);
            }
        });
        homeicon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent2=new Intent(positivescreen.this, homepage.class);
                startActivity(homeintent2);
            }
        });
    }
}