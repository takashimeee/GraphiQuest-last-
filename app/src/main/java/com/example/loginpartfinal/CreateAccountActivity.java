package com.example.loginpartfinal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnBack, btnSignup;
    EditText etEmail, etPassword;
    RadioButton giverAcc, takerAcc;
    RadioGroup radiogroupacc;

    String userType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        btnBack = findViewById(R.id.btnBack);
        btnSignup = findViewById(R.id.btnSignup);
        radiogroupacc = findViewById(R.id.radiogroupacc);
        giverAcc = findViewById(R.id.GiverAcc);
        takerAcc = findViewById(R.id.TakerAcc);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

        btnSignup.setOnClickListener(this);

        // Set the listener for the back button
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(CreateAccountActivity.this, MainActivity.class);
            startActivity(intent);
        });

        radiogroupacc.clearCheck();

        radiogroupacc.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {

                if (checkedId == R.id.GiverAcc) {
                    userType = "Giver";
                } else if (checkedId == R.id.TakerAcc) {
                    userType = "Taker";
                }
            }
        });

    }

    public void onClick (View v){
        Intent intent;
        int id = v.getId();

        if (id == R.id.btnSignup){
            String mobile = etEmail.getText().toString();
            String password = etPassword.getText().toString();

            if (mobile.isEmpty() || password.isEmpty() || userType == null) {
                Toast.makeText(this, "Please fill all fields and select a role", Toast.LENGTH_SHORT).show();
            } else {
                SharedPreferences preferences = getSharedPreferences("user_credentials", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("mobile", mobile);
                editor.putString("password", password);
                editor.apply();

                intent = new Intent(this, AfterLoginActivity.class);
                intent.putExtra("userType", userType);
                startActivity(intent);
            }
        }
    }
}
