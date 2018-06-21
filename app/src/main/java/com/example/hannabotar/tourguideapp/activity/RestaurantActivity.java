package com.example.hannabotar.tourguideapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hannabotar.tourguideapp.R;
import com.example.hannabotar.tourguideapp.model.Restaurant;
import com.example.hannabotar.tourguideapp.util.Constants;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        Intent intent = getIntent();
        Restaurant restaurant = (Restaurant) intent.getSerializableExtra(Constants.EXTRA_RESTAURANT);
    }
}
