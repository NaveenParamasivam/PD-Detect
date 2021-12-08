package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.util.ArrayList;

public class register extends AppCompatActivity {
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        submit=findViewById(R.id.submit);

        final AutoCompleteTextView genderauto = findViewById(R.id.customerTextView);

        ArrayList<String> genderList = getCustomerList();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(register.this, android.R.layout.simple_spinner_item, genderList);

        genderauto.setAdapter(adapter);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent0=new Intent(register.this, homepage.class);
                startActivity(homeintent0);
            }
        });
    }
    private ArrayList<String> getCustomerList()
    {
        ArrayList<String> gender = new ArrayList<>();
        gender.add("Male");
        gender.add("Female");
        return gender;
    }
}