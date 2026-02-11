package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class giversearchbar3 extends AppCompatActivity implements View.OnClickListener {

    ImageView homebutton, leaderboardbutton, searchbutton, taskboardbutton, profilebutton, msgbtn, btnback;
    Button btnhireme, btnmessagee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giversearchbar3);

        homebutton = findViewById(R.id.homebutton);
        leaderboardbutton = findViewById(R.id.leaderboardbutton);
        searchbutton = findViewById(R.id.searchbutton);
        taskboardbutton = findViewById(R.id.taskboardbutton);
        profilebutton = findViewById(R.id.profilebutton);
        msgbtn = findViewById(R.id.msgbtn);
        btnback = findViewById(R.id.btnback);

        btnhireme = findViewById(R.id.btnhireme);
        btnmessagee = findViewById(R.id.btnmessagee);

        homebutton.setOnClickListener(this);
        leaderboardbutton.setOnClickListener(this);
        searchbutton.setOnClickListener(this);
        taskboardbutton.setOnClickListener(this);
        profilebutton.setOnClickListener(this);
        msgbtn.setOnClickListener(this);
        btnback.setOnClickListener(this);
        btnhireme.setOnClickListener(this);
        btnmessagee.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;

        if (id == R.id.btnhireme) {
            intent = new Intent(this, upload.class);
            startActivity(intent);
        } else if (id == R.id.btnmessagee) {
            intent = new Intent(this, InsideMessage.class);
            startActivity(intent);
        } else if (id == R.id.btnback) {
            intent = new Intent(this, giversearchbar2.class);
            startActivity(intent);
        } else if (id == R.id.searchbutton) {
            intent = new Intent(this, giversearchbar1.class);
            startActivity(intent);
        } else if (id == R.id.homebutton || id == R.id.leaderboardbutton) {
            intent = new Intent(this, LeaderboardFullList.class);
            startActivity(intent);
        } else if (id == R.id.taskboardbutton) {
            intent = new Intent(this, pendingtask.class);
            startActivity(intent);
        } else if (id == R.id.profilebutton) {
            intent = new Intent(this, userprofile.class);
            startActivity(intent);
        } else if (id == R.id.msgbtn) {
            intent = new Intent(this, messagetab.class);
            startActivity(intent);
        }
    }
}
