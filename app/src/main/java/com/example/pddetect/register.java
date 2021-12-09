package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class register extends AppCompatActivity {
    Button submit;
    TextView name, age, height, weight;
    TextView gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        submit = findViewById(R.id.submit);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        gender = findViewById(R.id.spinnertext);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        submit.setText("UPDATE PROFILE");
        final AutoCompleteTextView genderAuto = findViewById(R.id.spinnertext);

        ArrayList<String> genderList = getCustomerList();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(register.this, android.R.layout.simple_spinner_item, genderList);
        fillDetails();
        genderAuto.setAdapter(adapter);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences profileData = getSharedPreferences("profile",MODE_PRIVATE);
                SharedPreferences.Editor profileEdit = profileData.edit();
                profileEdit.putString("name", name.getText().toString());
                profileEdit.putInt("age",Integer.parseInt(age.getText().toString()));
                profileEdit.putString("gender", gender.getText().toString());
                profileEdit.putFloat("height",Float.parseFloat(height.getText().toString()));
                profileEdit.putFloat("weight",Float.parseFloat(weight.getText().toString()));
                profileEdit.commit();
                Intent homeIntent = new Intent(register.this, homepage.class);
                startActivity(homeIntent);
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

    private void fillDetails(){
        SharedPreferences profileCheck = getSharedPreferences("profile", MODE_PRIVATE);
        String nameValue = profileCheck.getString("name","");
        if(!name.equals("")){
            Integer ageValue = profileCheck.getInt("age", 0);
            String genderValue = profileCheck.getString("gender","");
            Float heightValue = profileCheck.getFloat("height",0);
            Float weightValue = profileCheck.getFloat("weight",0);

            name.setText(nameValue);
            age.setText(ageValue.toString());
            gender.setText(genderValue);
            height.setText(heightValue.toString());
            weight.setText(weightValue.toString());
        }
    }
}