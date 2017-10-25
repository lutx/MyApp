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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=(RadioGroup)findViewById(R.id.radioOptions);
        InName=findViewById(R.id.InName);
        InSname = findViewById(R.id.InSname);
        InAge = findViewById(R.id.InAge);
        button= findViewById(R.id.btn);

        button.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);

                Bundle basket = new Bundle();

                int selectedId=radioGroup.getCheckedRadioButtonId();
                radioButton=(RadioButton)findViewById(selectedId);
                String selectedRadio= radioButton.getText().toString();

                basket.putString("fname",InName.getText().toString());
                basket.putString("sname",InSname.getText().toString());
                basket.putString("age",InAge.getText().toString());
                basket.putString("sex",selectedRadio);

                Toast.makeText(MainActivity.this, "Twoja płeć to " + radioButton.getText(), Toast.LENGTH_SHORT).show();

                intent.putExtras(basket);
                startActivity(intent);

            }
            });
    }
}
