package com.example.pert7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void ClickLogout(View view) {
        MainActivity.logout(this);
    }

    public void BacktoHome(View view) {
        Intent intent = new Intent (Biodata.this, MainActivity.class);
        startActivity(intent);
    }
}