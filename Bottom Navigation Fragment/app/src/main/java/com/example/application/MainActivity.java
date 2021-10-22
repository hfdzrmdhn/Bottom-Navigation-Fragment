package com.example.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
        
    }
    
}
/*don't forget to subscribe my YouTube channel for more Tutorial and mod*/
/*
https://youtube.com/channel/UC_lCMHEhEOFYgJL6fg1ZzQA */