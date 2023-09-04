package com.polije.tif.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void constraintLayout(View view) {
        Intent pindahConstraintLayout = new Intent(MainActivity.this,ConstraintLayout.class);
        startActivity(pindahConstraintLayout);
    }

    public void frameLayout(View view) {
        Intent pindahFrameLayout = new Intent(MainActivity.this,FrameLayout.class);
        startActivity(pindahFrameLayout);
    }
}