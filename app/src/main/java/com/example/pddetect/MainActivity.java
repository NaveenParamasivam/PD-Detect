package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    ImageView bg;
    TextView pd;
    LottieAnimationView doc;
    private static int SPLASH_SCREEN =5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doc=findViewById(R.id.doctorlotties);
        bg=findViewById(R.id.bg);
        pd=findViewById(R.id.pdtext);
        bg.animate().translationY(-3000).setDuration(1000).setStartDelay(4000);
        doc.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        pd.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent1 =new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent1);
                finish();
            }
        },SPLASH_SCREEN);
    }
}