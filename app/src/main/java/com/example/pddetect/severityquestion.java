package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class severityquestion extends AppCompatActivity {
    TextView question;
    RadioButton opt1,opt2,opt3,opt4;
    Button Prev, nxt,result;
    RadioGroup selected;
    ProgressBar questionProgress;
    int n=0;
    JSONObject jsonObject;
    JSONArray jsonArray;
    Integer[] score;
    int currentProgress=10;

    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = this.getAssets().open("questions.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.severityquestion);

        selected = findViewById(R.id.answergroup);
        result = findViewById(R.id.button3);
        questionProgress = findViewById(R.id.progressBar);
        questionProgress.setMax(120);
        questionProgress.setProgress(currentProgress);
        result.setVisibility(View.INVISIBLE);
        score=new Integer[12];
        for(int i=0;i<12;i++)
            score[i]=-1;

        question=findViewById(R.id.textview4);
        opt1=findViewById(R.id.option1);
        opt2=findViewById(R.id.option2);
        opt3=findViewById(R.id.option3);
        opt4=findViewById(R.id.option4);
        Prev=findViewById(R.id.button);
        nxt=findViewById(R.id.button2);

        try{
            jsonObject = new JSONObject(loadJSONFromAsset());
            jsonArray = jsonObject.getJSONArray("questions");

        } catch (Exception e) {
            e.printStackTrace();
        }

        questionCall(0);

        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedid = selected.getCheckedRadioButtonId();
                currentProgress = currentProgress+10;
                questionProgress.setProgress(currentProgress);
                if(selectedid == opt1.getId())
                    score[n]=0;
                else if(selectedid == opt2.getId())
                    score[n]=1;
                else if(selectedid == opt3.getId())
                    score[n]=2;
                else if(selectedid == opt4.getId())
                    score[n]=3;

                n=n+1;
                questionCall(n);
            }
        });
        Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentProgress=currentProgress-10;
                questionProgress.setProgress(currentProgress);
                n=n-1;
                questionCall(n);
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //score Calculation
            }
        });

    }
    public void questionCall(int n)
    {
        question.setText("");
        opt1.setText("");
        opt2.setText("");
        opt3.setText("");
        opt4.setText("");

        try {
            JSONObject currentObj = jsonArray.getJSONObject(n);
            question.setText(currentObj.getString("question"));
            JSONArray choices = currentObj.getJSONArray("choices");
            opt1.setText(choices.getString(0));
            opt2.setText(choices.getString(1));
            opt3.setText(choices.getString(2));
            opt4.setText(choices.getString(3));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        if(n==0)
        {
            Prev.setEnabled(false);
        }
        else
        {
            Prev.setEnabled(true);
        }
        if(n==11)
        {
            nxt.setVisibility(View.INVISIBLE);
            result.setVisibility(View.VISIBLE);
        }
        else
        {
            nxt.setVisibility(View.VISIBLE);
            result.setVisibility(View.INVISIBLE);
        }

    }
}