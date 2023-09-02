package com.example.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android_demo_lib.HelloWord;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HelloWord.PrintLog("hahaha","hohoho");
    }
}