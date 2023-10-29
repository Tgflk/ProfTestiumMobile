package com.example.proftest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityTarif extends AppCompatActivity {

    private ImageButton iB_home2;
    private ImageButton iB_user2;
    private ImageButton imB_curs2;
    private ImageButton imB_tarif2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarif);

        iB_home2 = findViewById(R.id.iB_home2);
        iB_user2 = findViewById(R.id.iB_user2);
        imB_curs2 = findViewById(R.id.imB_curs2);
        imB_tarif2 = findViewById(R.id.imB_tarif2);

        iB_user2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTarif.this, UserActivity.class);
                startActivity(intent);
            }
        });
        iB_home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTarif.this, MainMenu.class);
                startActivity(intent);
            }
        });
        imB_curs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTarif.this, MainCurse.class);
                startActivity(intent);
            }
        });
    }
}