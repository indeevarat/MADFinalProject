package com.example.pacefinity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExternalResources extends AppCompatActivity {

    private TextView gilmanTextView;
    private TextView fulbrightTextView;
    private TextView flasTextView;
    private TextView pgoTextView;
    private TextView cbyxTextView;
    private TextView ddraTextView;
    private TextView barryTextView;
    private TextView exportTextView;
    private TextView nsfTextView;
    private TextView hsfTextView;
    private TextView noaaTextView;
    private TextView starTextView;
    private TextView stokesTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external_resources);

        gilmanTextView = findViewById(R.id.gilman_text_view);
        fulbrightTextView = findViewById(R.id.fulbright_text_view);
        flasTextView = findViewById(R.id.flas_text_view);
        pgoTextView = findViewById(R.id.pgo_text_view);
        cbyxTextView = findViewById(R.id.cbyx_text_view);
        ddraTextView = findViewById(R.id.ddra_text_view);
        barryTextView = findViewById(R.id.barry_text_view);
        exportTextView = findViewById(R.id.export_text_view);
        nsfTextView = findViewById(R.id.nsf_text_view);
        hsfTextView = findViewById(R.id.hsf_text_view);
        noaaTextView = findViewById(R.id.noaa_text_view);
        starTextView = findViewById(R.id.star_text_view);
        stokesTextView = findViewById(R.id.stokes_text_view);

        setOnClickListeners();
    }

    private void setOnClickListeners() {
        gilmanTextView.setOnClickListener(v -> openUrl("https://www.gilmanscholarship.org/"));
        fulbrightTextView.setOnClickListener(v -> openUrl("https://us.fulbrightonline.org/fulbright-us-student-program"));
        flasTextView.setOnClickListener(v -> openUrl("https://www2.ed.gov/programs/iegpsflasf/index.html"));
        pgoTextView.setOnClickListener(v -> openUrl("https://www.rotcprojectgo.org"));
        cbyxTextView.setOnClickListener(v -> openUrl("https://usagermanyscholarship.org"));
        ddraTextView.setOnClickListener(v -> openUrl("https://www2.ed.gov/programs/iegpsddrap/index.html"));
        barryTextView.setOnClickListener(v -> openUrl("https://goldwaterscholarship.gov"));
        exportTextView.setOnClickListener(v -> openUrl("https://www.export.gov/"));
        nsfTextView.setOnClickListener(v -> openUrl("https://www.nsf.gov/"));
        hsfTextView.setOnClickListener(v -> openUrl("https://www.truman.gov/"));
        noaaTextView.setOnClickListener(v -> openUrl("https://www.noaa.gov/office-education/noaa-educational-partnership-program-undergraduate-scholarship"));
        starTextView.setOnClickListener(v -> openUrl("https://www.epa.gov/research-grants/science-achieve-results-star-fellowship-program"));
        stokesTextView.setOnClickListener(v -> openUrl("https://www.intelligencecareers.gov/icstudents.html"));
    }

    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
