package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class takersearchbar1 extends AppCompatActivity implements View.OnClickListener {

    ImageView homebutton, leaderboardbutton, searchbutton, taskboardbutton, profilebutton, msgbtn;
    Button btnWebDesign, btnPv, btnUIDesign, btnGameDev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takersearchbar1);

        homebutton = findViewById(R.id.homebutton);
        leaderboardbutton = findViewById(R.id.leaderboardbutton);
        searchbutton = findViewById(R.id.searchbutton);
        taskboardbutton = findViewById(R.id.taskboardbutton);
        profilebutton = findViewById(R.id.profilebutton);
        msgbtn = findViewById(R.id.msgbtn);

        btnWebDesign = findViewById(R.id.btnWebDesign);
        btnPv = findViewById(R.id.btnPv);
        btnUIDesign = findViewById(R.id.btnUIDesign);
        btnGameDev = findViewById(R.id.btnGameDev);

        homebutton.setOnClickListener(this);
        leaderboardbutton.setOnClickListener(this);
        searchbutton.setOnClickListener(this);
        taskboardbutton.setOnClickListener(this);
        profilebutton.setOnClickListener(this);
        msgbtn.setOnClickListener(this);

        btnWebDesign.setOnClickListener(this);
        btnPv.setOnClickListener(this);
        btnUIDesign.setOnClickListener(this);
        btnGameDev.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;

        if (id == R.id.btnWebDesign || id == R.id.btnPv || id == R.id.btnUIDesign || id == R.id.btnGameDev) {
            intent = new Intent(this, takersearchbar2.class);
            startActivity(intent);
        } else if (id == R.id.searchbutton) {
            // Do nothing, already on this screen
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
