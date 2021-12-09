package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class severityresult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.severityresult);
        String data = getIntent().getStringExtra("result");
        Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG).show();
    }
}