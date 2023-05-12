package com.example.pacefinity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

import com.example.pacefinity.databinding.ActivityExternalResourcesBinding;

public class external_resources extends AppCompatActivity {

    private ActivityExternalResourcesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityExternalResourcesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Find the TextView that displays the text "Benjamin A. Gilman International Scholarship Program"
        TextView gilmanTextView = findViewById(R.id.gilman_text_view);

        // Set an OnClickListener on the TextView
        gilmanTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define the URL to open
                String url = "https://www.gilmanscholarship.org/";

                // Create an Intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the Activity to open the URL
                startActivity(intent);
            }
        });

        // Find the TextView that displays the text "Fulbright U.S. Student Program"
        TextView fulbrightTextView = findViewById(R.id.fulbright_text_view);

        // Set an OnClickListener on the TextView
        fulbrightTextView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // Define the URL to open
                String url = "https://us.fulbrightonline.org/fulbright-us-student-program";

                // Create an Intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the Activity to open the URL
                startActivity(intent);
            }
        });

        // Find the TextView that displays the text "Fulbright U.S. Student Program"
        TextView borenTextView = findViewById(R.id.flas_text_view);

        // Set an OnClickListener on the TextView
        fulbrightTextView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // Define the URL to open
                String url = "https://www2.ed.gov/programs/iegpsflasf/index.html";

                // Create an Intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the Activity to open the URL
                startActivity(intent);
            }
        });

    }
}





