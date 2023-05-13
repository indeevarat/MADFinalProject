package com.example.pacefinity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FinancialAidCalculator extends AppCompatActivity {
    private EditText incomeInput, feeInput, gpaInput;
    private TextView aidOutput;
    private Button aidButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_aid_calculator);

        incomeInput = findViewById(R.id.income_input);
        feeInput = findViewById(R.id.fee_input);
        gpaInput = findViewById(R.id.gpa_input);

        aidOutput = findViewById(R.id.aid_output);

        aidButton = findViewById(R.id.aid_button);
        aidButton.setOnClickListener(view -> calculateAid());
    }

    private void calculateAid() {
        double income = Double.parseDouble(incomeInput.getText().toString());
        double tuitionFee = Double.parseDouble(feeInput.getText().toString());
        double gpa = Double.parseDouble(gpaInput.getText().toString());

        double aidPercentage = 0;
        if (income < 35000) {
            if (gpa >= 3 && gpa < 3.3) {
                aidPercentage = 0.05;
            } else if (gpa >= 3.3 && gpa < 3.5) {
                aidPercentage = 0.06;
            } else if (gpa >= 3.5) {
                aidPercentage = 0.07;
            } else {
                aidOutput.setText(R.string.no_aid);
                return;
            }

            double aidAmount = aidPercentage * tuitionFee;
            aidOutput.setText(getString(R.string.your_financial_aid_is_usd) + String.format("%.2f", aidAmount));
        } else {
            aidOutput.setText("Not eligible for aid");
        }
    }
}
