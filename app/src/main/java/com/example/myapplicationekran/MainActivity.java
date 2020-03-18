package com.example.myapplicationekran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getActionBar().hide();
        }catch (Exception e){
        }
        setContentView(R.layout.activity_main);
    }
}
