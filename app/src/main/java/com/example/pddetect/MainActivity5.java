package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity5 extends AppCompatActivity {
    ImageButton ib2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ib2=findViewById(R.id.imageButton2);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ih2=new Intent(MainActivity5.this,MainActivity3.class);
                startActivity(ih2);
            }
        });
    }
}