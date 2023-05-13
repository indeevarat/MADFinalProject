package com.example.pacefinity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Scholarships extends AppCompatActivity {

    ArrayList<ScholarshipJava> scholarshipList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarships);

        RecyclerView recyclerView = findViewById(R.id.scholarshipRecycler);
        setUpScholarships();
        ScholarshipRVA adapter = new ScholarshipRVA(this,scholarshipList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpScholarships(){
        String[] scholarshipNames = getResources().getStringArray(R.array.scholarships);
        String[] moneyRange = getResources().getStringArray(R.array.moneyRange);
        String[] requirements = getResources().getStringArray(R.array.requirements);
        String[] links = getResources().getStringArray(R.array.links);
        String[] otherInfo = getResources().getStringArray(R.array.otherInfo);

        for(int i=0; i<scholarshipNames.length;i++){
            scholarshipList.add(new ScholarshipJava(scholarshipNames[i],moneyRange[i],requirements[i],links[i],otherInfo[i]));
        }
    }
}