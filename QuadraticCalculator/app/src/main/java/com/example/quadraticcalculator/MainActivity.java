package com.example.quadraticcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        final TextView aInfoText = (TextView) findViewById(R.id.ainfoTextView);
        final TextView bInfoText = (TextView) findViewById(R.id.bInfoTextView);
        final TextView cInfoText = (TextView) findViewById(R.id.cInfoTextView);

        calcBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double x1 = getXCoor1((EditText) findViewById(R.id.x1EditText));
                double x2 = getXCoor2((EditText) findViewById(R.id.x2EditText));
                double x3 = getXCoor3((EditText) findViewById(R.id.x3EditText));
                double y1 = getYCoor1((EditText) findViewById(R.id.y1EditText));
                double y2 = getYCoor2((EditText) findViewById(R.id.y2EditText));
                double y3 = getYCoor3((EditText) findViewById(R.id.y3EditText));

                double a = ((x1*(y3-y2)) + (x2*(y1-y3)) + (x3*(y2-y1))) / ((x1-x2)*(x1-x3)*(x2-x3));
                double b = ((y2-y1)/(x2-x1))-(a*(x1+x2));
                double c = (y1 - (a*Math.pow(x1,2)) - (b*x1));

                aInfoText.setText("A = " + a);
                bInfoText.setText("B = " + b);
                cInfoText.setText("C = " + c);
            }
        });
    }
    private double getXCoor1(EditText xCoor1) {
        return Double.parseDouble(xCoor1.getText().toString());
    }

    private double getXCoor2(EditText xCoor2) {
        return Double.parseDouble(xCoor2.getText().toString());
    }
    private double getXCoor3(EditText xCoor3) {
        return Double.parseDouble(xCoor3.getText().toString());
    }
    private double getYCoor1(EditText yCoor1) {
        return Double.parseDouble(yCoor1.getText().toString());
    }
    private double getYCoor2(EditText yCoor2) {
        return Double.parseDouble(yCoor2.getText().toString());
    }
    private double getYCoor3(EditText yCoor3) {
        return Double.parseDouble(yCoor3.getText().toString());
    }
}
