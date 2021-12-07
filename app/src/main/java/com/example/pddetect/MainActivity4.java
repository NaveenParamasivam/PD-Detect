package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity4 extends AppCompatActivity {
    ImageButton ib1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ib1=findViewById(R.id.imageButton1);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ih1=new Intent(MainActivity4.this,MainActivity3.class);
                startActivity(ih1);
            }
        });
    }
}