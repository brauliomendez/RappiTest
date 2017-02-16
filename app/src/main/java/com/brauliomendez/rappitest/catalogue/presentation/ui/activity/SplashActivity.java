package com.brauliomendez.rappitest.catalogue.presentation.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class SplashActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(SplashActivity.this, MenuActivity.class));
        finish();
    }
}
