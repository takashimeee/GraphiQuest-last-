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

    Button btnBack, btnSignup, btnFemale, btnMale, btnOthers;
    EditText etFirst, etLast, etMM, etDD, etYY, etEmail, etPassword;
    RadioButton giverAcc, takerAcc;
    RadioGroup radiogroupacc;

    String userType, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        btnBack = findViewById(R.id.btnBack);
        btnSignup = findViewById(R.id.btnSignup);
        btnFemale = findViewById(R.id.btnFemale);
        btnMale = findViewById(R.id.btnMale);
        btnOthers = findViewById(R.id.btnOthers);

        etFirst = findViewById(R.id.etFirst);
        etLast = findViewById(R.id.etLast);
        etMM = findViewById(R.id.etMM);
        etDD = findViewById(R.id.etDD);
        etYY = findViewById(R.id.etYY);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

        radiogroupacc = findViewById(R.id.radiogroupacc);
        giverAcc = findViewById(R.id.GiverAcc);
        takerAcc = findViewById(R.id.TakerAcc);

        btnSignup.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnFemale.setOnClickListener(this);
        btnMale.setOnClickListener(this);
        btnOthers.setOnClickListener(this);

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

        if (id == R.id.btnSignup) {
            String first = etFirst.getText().toString();
            String last = etLast.getText().toString();
            String mm = etMM.getText().toString();
            String dd = etDD.getText().toString();
            String yy = etYY.getText().toString();
            String mobile = etEmail.getText().toString();
            String password = etPassword.getText().toString();

            if (first.isEmpty() || last.isEmpty() || mm.isEmpty() || dd.isEmpty() || yy.isEmpty() || mobile.isEmpty() || password.isEmpty() || userType == null || gender == null) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else if (Integer.parseInt(mm) > 12) {
                Toast.makeText(this, "Invalid month", Toast.LENGTH_SHORT).show();
            } else if (Integer.parseInt(dd) > 31) {
                Toast.makeText(this, "Invalid day", Toast.LENGTH_SHORT).show();
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
        } else if (id == R.id.btnBack) {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.btnFemale) {
            gender = "Female";
            Toast.makeText(this, "Female selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.btnMale) {
            gender = "Male";
            Toast.makeText(this, "Male selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.btnOthers) {
            gender = "Others";
            Toast.makeText(this, "Others selected", Toast.LENGTH_SHORT).show();
        }
    }
}
