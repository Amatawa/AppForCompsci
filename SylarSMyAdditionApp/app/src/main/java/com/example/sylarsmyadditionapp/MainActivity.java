package com.example.sylarsmyadditionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewByID(R.id.addBtn);
        addBtn.setOnClickListerner(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               EditText firstNumEditText = findViewById(R.id.firstNumEditText);
               EditText secondNumEditText = findViewById(R.id.secondNumEditText);
               TextView resultTextView = findViewById(R.id.resultTextView);

               double num1 = Double.parseDouble(firstNumEditText.getText().toString());
               double num2 = Double.parseDouble(secondNumEditText.getText().toString());
               double result = num1 + num2;
               resultTextView.setText(result + "");
           }
        });
    }
}
