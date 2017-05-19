package com.example.bad.depressiontest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by bad on 5/19/2017.
 */

class ShowResult  extends AppCompatActivity{
    TextView tv;
    Button result,testbtn,resultbtn,infobtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);

    }

    @Override
    protected void onStart() {
        super.onStart();
        tv=(TextView)(findViewById(R.id.tv));
        resultbtn=(Button)(findViewById(R.id.resultbtn));
        testbtn=(Button)(findViewById(R.id.testbtn));
        infobtn=(Button)(findViewById(R.id.infobtn));
        testbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ShowResult.this,MainActivity.class);
                startActivity(i);
            }
        });
        resultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ShowResult.this,ShowResult.class);
                startActivity(i);
            }
        });
        infobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ShowResult.this,Information.class);
                startActivity(i);
            }
        });
    }
}
