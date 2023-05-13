
package com.example.pacefinity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExternalResources extends AppCompatActivity {

    // Find the TextView that displays the text "Benjamin A. Gilman International Scholarship Program"
    TextView gilmanTextView = findViewById(R.id.gilman_text_view);

    // Find the TextView that displays the text "Fulbright U.S. Student Program"
    TextView fulbrightTextView = findViewById(R.id.fulbright_text_view);

    // Find the TextView that displays the text "Foreign Language and Area Studies (FLAS) Fellowships"
    TextView flasTextView = findViewById(R.id.flas_text_view);


    // Find the TextView that displays the text "Project GO"
    TextView pgoTextView = findViewById(R.id.pgo_text_view);


    // Find the TextView that displays the text "The Congress Bundestag Youth Exchange (CBYX)"
    TextView cbyxTextView = findViewById(R.id.cbyx_text_view);

    // Find the TextView that displays the text "Fulbright-Hays Doctoral Dissertation Research Abroad (DDRA) Fellowship Program "
    TextView ddraTextView = findViewById(R.id.ddra_text_view);

    // Find the TextView that displays the text "Barry Goldwater Scholarship and Excellence in Education Program "
    TextView barryTextView = findViewById(R.id.barry_text_view);

    // Find the TextView that displays the text "Export.gov"
    TextView exportTextView = findViewById(R.id.export_text_view);

    // Find the TextView that displays the text "National Science Foundation"
    TextView nsfTextView = findViewById(R.id.nsf_text_view);

    // Find the TextView that displays the text "Harry S. Truman Scholarship Foundation "
    TextView hsfTextView = findViewById(R.id.hsf_text_view);

    // Find the TextView that displays the text "NOAA Educational Partnership Program Undergraduate Scholarship "
    TextView noaaTextView = findViewById(R.id.noaa_text_view);

    // Find the TextView that displays the text "Science To Achieve Results (STAR)"
    TextView starTextView = findViewById(R.id.star_text_view);

    // Find the TextView that displays the text "Stokes Scholarship Program"
    TextView stokesTextView = findViewById(R.id.stokes_text_view);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external_resources);



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



        // Set an OnClickListener on the TextView
        fulbrightTextView.setOnClickListener(new View.OnClickListener() {

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


        // Set an OnClickListener on the TextView
        flasTextView.setOnClickListener(new View.OnClickListener() {

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

        // Set an OnClickListener on the TextView
        pgoTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Define the URL to open
                String url = "https://www.rotcprojectgo.org";

                // Create an Intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the Activity to open the URL
                startActivity(intent);
            }
        });


        // Set an OnClickListener on the TextView
        cbyxTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Define the URL to open
                String url = "https://usagermanyscholarship.org";

                // Create an Intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the Activity to open the URL
                startActivity(intent);
            }
        });



        // Set an OnClickListener on the TextView
        ddraTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Define the URL to open
                String url = "https://www2.ed.gov/programs/iegpsddrap/index.html";

                // Create an Intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the Activity to open the URL
                startActivity(intent);
            }
        });



        // Set an OnClickListener on the TextView
        barryTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Define the URL to open
                String url = "https://goldwaterscholarship.gov";

                // Create an Intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the Activity to open the URL
                startActivity(intent);
            }
        });


        // Set an OnClickListener on the TextView
        exportTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Define the URL to open
                String url = "https://search.export.gov/search?affiliate=47593d2fa&query=student+internships&submit.x=0&submit.y=0";

                // Create an Intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the Activity to open the URL
                startActivity(intent);
            }
        });



        // Set an OnClickListener on the TextView
        nsfTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Define the URL to open
                String url = "https://new.nsf.gov/funding/opportunities";

                // Create an Intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the Activity to open the URL
                startActivity(intent);
            }
        });



        // Set an OnClickListener on the TextView
        hsfTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Define the URL to open
                String url = "https://www.truman.gov";

                // Create an Intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the Activity to open the URL
                startActivity(intent);
            }
        });


        // Set an OnClickListener on the TextView
        noaaTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Define the URL to open
                String url = "https://www.noaa.gov/office-education/epp-msi/undergraduate-scholarship";

                // Create an Intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the Activity to open the URL
                startActivity(intent);
            }
        });



        // Set an OnClickListener on the TextView
        starTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Define the URL to open
                String url = "https://www.epa.gov/research-grants";

                // Create an Intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the Activity to open the URL
                startActivity(intent);
            }
        });


        // Set an OnClickListener on the TextView
        stokesTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Define the URL to open
                String url = "https://www.nga.mil";

                // Create an Intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the Activity to open the URL
                startActivity(intent);
            }
        });
    }


}