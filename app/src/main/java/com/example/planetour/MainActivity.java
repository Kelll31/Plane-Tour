package com.example.planetour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity{
    TextView textView;
    Button Button1;
    private Object TextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView = (TextView) findViewById(R.id.TextView);
        Button1 = (Button) findViewById(R.id.Button1);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText();
            }
        });


    }
}