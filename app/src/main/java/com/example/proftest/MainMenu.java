package com.example.proftest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenu extends AppCompatActivity {

    private ImageButton iB_home1;
    private ImageButton iB_user1;
    private ImageButton imB_curs1;
    private ImageButton imB_tarif1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        iB_home1 = findViewById(R.id.iB_home1);
        iB_user1 = findViewById(R.id.iB_user1);
        imB_curs1 = findViewById(R.id.imB_curs1);
        imB_tarif1 = findViewById(R.id.imB_tarif1);

        imB_tarif1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, ActivityTarif.class);
                startActivity(intent);
            }
        });
        iB_home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MainMenu.class);
                startActivity(intent);


            }
        });
        iB_user1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, UserActivity.class);
                startActivity(intent);
            }
        });
        imB_curs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MainCurse.class);
                startActivity(intent);
            }
        });

    }
}