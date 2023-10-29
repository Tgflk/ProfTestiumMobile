package com.example.proftest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CreatActivity extends AppCompatActivity {

    private ImageButton iB_home4;
    private ImageButton iB_user4;
    private ImageButton imB_curs4;
    private ImageButton imB_tarif4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat);

        iB_home4 = findViewById(R.id.iB_home4);
        iB_user4 = findViewById(R.id.iB_user4);
        imB_curs4 = findViewById(R.id.imB_curs4);
        imB_tarif4 = findViewById(R.id.imB_tarif4);

        iB_home4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreatActivity.this, MainMenu.class);
                startActivity(intent);


            }
        });
        imB_tarif4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreatActivity.this, ActivityTarif.class);
                startActivity(intent);

            }
        });

        iB_user4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreatActivity.this, ActivityVebYes.class);
                startActivity(intent);
            }
        });

        imB_curs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreatActivity.this, MainCurse.class);
                startActivity(intent);
            }
        });
    }
}

