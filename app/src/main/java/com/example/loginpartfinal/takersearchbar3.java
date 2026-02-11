package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class takersearchbar3 extends AppCompatActivity implements View.OnClickListener {

    ImageView btnback;
    Button btnsendreq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takersearchbar3);

        btnback = findViewById(R.id.btnback);
        btnsendreq = findViewById(R.id.btnsendreq);

        btnback.setOnClickListener(this);
        btnsendreq.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;

        if (id == R.id.btnsendreq) {
            intent = new Intent(this, Request.class);
            startActivity(intent);
        } else if (id == R.id.btnback) {
            intent = new Intent(this, takersearchbar2.class);
            startActivity(intent);
        }
    }
}
