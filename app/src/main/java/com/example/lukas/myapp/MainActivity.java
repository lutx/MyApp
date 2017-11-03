package com.example.lukas.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText InName;
    private EditText InSname;
    private EditText InAge;
    private Button button;
    private String fname;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private TextView status;
    private  RadioButton rButton;
    private  RadioButton rButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioOptions);
        InName = (EditText) findViewById(R.id.InName);
        InSname = (EditText) findViewById(R.id.InSname);
        InAge = (EditText) findViewById(R.id.InAge);
        button = (Button) findViewById(R.id.btn);
        rButton= (RadioButton) findViewById(R.id.radio);
        rButton1= (RadioButton) findViewById(R.id.radio1);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(selectedId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!InName.getText().toString().equals(" ") && !InSname.getText().toString().equals(" ")
                        && !InAge.getText().toString().equals(" ") && !(rButton.isChecked()==rButton1.isChecked())) {
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    Bundle basket = new Bundle();

                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    radioButton = (RadioButton) findViewById(selectedId);
                    String selectedRadio = radioButton.getText().toString();

                    basket.putString("fname", InName.getText().toString());
                    basket.putString("sname", InSname.getText().toString());
                    basket.putString("age", InAge.getText().toString());
                    basket.putString("sex", selectedRadio);

                    Toast.makeText(MainActivity.this, "Witaj " + InName.getText()+" "+ InSname.getText(), Toast.LENGTH_SHORT).show();

                    intent.putExtras(basket);
                    startActivity(intent);
                    finish();
                }
                else
                    Toast.makeText(MainActivity.this, "Podaj Imie , Nazwisko , Wiek ,Płeć", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
