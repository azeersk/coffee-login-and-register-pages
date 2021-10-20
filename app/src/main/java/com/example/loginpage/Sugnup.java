package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Sugnup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugnup);
        getSupportActionBar().setTitle("Create Account");
    }
}