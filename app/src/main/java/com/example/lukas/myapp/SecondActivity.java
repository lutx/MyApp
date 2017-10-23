package com.example.lukas.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

import java.util.jar.Attributes;

public class SecondActivity extends AppCompatActivity  {

    private TextView showName;
    private TextView showSname;
    private TextView showAge;
   // private TextView showSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showSname=(TextView) findViewById(R.id.showSname);
        showName=(TextView) findViewById(R.id.showName);
        showAge=(TextView) findViewById(R.id.showAge);


        Bundle bundle = getIntent().getExtras();
        String Name = bundle.getString("name");
        String Name1 = bundle.getString("name1");
        String Name2 = bundle.getString("name2");


        showName.setText(Name);
        showSname.setText(Name1);
        showAge.setText(Name2);

    }



    }

