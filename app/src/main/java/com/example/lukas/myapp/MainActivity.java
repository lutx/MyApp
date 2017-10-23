package com.example.lukas.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    private TextView Name;
    private EditText InName;
    private TextView Sname;
    private EditText InSname;
    private TextView Age;
    private EditText InAge;
    private RadioButton radio;
    private  RadioButton radio1;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Name=(EditText) findViewById(R.id.InName);
        Sname=(EditText) findViewById(R.id.InSname);
        Age=(EditText) findViewById(R.id.InAge);
        button =(Button) findViewById(R.id.btn);
        radio=(RadioButton) findViewById(R.id.radio);
        radio1=(RadioButton) findViewById(R.id.radio1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),SecondActivity.class);
                //startActivity(intent);
                intent.putExtra("name","Name");
                intent.putExtra("name1","Sname");
                intent.putExtra("name2","Age");
                intent.putExtra("name3","radio");
                intent.putExtra("name4","radio1");
                startActivity(intent);

            }

            });
    }

    public void onRadioButtonCliked(View view)
    {
        boolean checked =( (RadioButton)view).isChecked();

            switch (view.getId())
            {
                case R.id.radio:
                    if (checked)
                    radio.setText("Kobieta");
                    break;
                case R.id.radio1:
                    if (checked)
                        radio.setText("Mezczyzna");

            }
    }
}
