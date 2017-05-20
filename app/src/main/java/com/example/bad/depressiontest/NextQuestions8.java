package com.example.bad.depressiontest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by bad on 5/20/2017.
 */

class NextQuestions8 extends AppCompatActivity {
    Button submitbtn,testbtn,resultbtn,infobtn;
    EditText ans;
    TextView textq;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question9);
    }

    @Override
    protected void onStart() {
        super.onStart();
        submitbtn=(Button)(findViewById(R.id.submitbtn));
        testbtn=(Button)(findViewById(R.id.testbtn));
        resultbtn=(Button)(findViewById(R.id.resultbtn));
        infobtn=(Button)(findViewById(R.id.infobtn));
        ans=(EditText)findViewById(R.id.ans);
        textq=(TextView)(findViewById(R.id.textq));
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NextQuestions8.this,ShowResult.class);
                startActivity(i);
            }
        });
        testbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(NextQuestions8.this,MainActivity.class);
                startActivity(i);
            }
        });
        resultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(NextQuestions8.this,ShowResult.class);
                startActivity(i);
            }
        });
        infobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(NextQuestions8.this,Information.class);
                startActivity(i);
            }
        });

    }
}