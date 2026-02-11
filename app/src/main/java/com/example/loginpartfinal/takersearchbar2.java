package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class takersearchbar2 extends AppCompatActivity implements View.OnClickListener {

    ImageView homebutton, leaderboardbutton, searchbutton, taskboardbutton, profilebutton, msgbtn, backarrow;
    Button btnkendrick, btnbaxia, btnMark, btnbeast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takersearchbar2);

        homebutton = findViewById(R.id.homebutton);
        leaderboardbutton = findViewById(R.id.leaderboardbutton);
        searchbutton = findViewById(R.id.searchbutton);
        taskboardbutton = findViewById(R.id.taskboardbutton);
        profilebutton = findViewById(R.id.profilebutton);
        msgbtn = findViewById(R.id.msgbtn);
        backarrow = findViewById(R.id.btnback);
        btnkendrick = findViewById(R.id.btnkendrick);
        btnbaxia = findViewById(R.id.btnbaxia);
        btnMark = findViewById(R.id.btnMark);
        btnbeast = findViewById(R.id.btnbeast);
        homebutton.setOnClickListener(this);
        leaderboardbutton.setOnClickListener(this);
        searchbutton.setOnClickListener(this);
        taskboardbutton.setOnClickListener(this);
        profilebutton.setOnClickListener(this);
        msgbtn.setOnClickListener(this);
        backarrow.setOnClickListener(this);
        btnkendrick.setOnClickListener(this);
        btnbaxia.setOnClickListener(this);
        btnMark.setOnClickListener(this);
        btnbeast.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;



        if (id == R.id.btnkendrick) {
            intent = new Intent(this, takersearchbar3.class);
            startActivity(intent);
        } else if (id == R.id.searchbutton) {
            intent = new Intent(this, takersearchbar1.class);
            startActivity(intent);
            } else if (id == R.id.btnback) {
                intent = new Intent(this, takersearchbar1.class);
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
