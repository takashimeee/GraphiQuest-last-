package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class homepagetaker extends AppCompatActivity implements View.OnClickListener {

    ImageView searchButton, homeButton, leaderboardButton, taskboardbutton, profilebutton, chattab, boxbox;

    TextView descriptiontext, creattitle;

    String userType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagetaker);

        userType = getIntent().getStringExtra("userType");
        creattitle = findViewById(R.id.creattitle);
        boxbox = findViewById(R.id.boxbox);
        chattab = findViewById(R.id.msgbtn);
        searchButton = findViewById(R.id.searchbutton);
        homeButton = findViewById(R.id.homebutton);
        leaderboardButton = findViewById(R.id.leaderboardbutton);
        taskboardbutton = findViewById(R.id.taskboardbutton);
        profilebutton = findViewById(R.id.profilebutton);
        searchButton.setOnClickListener(this);
        homeButton.setOnClickListener(this);
        leaderboardButton.setOnClickListener(this);
        taskboardbutton.setOnClickListener(this);
        profilebutton.setOnClickListener(this);
        chattab.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;

        if (id == R.id.boxbox) {
            intent = new Intent(this, apply.class);
            startActivity(intent);

            if (id == R.id.creattitle) {
                intent = new Intent(this, apply.class);
                startActivity(intent);

                if (id == R.id.searchbutton) {
                    intent = new Intent(this, takersearchbar1.class);
                    startActivity(intent);
                } else if (id == R.id.homebutton || id == R.id.leaderboardbutton) {
                    intent = new Intent(this, LeaderboardMain.class);
                    startActivity(intent);
                } else if (id == R.id.taskboardbutton) {
                    intent = new Intent(this, pendingtask.class);
                    startActivity(intent);
                } else if (id == R.id.profilebutton) {
                    intent = new Intent(this, userprofile.class);
                    startActivity(intent);
                } else if (id == R.id.msgbtn) {
                    intent = new Intent(this, messagetab.class);
                    intent.putExtra("userType", userType);
                    startActivity(intent);
                }
            }
        }
    }
}
