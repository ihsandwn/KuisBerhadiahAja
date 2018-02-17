package com.example.bri.kuisberhadiahzonk;

/**
 * Created by BRI on 2/4/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TentangKitaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        getSupportActionBar().setTitle("About Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
