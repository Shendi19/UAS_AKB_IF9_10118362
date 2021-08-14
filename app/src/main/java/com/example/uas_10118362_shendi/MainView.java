package com.example.uas_10118362_shendi;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

/* Tanggal pengerjaan : Jumat 13 Agustus 2021
        NIM : 10118362
        NAMA : Shendi Rakhma Diansyah
        Kelas : IF-9*/

public class MainView extends AppCompatActivity {
    ViewPager viewPager;
    SlidePagerAdapter adapter;

    @Override
    protected  void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_viewpager);
    viewPager = findViewById(R.id.viewpager);
    adapter= new SlidePagerAdapter(  this);
    viewPager.setAdapter(adapter);


    }
    public void methodmasuk(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
