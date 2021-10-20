package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaParser;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup_activity extends AppCompatActivity {

    Button registationButtonIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().setTitle("Sign in");
        registationButtonIn = findViewById(R.id.RegistationButtonIn);

        registationButtonIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup_activity.this,Sugnup.class);
                startActivity(intent);
            }
        });

    }
}