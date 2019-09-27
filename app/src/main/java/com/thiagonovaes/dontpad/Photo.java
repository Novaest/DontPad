package com.thiagonovaes.dontpad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Photo extends AppCompatActivity {

    public void startPhotoFullActivity(View view) {

        Intent secondActivity = new Intent(this, PhotoFull.class);
        startActivity(secondActivity);
    }
    public void startTextActivity(View view) {

        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
    }
}
