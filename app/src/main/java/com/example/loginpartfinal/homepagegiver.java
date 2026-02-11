package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class homepagegiver extends AppCompatActivity implements View.OnClickListener {

    ImageView homebutton, leaderboardbutton, searchbutton, taskboardbutton, profilebutton, taskbutton, msgbtn;
    String userType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagegiver);

        userType = getIntent().getStringExtra("userType");

        homebutton = findViewById(R.id.homebutton);
        leaderboardbutton = findViewById(R.id.leaderboardbutton);
        searchbutton = findViewById(R.id.searchbutton);
        taskboardbutton = findViewById(R.id.pendingboardbutton);
        profilebutton = findViewById(R.id.profilebutton);
        taskbutton = findViewById(R.id.postbtn);
        msgbtn = findViewById(R.id.msgbtn);

        taskbutton.setOnClickListener(this);
        msgbtn.setOnClickListener(this);
        homebutton.setOnClickListener(this);
        leaderboardbutton.setOnClickListener(this);
        searchbutton.setOnClickListener(this);
        taskboardbutton.setOnClickListener(this);
        profilebutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;

        if (id == R.id.postbtn) {
            intent = new Intent(this, upload.class);
            startActivity(intent);
        } else if (id == R.id.msgbtn || id == R.id.mainmessagetab) {
            intent = new Intent(this, messagetab.class);
            intent.putExtra("userType", userType);
            startActivity(intent);
        } else if (id == R.id.searchbutton) {
            intent = new Intent(this, giversearchbar1.class);
            startActivity(intent);
        } else if (id == R.id.homebutton || id == R.id.leaderboardbutton) {
            intent = new Intent(this, LeaderboardMain.class);
            startActivity(intent);
        } else if (id == R.id.pendingboardbutton) {
            intent = new Intent(this, pendingtask.class);
            startActivity(intent);
        } else if (id == R.id.profilebutton) {
            intent = new Intent(this, userprofile.class);
            startActivity(intent);
        }
    }
}
