package com.example.bad.depressiontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button startbtn,testbtn,resultbtn,infobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        tv=(TextView)(findViewById(R.id.tv));
        startbtn=(Button)(findViewById(R.id.startbtn));
        testbtn=(Button)(findViewById(R.id.testbtn));
        resultbtn=(Button)(findViewById(R.id.resultbtn));
        infobtn=(Button)(findViewById(R.id.infobtn));
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,StartTest.class);
                startActivity(i);
            }
        });
        testbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        resultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,ShowResult.class);
                startActivity(i);
            }
        });
        infobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Information.class);
                startActivity(i);
            }
        });
    }

}
