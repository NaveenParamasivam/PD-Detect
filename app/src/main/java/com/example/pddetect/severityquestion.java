package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class severityquestion extends AppCompatActivity {
    TextView question;
    RadioButton opt1,opt2,opt3,opt4;
    Button Prev, nxt,result;
    RadioGroup selected;
    ProgressBar questionprogress;
    int n=0;
    String[] questions;
    String[] choice1;
    String[] choice2;
    String[] choice3;
    String[] choice4;
    Integer[] score;
    int currentprogress=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.severityquestion);
        selected=findViewById(R.id.answergroup);
        result=findViewById(R.id.button3);
        questionprogress=findViewById(R.id.progressBar);
        questionprogress.setMax(120);
        questionprogress.setProgress(currentprogress);
        result.setVisibility(View.INVISIBLE);
        questions=new String[12];
        choice1=new String[12];
        choice2=new String[12];
        choice3=new String[12];
        choice4=new String[12];
        score=new Integer[12];
        for(int i=0;i<12;i++)
            score[i]=-1;
        questions[0]="Cognitive Imipairment";
        choice1[0]="No Sign";
        choice2[0]="Cognitive dysfunction, mild interference with normal activities";
        choice3[0]="Cognitive dysfunction, moderate interference with normal activities";
        choice4[0]="Cognitive dysfunction precludes patient’s normal activities";
        questions[1]="Mood Disorders";
        choice1[1]="No Sign";
        choice2[1]="Episodes of depressed mood, not lasting more than a day";
        choice3[1]="Depressed mood sustain over days, minimal interference with normal activities";
        choice4[1]="Depressed mood precludes patient’s normal activities";
        questions[2]="Sleep Problems";
        choice1[2]="No Sign";
        choice2[2]="Sleep problems, trouble getting a full night of sleep";
        choice3[2]="Sleep problems, but sleeps more than half the night";
        choice4[2]="do not sleep for most of the night ";
        questions[3]="Dizziness, Fatigue";
        choice1[3]="No Sign";
        choice2[3]="Feelings occur, no troubles doing things ";
        choice3[3]="Feelings occur, some troubles doing things ";
        choice4[3]="Feelings preclude doing things";
        questions[4]="Tremor";
        choice1[4]="No Sign";
        choice2[4]="Tremor occurs, No trouble in doing any activities";
        choice3[4]="Tremor occurs, problems with only a few activities ";
        choice4[4]="3.\tTremor occurs, problems with many or all activities ";
        questions[5]="Freezing of Gait";
        choice1[5]="No Sign";
        choice2[5]="Freezing on starting of walking";
        choice3[5]="Freezing once during walking";
        choice4[5]="Freezing multiple times during walking";
        questions[6]="Rigidity";
        choice1[6]="No Sign";
        choice2[6]="Rigidity detected, but full ROM is easily achieved";
        choice3[6]="Rigidity detected, and full ROM is achieved with effort";
        choice4[6]="Rigidity detected, and full ROM is not achieved";
        questions[7]="Gait";
        choice1[7]="No Sign";
        choice2[7]="Independent walking with minor gait impairment. ";
        choice3[7]="Requires an assistance device for safe walking.";
        choice4[7]="Cannot walk at all or only with another person’s assistance";
        questions[8]="Postural Stability";
        choice1[8]="No Sign";
        choice2[8]="Mildly Unstable";
        choice3[8]="Moderately Unstable";
        choice4[8]="Unstable";
        questions[9]="Slowed Movement";
        choice1[9]="No Sign";
        choice2[9]="Mild global slowness and poverty of spontaneous movements.";
        choice3[9]="Moderate global slowness and poverty of spontaneous movements.  ";
        choice4[9]=" Slight global slowness and poverty of spontaneous movements. ";
        questions[10]="Loss of Smell";
        choice1[10]="No Sign";
        choice2[10]="Slight";
        choice3[10]="Moderate";
        choice4[10]="No smell detected";
        questions[11]="Low or Hoarse Voice";
        choice1[11]="No Sign";
        choice2[11]="Slightly low, not hoarse";
        choice3[11]="Slightly hoarse";
        choice4[11]="More hoarseness";
        question=findViewById(R.id.textview4);
        opt1=findViewById(R.id.option1);
        opt2=findViewById(R.id.option2);
        opt3=findViewById(R.id.option3);
        opt4=findViewById(R.id.option4);
        Prev=findViewById(R.id.button);
        nxt=findViewById(R.id.button2);
        questioncall(0);
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedid=selected.getCheckedRadioButtonId();
                // selectedradiobutton=(RadioButton)findViewById(selectedid);
                Toast.makeText(severityquestion.this,Integer.toString(selectedid), Toast.LENGTH_SHORT).show();
                currentprogress=currentprogress+10;
                questionprogress.setProgress(currentprogress);
                if(selectedid==2131231032)
                    score[n]=0;
                else if(selectedid==2131231033)
                    score[n]=1;
                else if(selectedid==2131231034)
                    score[n]=2;
                else if(selectedid==2131231035)
                    score[n]=3;

                n=n+1;
                questioncall(n);

            }
        });
        Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentprogress=currentprogress-10;
                questionprogress.setProgress(currentprogress);
                n=n-1;
                questioncall(n);
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //score Calculation
            }
        });

    }
    public void questioncall(int n)
    {
        question.setText("");
        opt1.setText("");
        opt2.setText("");
        opt3.setText("");
        opt4.setText("");
        question.setText(questions[n]);
        opt1.setText(choice1[n]);
        opt2.setText(choice2[n]);
        opt3.setText(choice3[n]);
        opt4.setText(choice4[n]);

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