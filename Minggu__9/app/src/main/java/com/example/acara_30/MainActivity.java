package com.example.acara_30;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvNama = findViewById(R.id.tv_namaMain);

        tvNama.setText(Preferences.getLoggedInUser(getBaseContext()));
        findViewById(R.id.button_logoutMain).setOnClickListener(view -> {
            Preferences.clearLoggedInUser(getBaseContext());
            startActivity(new Intent(getBaseContext(), LoginActivity.class));
            finish();
        });
    }
}