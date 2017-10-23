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

        Name=(TextView) findViewById(R.id.Name);
       InName=(EditText) findViewById(R.id.InName);
        Sname =(TextView) findViewById(R.id.SName);
        InSname=(EditText) findViewById(R.id.InSname);
        Age=(TextView) findViewById(R.id.Age);
        InAge=(EditText) findViewById(R.id.InAge);
        button =(Button) findViewById(R.id.button);
        radio=(RadioButton) findViewById(R.id.radio);
        radio1=(RadioButton) findViewById(R.id.radio1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),SecondActivity.class);

                intent.putExtra("name","InName");
                intent.putExtra("name1","InSname");
                intent.putExtra("name2","InAge");
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
