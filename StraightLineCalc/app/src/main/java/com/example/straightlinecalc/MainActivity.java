package com.example.straightlinecalc;

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

        Button calcBtn = (Button) findViewById(R.id.findItBtn);
        final TextView slopeText = (TextView) findViewById(R.id.slopeTextView);
        final TextView yInt = (TextView) findViewById(R.id.yIntTextView);



        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x1 = getXCoor1((EditText) findViewById(R.id.xCoor1EditText));
                double x2 = getXCoor2((EditText) findViewById(R.id.xCoor2EditText));
                double y1 = getYCoor1((EditText) findViewById(R.id.yCoor1EditText));
                double y2 = getYCoor2((EditText) findViewById(R.id.yCoor2EditText));
                double slope = ((y1-y2)/(x1-x2));
                slopeText.setText("slope = " + slope);

                yInt.setText("b = " + (y1-(slope*x1)));

            }
        });
    }
        private double getXCoor1(EditText xCoor1) {
            return Double.parseDouble(xCoor1.getText().toString());
    }

    private double getXCoor2(EditText xCoor2) {
        return Double.parseDouble(xCoor2.getText().toString());
    }
    private double getYCoor1(EditText yCoor1) {
        return Double.parseDouble(yCoor1.getText().toString());
    }
    private double getYCoor2(EditText yCoor2) {
        return Double.parseDouble(yCoor2.getText().toString());
    }
}
