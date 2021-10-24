package com.example.okeqmean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void registration(View view) {
        setContentView(R.layout.registration);
    }

    public void start(View view) {
        setContentView(R.layout.activity_main);
    }

    public void main(View view) {
        setContentView(R.layout.main);
    }

    public void card(View view) {
        setContentView(R.layout.card);
    }

    public void draft1(View view) { setContentView(R.layout.drafts); }

    public void draft2(View view) {
        setContentView(R.layout.drafts2);
    }

    public void draft3(View view) {
        setContentView(R.layout.drafts3);
    }
}

