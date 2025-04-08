package com.satish.lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail;
    RadioGroup radioGroupGender;
    CheckBox checkBoxTerms;
    Spinner spinnerCountry;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        checkBoxTerms = findViewById(R.id.checkBoxTerms);
        spinnerCountry = findViewById(R.id.spinnerCountry);
        btnSubmit = findViewById(R.id.btnSubmit);

        // setup spinner
        String[] countries = {
                "Select Country",
                "Nepal",
                "USA",
                "India",
                "UK",
                "Canada",
                "Australia"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, countries);
        spinnerCountry.setAdapter(adapter);

        // Button Click Event
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitForm();
            }
        });
    }

    private void submitForm() {
        // Display information in a Toast
        String message = "Registration button clzzzicked";
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
