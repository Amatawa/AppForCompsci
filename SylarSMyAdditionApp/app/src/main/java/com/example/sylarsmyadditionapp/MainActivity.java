package com.example.sylarsmyadditionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        Button subBtn = (Button) findViewById(R.id.subBtn);
        Button mulBtn = (Button) findViewById(R.id.mulBtn);
        Button divBtn = (Button) findViewById(R.id.divBtn);
        Button sqrtBtn = (Button) findViewById(R.id.sqrtBtn);
        Button powBtn = (Button) findViewById(R.id.sqrBtn);
        final TextView resultTextView = findViewById(R.id.resultTextView);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(((getNumberOne((EditText) findViewById(R.id.firstNumEditText))) + getNumberTwo((EditText) findViewById(R.id.secondNumEditText))) + "");
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(((getNumberOne((EditText) findViewById(R.id.firstNumEditText))) - getNumberTwo((EditText) findViewById(R.id.secondNumEditText))) + "");
            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(((getNumberOne((EditText) findViewById(R.id.firstNumEditText))) * getNumberTwo((EditText) findViewById(R.id.secondNumEditText))) + "");
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(((getNumberOne((EditText) findViewById(R.id.firstNumEditText))) / getNumberTwo((EditText) findViewById(R.id.secondNumEditText))) + "");
            }
        });

        sqrtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText((Math.pow(getNumberOne((EditText) findViewById(R.id.firstNumEditText)), (1/getNumberTwo((EditText) findViewById(R.id.secondNumEditText))))) + "");
            }
        });

        powBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText((Math.pow(getNumberOne((EditText) findViewById(R.id.firstNumEditText)), (getNumberTwo((EditText) findViewById(R.id.secondNumEditText))))) + "");
            }
        });



        }

    private double getNumberOne(EditText num1) {
        return Integer.parseInt(num1.getText().toString());
    }

    private double getNumberTwo(EditText num2){
        return Double.parseDouble(num2.getText().toString());
    }


}
