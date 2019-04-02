package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.google.com";
                Uri webaddress = Uri.parse(google);

                Intent goToGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (goToGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToGoogle);
                }
            }
        });

        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.sylarsmyadditionapp");
                if (startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });

        Button listViewBasBtn = (Button) findViewById(R.id.listViewBasBtn);
        listViewBasBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.listview");
                if (startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });

        Button straitLineBtn = (Button) findViewById(R.id.straitLineBtn);
        straitLineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.straightlinecalc");
                if (startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });

        Button extraListViewBtn = (Button) findViewById(R.id.listViewAdvBtn);
        extraListViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.extralistview");
                if (startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });

        Button quadCalcBtn = (Button) findViewById(R.id.quadCalcBtn);
        quadCalcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.quadraticcalculator");
                if (startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });
    }
}
