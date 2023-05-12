package com.example.pacefinity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openFinancialAidCalculator(View view) {
        Intent intent = new Intent(this, FinancialAidCalculator.class);
        startActivity(intent);
    }

    public void openExternalResources(View view) {
        Intent intent = new Intent(this, external_resources.class);
        startActivity(intent);
    }

}