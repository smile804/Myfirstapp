package com.example.haifs.myandriodandgit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView Welcome_Screen = (TextView) findViewById(R.id.Welcomee);
       Button Access_Screen = (Button) findViewById(R.id.button1);
        // lecture note3 pg:21
        Access_Screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AccessControl.class);
                startActivity(intent);
                // lecture note4 pg:12

            }
        });


        }

    }

