package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class severityresult extends AppCompatActivity {
    TextView resultscore;
    Button homenavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.severityresult);
        String data = getIntent().getStringExtra("result");
        Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG).show();
        resultscore=findViewById(R.id.textView3);
        homenavigation=findViewById(R.id.button2);
        resultscore.setText(data);
        homenavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homenavigationintent=new Intent(severityresult.this,homepage.class);
                startActivity(homenavigationintent);
            }
        });
    }
}