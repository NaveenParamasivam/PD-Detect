package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class register extends AppCompatActivity {
    Button submit;
    TextView Name,Age,Height,Weight;
    TextView Gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        submit=findViewById(R.id.submit);
        Name=findViewById(R.id.name);
        Age=findViewById(R.id.age);
        Gender=findViewById(R.id.spinnertext);
        Height=findViewById(R.id.height);
        Weight=findViewById(R.id.weight);
        final AutoCompleteTextView genderauto = findViewById(R.id.spinnertext);

        ArrayList<String> genderList = getCustomerList();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(register.this, android.R.layout.simple_spinner_item, genderList);

        genderauto.setAdapter(adapter);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences profiledata=getSharedPreferences("profile",MODE_PRIVATE);
                SharedPreferences.Editor profileedit=profiledata.edit();
                profileedit.putString("name",Name.getText().toString());
                profileedit.putInt("age",Integer.parseInt(Age.getText().toString()));
                profileedit.putString("gender",Gender.getText().toString());
                profileedit.putFloat("height",Float.parseFloat(Height.getText().toString()));
                profileedit.putFloat("weight",Float.parseFloat(Weight.getText().toString()));
                profileedit.commit();
                //Toast.makeText(register.this, Name.getText().toString()+" "+Age.getText().toString()+" "+Gender.getText().toString()+" "+Height.getText().toString()+" "+Weight.getText().toString(), Toast.LENGTH_SHORT).show();
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