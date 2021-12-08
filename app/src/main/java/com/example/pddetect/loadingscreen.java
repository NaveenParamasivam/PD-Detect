package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class loadingscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loadingscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent negativeintent =new Intent(loadingscreen.this, positivescreen.class);
                startActivity(negativeintent);
                finish();
            }
        },5000);
    }
}