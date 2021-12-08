package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class homepage extends AppCompatActivity {
    Button pdbutton,severitybutton;
    LottieAnimationView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        pdbutton=findViewById(R.id.button);
        severitybutton=findViewById(R.id.button1);
        menu=findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                PopupMenu popupMenu = new PopupMenu(homepage.this,menu);
                popupMenu.getMenuInflater().inflate(R.menu.popup, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        if(menuItem.getTitle()=="Team Info")
                        {
                            Intent teamintent=new Intent(homepage.this, teaminfo.class);
                            startActivity(teamintent);
                        }
                        else
                        {
                            Intent aboutintent=new Intent(homepage.this, about.class);
                            startActivity(aboutintent);
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
        pdbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loadintent=new Intent(homepage.this, loadingscreen.class);
                startActivity(loadintent);
            }
        });
        severitybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent severityintent=new Intent(homepage.this, severityquestion.class);
                startActivity(severityintent);

            }
        });
    }
}