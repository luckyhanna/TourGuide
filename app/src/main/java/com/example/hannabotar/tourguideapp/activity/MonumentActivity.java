package com.example.hannabotar.tourguideapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hannabotar.tourguideapp.R;
import com.example.hannabotar.tourguideapp.model.Monument;
import com.example.hannabotar.tourguideapp.util.Constants;

public class MonumentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monument);

        Intent intent = getIntent();
        Monument monument = (Monument) intent.getSerializableExtra(Constants.EXTRA_MONUMENT);
    }
}
