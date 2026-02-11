package com.example.loginpartfinal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class messagetab extends AppCompatActivity {

    ImageView backrtohmpge;
    ImageView profilemsg;
    TextView profilename1;
    String userType;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        userType = getIntent().getStringExtra("userType");

        if (userType != null && userType.equals("Giver")) {
            setContentView(R.layout.activity_messagetab);
        } else {
            setContentView(R.layout.activity_messagetab);
        }

        backrtohmpge = findViewById(R.id.backtohmpge);

        backrtohmpge.setOnClickListener(v -> {
            if (userType != null && userType.equals("Giver")) {
                Intent intent = new Intent(messagetab.this, homepagegiver.class);
                startActivity(intent);
            } else {
                Intent intent = new Intent(messagetab.this, homepagetaker.class);
                startActivity(intent);
            }
        });

        profilemsg = findViewById(R.id.profilemsg);
        profilename1 = findViewById(R.id.profilename1);

        View.OnClickListener profileClickListener = v -> {
            Intent intent = new Intent(messagetab.this, InsideMessage.class);
            startActivity(intent);
        };

        profilemsg.setOnClickListener(profileClickListener);
        profilename1.setOnClickListener(profileClickListener);

    }
}
