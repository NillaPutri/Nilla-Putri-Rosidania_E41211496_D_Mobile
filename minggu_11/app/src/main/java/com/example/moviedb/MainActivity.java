package com.example.moviedb;


import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView showJson = findViewById(R.id.json);
        ImageView showJsonAPI = findViewById(R.id.json_api);
        ImageView showMovieDB = findViewById(R.id.moviedb);

        showJson.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, JsonParseActivity.class);
            startActivity(intent);
        });

        showJsonAPI.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, JsonAPIActivity.class);
            startActivity(intent);
        });

        showMovieDB.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MovieDBActivity.class);
            startActivity(intent);
        });
    }
}