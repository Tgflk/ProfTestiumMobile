package com.example.proftest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainCurse extends AppCompatActivity {

    private ImageButton iB_home3;
    private ImageButton iB_user3;
    private ImageButton imB_curs3;
    private ImageButton imB_tarif3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_curse);

        iB_home3 = findViewById(R.id.iB_home3);
        iB_user3 = findViewById(R.id.iB_user3);
        imB_curs3 = findViewById(R.id.imB_curs3);
        imB_tarif3 = findViewById(R.id.imB_tarif3);

        imB_tarif3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainCurse.this, ActivityTarif.class);
                startActivity(intent);
            }
        });
        iB_home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainCurse.this, MainMenu.class);
                startActivity(intent);


            }
        });
        iB_user3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainCurse.this, UserActivity.class);
                startActivity(intent);
            }
        });
        imB_curs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainCurse.this, MainCurse.class);
                startActivity(intent);
            }
        });

    }
}