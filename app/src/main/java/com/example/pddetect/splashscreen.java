package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class splashscreen extends AppCompatActivity {
    ImageView medicalbackground;
    TextView ourappname;
    LottieAnimationView doctoranmie;
    private static int SPLASH_SCREEN =3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        doctoranmie=findViewById(R.id.doctorlotties);
        medicalbackground=findViewById(R.id.bg);
        ourappname=findViewById(R.id.pdtext);
        medicalbackground.animate().translationY(-3000).setDuration(1000).setStartDelay(2000);
        doctoranmie.animate().translationY(1400).setDuration(1000).setStartDelay(2000);
        ourappname.animate().translationY(1400).setDuration(1000).setStartDelay(2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent registerintent =new Intent(splashscreen.this, register.class);
                startActivity(registerintent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}