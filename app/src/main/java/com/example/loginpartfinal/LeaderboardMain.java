package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LeaderboardMain extends AppCompatActivity implements  View.OnClickListener {


    ImageView backBtn, homebutton, leaderboardbutton, searchbutton, taskboardbutton, profilebutton;
    Button uiDesignBtn, webDesignBtn, adManagerBtn, d3ModelingBtn, artDirectorBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.leaderboard_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        backBtn = findViewById(R.id.backBtn);
        uiDesignBtn = findViewById(R.id.uiDesignBtn);
        webDesignBtn = findViewById(R.id.webDesignBtn);
        adManagerBtn = findViewById(R.id.adManagerBtn);
        d3ModelingBtn = findViewById(R.id.d3ModelingBtn);
        artDirectorBtn = findViewById(R.id.artDirectorBtn);
        homebutton = findViewById(R.id.homebutton);
        leaderboardbutton = findViewById(R.id.leaderboardbutton);
        searchbutton = findViewById(R.id.searchbutton);
        taskboardbutton = findViewById(R.id.taskboardbutton);
        profilebutton = findViewById(R.id.profilebutton);


        backBtn.setOnClickListener(this);
        homebutton.setOnClickListener(this);
        leaderboardbutton.setOnClickListener(this);
        searchbutton.setOnClickListener(this);
        taskboardbutton.setOnClickListener(this);
        profilebutton.setOnClickListener(this);

        uiDesignBtn.setOnClickListener(v->openLeaderboard(LeaderboardConstants.TYPE_UI));
        webDesignBtn.setOnClickListener(v->openLeaderboard(LeaderboardConstants.TYPE_WEB));
        adManagerBtn.setOnClickListener(v->openLeaderboard(LeaderboardConstants.TYPE_AD));
        d3ModelingBtn.setOnClickListener(v->openLeaderboard(LeaderboardConstants.TYPE_3D));
        artDirectorBtn.setOnClickListener(v->openLeaderboard(LeaderboardConstants.TYPE_ART));
    }
    private void openLeaderboard(String type) {
        Intent intent = new Intent(this, LeaderboardPodiumActivity.class);
        intent.putExtra(
                LeaderboardConstants.extraLeaderboardType,
                type
        );
        startActivity(intent);
    }

    public void onClick (View v){
        Intent intent;
        int id = v.getId();

        if (id == R.id.backBtn) {
            intent = new Intent(this, homepage.class);
            startActivity(intent);
        } else if (id == R.id.homebutton) {
            intent = new Intent(this, homepage.class);
            startActivity(intent);
        } else if (id == R.id.leaderboardbutton) {
            intent = new Intent(this, LeaderboardMain.class);
            startActivity(intent);
        } else if (id == R.id.searchbutton) {
            intent = new Intent(this, takersearchbar1.class);
            startActivity(intent);
        } else if (id == R.id.taskboardbutton) {
            intent = new Intent(this, taskbar1.class);
            startActivity(intent);
        } else if (id == R.id.profilebutton) {
            intent = new Intent(this, userprofile.class);
            startActivity(intent);
        }
    }
}
