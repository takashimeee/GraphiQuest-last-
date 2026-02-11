package com.example.loginpartfinal;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class pendingtask extends AppCompatActivity implements View.OnClickListener {


    ImageView btnback, pendingpic, homebutton, leaderboardbutton, searchbutton, taskboardbutton, profilebutton, msgbtn;
    FrameLayout pendingframe2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendingtask);
        pendingpic = findViewById(R.id.pendingpic);
        btnback = findViewById(R.id.btnback);
        pendingframe2 = findViewById(R.id.pendingframe2);

        homebutton = findViewById(R.id.homebutton);
        leaderboardbutton = findViewById(R.id.leaderboardbutton);
        searchbutton = findViewById(R.id.searchbutton);
        taskboardbutton = findViewById(R.id.taskboardbutton);
        profilebutton = findViewById(R.id.profilebutton);
        homebutton.setOnClickListener(this);
        leaderboardbutton.setOnClickListener(this);
        searchbutton.setOnClickListener(this);
        taskboardbutton.setOnClickListener(this);
        profilebutton.setOnClickListener(this);
        btnback.setOnClickListener(this);
        pendingpic.setOnClickListener(this);
        pendingframe2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;

        if (id == R.id.pendingpic || id == R.id.pendingframe2) {
            intent = new Intent(this, pendingbar.class);
            startActivity(intent);
        } else if (id == R.id.btnback) {
            intent = new Intent(this, homepagegiver.class);
            startActivity(intent);
        } else if (id == R.id.searchbutton) {
            intent = new Intent(this, giversearchbar1.class);
            startActivity(intent);
        } else if (id == R.id.homebutton || id == R.id.leaderboardbutton) {
            intent = new Intent(this, LeaderboardFullList.class);
            startActivity(intent);
        } else if (id == R.id.taskboardbutton) {
            // Do nothing, already on this screen
        } else if (id == R.id.profilebutton) {
            intent = new Intent(this, userprofile.class);
            startActivity(intent);
        }
    }
}
