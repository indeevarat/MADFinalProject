package com.example.pacefinity;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class bganim extends AppCompatActivity {
    ImageView bgapp, cloverimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_landing);
        bgapp = (ImageView) findViewById(R.id.bgapp);
        cloverimg = (ImageView) findViewById(R.id.cloverimg);

        bgapp.animate().translationY(-1200).setDuration(800).setStartDelay(300);
        cloverimg.animate().alpha(0).setDuration(800).setStartDelay(600);


    }
}