package com.example.lukas.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText InName;
    private EditText InSname;
    private EditText InAge;
    private RadioButton radio;
    private RadioButton radio1;
    private Button button;
    private String fname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        InName=findViewById(R.id.InName);
        InSname = findViewById(R.id.InSname);
        InAge = findViewById(R.id.InAge);
        button= findViewById(R.id.btn);
        radio =findViewById(R.id.radio);
        radio1=findViewById(R.id.radio1);



        button.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);

                Bundle basket = new Bundle();

                basket.putString("fname",InName.getText().toString());
                basket.putString("sname",InSname.getText().toString());
                basket.putString("age",InAge.getText().toString());
                basket.putString("rd",radio.getText().toString());
                basket.putString("rd1",radio1.getText().toString());


                intent.putExtras(basket);

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
                        radio1.setText("Mezczyzna");

            }
    }


}
