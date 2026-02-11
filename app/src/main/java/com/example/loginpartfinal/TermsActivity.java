package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TermsActivity extends AppCompatActivity {

    Button btnAgree, btnBack;
    CheckBox btncheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        btnAgree = findViewById(R.id.btnAgree);
        btnBack = findViewById(R.id.btnBack);
        btncheckbox = findViewById(R.id.btncheckbox);

        Intent intent = getIntent();
        String userType = intent.getStringExtra("userType");

        btnAgree.setOnClickListener(v -> {
            if (btncheckbox.isChecked()) {
                Intent newIntent;
                if (userType != null) {
                    if (userType.equals("Giver")) {
                        newIntent = new Intent(TermsActivity.this, homepagegiver.class);
                    } else {
                        newIntent = new Intent(TermsActivity.this, homepagetaker.class);
                    }
                    newIntent.putExtra("userType", userType);
                    Toast.makeText(this, "Thank you for agreeing!", Toast.LENGTH_SHORT).show();
                    startActivity(newIntent);
                }
            } else {
                Toast.makeText(this, "Please acknowledge the terms to continue.", Toast.LENGTH_SHORT).show();
            }
        });

        btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}
