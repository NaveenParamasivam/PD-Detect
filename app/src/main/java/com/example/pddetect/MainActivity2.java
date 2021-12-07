package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
   // TextView pddetect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // pddetect=findViewById(R.id.text);
        //pddetect.animate().translationY(-1000).setDuration(1000).setStartDelay(4000);
        final AutoCompleteTextView customerAutoTV = findViewById(R.id.customerTextView);

        // create list of customer
        ArrayList<String> customerList = getCustomerList();

        //Create adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_spinner_item, customerList);

        //Set adapter
        customerAutoTV.setAdapter(adapter);
    }
    private ArrayList<String> getCustomerList()
    {
        ArrayList<String> customers = new ArrayList<>();
        customers.add("Male");
        customers.add("Female");
        return customers;
    }
}