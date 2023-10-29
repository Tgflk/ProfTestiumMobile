package com.example.proftest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityVebYes extends AppCompatActivity {

    private ImageButton iB_home5;
    private ImageButton iB_user5;
    private ImageButton imB_curs5;
    private ImageButton imB_tarif5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veb_yes);

        iB_home5 = findViewById(R.id.iB_home5);
        iB_user5 = findViewById(R.id.iB_user5);
        imB_curs5 = findViewById(R.id.imB_curs5);
        imB_tarif5 = findViewById(R.id.imB_tarif5);

        iB_home5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityVebYes.this, MainMenu.class);
                startActivity(intent);


            }
        });
        imB_tarif5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityVebYes.this, ActivityTarif.class);
                startActivity(intent);

            }
        });
        imB_curs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityVebYes.this, MainCurse.class);
                startActivity(intent);
            }
        });
    }
}

