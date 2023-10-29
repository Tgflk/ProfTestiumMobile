package com.example.proftest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class UserActivity extends AppCompatActivity {

    private ImageButton iB_home;
    private ImageButton iB_user;
    private ImageButton imB_curs;
    private ImageButton imB_tarif;
    private Button btn_creat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        iB_home = findViewById(R.id.iB_home);
        iB_user = findViewById(R.id.iB_user);
        imB_curs = findViewById(R.id.imB_curs);
        imB_tarif = findViewById(R.id.imB_tarif);
        btn_creat = findViewById(R.id.btn_creat);

        iB_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, MainMenu.class);
                startActivity(intent);


            }
        });
        imB_tarif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, ActivityTarif.class);
                startActivity(intent);

            }
        });
        iB_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, UserActivity.class);
                startActivity(intent);
            }
         });
        imB_curs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, MainCurse.class);
                startActivity(intent);
            }
        });
        btn_creat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, CreatActivity.class);
                startActivity(intent);
            }
        });

    }
}