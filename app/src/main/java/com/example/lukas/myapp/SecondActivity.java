package com.example.lukas.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.jar.Attributes;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class SecondActivity extends AppCompatActivity {

    private TextView showName;
    private TextView showSname;
    private TextView showAge;
    private TextView showSex;
    private String fname;
    private String sname;
    private String age;
    private String sex;
    private Button btnHome;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Bundle basket = intent.getExtras();
        if (basket == null) {
            return;
        }

        fname = basket.getString("fname");
        sname = basket.getString("sname");
        age = basket.getString("age");
        sex = basket.getString("sex");

        showName = (TextView) findViewById(R.id.showName);
        showSname = (TextView) findViewById(R.id.showSname);
        showAge = (TextView) findViewById(R.id.showAge);
        showSex = (TextView) findViewById(R.id.showSex);
        btnHome = (Button) findViewById(R.id.btnHome);
        btnNext = (Button) findViewById(R.id.btnNext);
        showName.setText("Twoje Imie to : " + fname);
        showSname.setText("Twoje Nazwisko to : " + sname);
        showAge.setText("Wiek : " + age);
        showSex.setText("Plec : " + sex);

        btnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();

            }
        });
        btnNext.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), ShowProcesy.class);
                startActivity(a);
            }
        });
    }


}

