package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView doc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doc=findViewById(R.id.doctorlotties);
        doc.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);

    }
}