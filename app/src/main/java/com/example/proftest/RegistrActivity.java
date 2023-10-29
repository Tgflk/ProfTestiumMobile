package com.example.proftest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrActivity extends AppCompatActivity {
    private TextView log_txt;

    private EditText email_register;
    private EditText password_register;
    private Button btn_register;

    private FirebaseAuth mAuth;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr);

        mAuth = FirebaseAuth.getInstance();

        email_register = findViewById(R.id.email_register);
        password_register = findViewById(R.id.password_register);
        btn_register = findViewById(R.id.btn_register);
        log_txt = findViewById(R.id.log_txt);

        log_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrActivity.this, LogActivity.class);
                startActivity(intent);
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email_register.getText().toString().isEmpty() || password_register.getText().toString().isEmpty()) {
                    Toast.makeText(RegistrActivity.this, "Fields cannot be empty", Toast.LENGTH_SHORT).show();
                }else{
                    mAuth.createUserWithEmailAndPassword(email_register.getText().toString(), password_register.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Intent intent = new Intent(RegistrActivity.this, UserActivity.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(RegistrActivity.this,"You have some errors",Toast.LENGTH_SHORT).show();

                            }
                        }
                    });
                }

            }
        });
    }
}