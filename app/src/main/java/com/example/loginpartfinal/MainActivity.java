package com.example.loginpartfinal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button btnLogin, btnCreate;
    TextView tvForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnCreate = findViewById(R.id.btnCreate);
        tvForgotPassword = findViewById(R.id.tvForgotPassword);

        btnLogin.setOnClickListener(v -> {
            String mobile = etEmail.getText().toString();
            String password = etPassword.getText().toString();

            SharedPreferences preferences = getSharedPreferences("user_credentials", MODE_PRIVATE);
            String savedMobile = preferences.getString("mobile", "");
            String savedPassword = preferences.getString("password", "");

            if (mobile.equals(savedMobile) && password.equals(savedPassword)) {
                Intent intent = new Intent(MainActivity.this, homepage.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Invalid mobile number or password", Toast.LENGTH_SHORT).show();
            }
        });

        btnCreate.setOnClickListener(v -> {
            // This already goes to CreateAccountActivity, which is correct
            Intent intent = new Intent(MainActivity.this, CreateAccountActivity.class);
            startActivity(intent);
        });

        tvForgotPassword.setOnClickListener(v -> {
            // This correctly goes to FindAccountActivity
            Intent intent = new Intent(MainActivity.this, FindAccountActivity.class);
            startActivity(intent);
        });
    }
}
