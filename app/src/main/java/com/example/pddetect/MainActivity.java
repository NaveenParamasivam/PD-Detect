package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    ImageView bg;
    LottieAnimationView doc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doc=findViewById(R.id.doctorlotties);
        bg=findViewById(R.id.bg);
        bg.animate().translationY(-3000).setDuration(1000).setStartDelay(4000);
        doc.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

    }
}