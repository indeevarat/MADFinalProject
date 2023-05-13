package com.example.pacefinity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void openFinancialAidCalculator(View view) {
        Intent intent = new Intent(this, FinancialAidCalculator.class);
        startActivity(intent);
    }
    public void openScholarships(View view){
        Intent intent = new Intent(this, Scholarships.class);
        startActivity(intent);
    }
    public void openExternalResources(View view){
        Intent intent = new Intent(this,ExternalResources.class);
        startActivity(intent);
    }

}