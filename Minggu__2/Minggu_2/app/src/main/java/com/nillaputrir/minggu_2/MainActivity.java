package com.nillaputrir.minggu_2;

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
    public void menu(View view){
        Intent intent = new Intent(MainActivity.this, LinearLayout.class);
        startActivity(intent);
    }
    public void menu1(View view) {
        Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
        startActivity(intent);
    }

    public void menu2(View view) {
        Intent intent = new Intent(MainActivity.this, ConstraintLayout.class);
        startActivity(intent);
    }

    public void menu3(View view) {
        Intent intent = new Intent(MainActivity.this, FrameLayout.class);
        startActivity(intent);
    }

    public void menu4(View view) {
        Intent intent = new Intent(MainActivity.this, TableLayout.class);
        startActivity(intent);
    }

    public void menu5(View view) {
        Intent intent = new Intent(MainActivity.this, MaterialDesign.class);
        startActivity(intent);
    }

    public void menu6(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollView1.class);
        startActivity(intent);
    }

    public void menu7(View view) {
        Intent intent = new Intent(MainActivity.this, HorizontalScrollView.class);
        startActivity(intent);
    }
}