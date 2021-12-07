package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button bpd,bse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        bpd=findViewById(R.id.button);
        bse=findViewById(R.id.button1);
        bpd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(MainActivity3.this,MainActivity6.class);
                startActivity(intent3);
            }
        });
        bse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(MainActivity3.this,MainActivity9.class);
                startActivity(intent4);

            }
        });
    }
}