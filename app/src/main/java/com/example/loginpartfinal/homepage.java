package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class homepage extends AppCompatActivity {
    ImageView  homebutton, leaderboardbutton, searchbutton, taskboardbutton, profilebutton, msgbtn;
    FrameLayout taskframe1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagetaker);


        homebutton = findViewById(R.id.homebutton);
        leaderboardbutton = findViewById(R.id.leaderboardbutton);
        searchbutton = findViewById(R.id.searchbutton);
        taskboardbutton = findViewById(R.id.taskboardbutton);
        profilebutton = findViewById(R.id.profilebutton);
        msgbtn = findViewById(R.id.msgbtn);
        taskframe1 = findViewById(R.id.taskframe1);



        homebutton.setOnClickListener(v -> {
            Intent intent = new Intent(homepage.this, homepage.class);
            startActivity(intent);
        });
//        homepage to homepage

        leaderboardbutton.setOnClickListener(v -> {
            Intent intent = new Intent(homepage.this,LeaderboardMain.class);
            startActivity(intent);
        });
//        homepage to leaderboardbutton

        searchbutton.setOnClickListener(v -> {
            Intent intent = new Intent(homepage.this, takersearchbar1.class);
            startActivity(intent);
        });
//        homepage to search

        taskboardbutton.setOnClickListener(v -> {
            Intent intent = new Intent(homepage.this, taskbar1.class);
            startActivity(intent);
        });
//        homepage to taskboard

        profilebutton.setOnClickListener(v -> {
            Intent intent = new Intent(homepage.this, userprofile.class);
            startActivity(intent);
        });

        msgbtn.setOnClickListener(v -> {
            Intent intent = new Intent(homepage.this, messagetab.class);
            startActivity(intent);
        });
        taskframe1.setOnClickListener(v -> {
            Intent intent = new Intent(homepage.this, apply.class);
            startActivity(intent);
        });
    }
}
