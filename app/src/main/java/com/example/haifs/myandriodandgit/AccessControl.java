package com.example.haifs.myandriodandgit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class AccessControl extends AppCompatActivity {

    public String codess = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_control);


        Button code1 = (Button) findViewById(R.id.button);
        Button code2 = (Button) findViewById(R.id.button2);
        Button code3 = (Button) findViewById(R.id.button3);
        Button code4 = (Button) findViewById(R.id.button4);
        Button code5 = (Button) findViewById(R.id.sumbitb);

//pg:21:Lec:3
        code1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perform action on click
                //pg:22 Lecture 3
                //Security code of "1234" So,
                codess +=  "1";

            }
        });
        code2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                codess +=  "2";

            }
        });
        code3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                codess +=  "3";

            }
        });
        code4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                codess +=  "4";

            }
        });
        code5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(codess.equals("1234")){
                    Intent i = new Intent(AccessControl.this, MainActivity.class );
                    startActivity(i);
                Toast.makeText(getApplicationContext(),"The App is Unlocked", Toast.LENGTH_LONG).show();


                }

                if(!"1234".equals(codess)){
                    Intent i = new Intent(AccessControl.this, MainActivity.class );
                    startActivity(i);
                    Toast.makeText(getApplicationContext(),"opps app is still locked! Try again", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}