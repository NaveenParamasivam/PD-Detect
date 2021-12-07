package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent1 =new Intent(MainActivity6.this,MainActivity8.class);
                startActivity(intent1);
                finish();
            }
        },5000);
    }
}