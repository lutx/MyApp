package com.example.lukas.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

import java.util.jar.Attributes;

public class SecondActivity extends AppCompatActivity  {

    private TextView showName;
    private TextView showSname;
    private TextView showAge;
    private TextView showSex;
    private String fname;
    private String sname;
    private  String age;
    private String rd;
    private  String rd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent =getIntent();
        Bundle basket = intent.getExtras();
        if (basket == null){
            return;
        }

        fname= basket.getString("fname");
        sname= basket.getString("sname");
        age= basket.getString("age");
        rd= basket.getString("rd");
        rd1=basket.getString("rd1");

        showName = findViewById(R.id.showName);
        showSname= findViewById(R.id.showSname);
        showAge= findViewById(R.id.showAge);
        showSex= findViewById(R.id.showSex);

        showName.setText(fname);
        showSname.setText(sname);
        showAge.setText(age);
        showSex.setText(rd);
        showSex.setText(rd1);
    }



    }

