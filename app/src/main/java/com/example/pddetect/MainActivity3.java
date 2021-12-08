package com.example.pddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button bpd,bse;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        bpd=findViewById(R.id.button);
        bse=findViewById(R.id.button1);
        ib=findViewById(R.id.imageButton);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity3.this, ib);
                popupMenu.getMenuInflater().inflate(R.menu.popup, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        //Toast.makeText(MainActivity3.this, "You Clicked " + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                        if(menuItem.getTitle()=="Team Info")
                        {
                            Intent intentt=new Intent(MainActivity3.this,MainActivity4.class);
                            startActivity(intentt);
                        }
                        else
                        {
                            Intent intenta=new Intent(MainActivity3.this,MainActivity5.class);
                            startActivity(intenta);
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
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