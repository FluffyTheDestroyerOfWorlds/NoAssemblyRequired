package com.bigskysolutionsinc.boesen.noassemblyrequired;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imgButton1 = (ImageButton) findViewById(R.id.imageButton);
        ImageButton imgButton2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton imgButton3 = (ImageButton) findViewById(R.id.imageButton3);

        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Bike.class));
            }
        });

        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, picnic.class));
            }
        });

        imgButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, dresser.class));
            }
        });


    }
}
