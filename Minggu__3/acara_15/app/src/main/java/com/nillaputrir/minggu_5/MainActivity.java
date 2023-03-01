package com.nillaputrir.minggu_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private MahasiswaAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Nilla Putri Rosidania", "E41211496", "089504395516"));
        mahasiswaArrayList.add(new Mahasiswa("Achmad Zakariya", "E41211496", "089504395516"));
        mahasiswaArrayList.add(new Mahasiswa("Daffa Fauzi Rahman ", "E41211496", "089504395516"));
        mahasiswaArrayList.add(new Mahasiswa("Ahmad Hipnie Khoiri", "E41211496", "089504395516"));
        mahasiswaArrayList.add(new Mahasiswa("Yovie Gilang", "E41211496", "089504395516"));
        mahasiswaArrayList.add(new Mahasiswa("Achmad Baihaqi", "E41211496", "089504395516"));
    }
}
