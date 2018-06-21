package com.example.hannabotar.tourguideapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.hannabotar.tourguideapp.R;
import com.example.hannabotar.tourguideapp.model.Restaurant;
import com.example.hannabotar.tourguideapp.util.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RestaurantActivity extends AppCompatActivity {

    @BindView(R.id.restaurant_title)
    TextView restaurantTitle;

    @BindView(R.id.restaurant_cuisine)
    TextView restaurantCuisine;

    @BindView(R.id.restaurant_photo)
    ImageView restaurantPhoto;

    @BindView(R.id.restaurant_address)
    TextView restaurantAddress;

    @BindView(R.id.restaurant_phone)
    TextView restaurantPhone;

    @BindView(R.id.restaurant_email)
    TextView restaurantEmail;

    @BindView(R.id.restaurant_website)
    TextView restaurantWebsite;

    @BindView(R.id.restaurant_description)
    TextView restaurantDescription;

    @BindView(R.id.phone_layout)
    RelativeLayout phoneLayout;
    @BindView(R.id.mail_layout)
    RelativeLayout mailLayout;
    @BindView(R.id.web_layout)
    RelativeLayout webLayout;

    @BindView(R.id.scroll_main)
    ScrollView scrollMain;
    @BindView(R.id.scroll_description)
    ScrollView scrollDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        Restaurant restaurant = (Restaurant) intent.getSerializableExtra(Constants.EXTRA_RESTAURANT);

        restaurantTitle.setText(restaurant.getName());

        if (restaurant.getPhotoId() != null) {
            restaurantPhoto.setImageResource(restaurant.getPhotoId());
        } else {
            restaurantPhoto.setImageResource(R.drawable.default_img);
        }

        restaurantAddress.setText(restaurant.getAddress());

        if (restaurant.getPhone() != null) {
            phoneLayout.setVisibility(View.VISIBLE);
            restaurantPhone.setText(restaurant.getPhone());
        } else {
            restaurantPhone.setVisibility(View.GONE);
            phoneLayout.setVisibility(View.GONE);
        }

        if (restaurant.getEmail() != null) {
            mailLayout.setVisibility(View.VISIBLE);
            restaurantEmail.setText(restaurant.getEmail());
        } else {
            mailLayout.setVisibility(View.GONE);
        }

        if (restaurant.getWebsite() != null) {
            webLayout.setVisibility(View.VISIBLE);
            restaurantWebsite.setText(restaurant.getWebsite());
        } else {
            restaurantWebsite.setVisibility(View.GONE);
            webLayout.setVisibility(View.GONE);
        }

        if (restaurant.getCuisineType() != null) {
            restaurantCuisine.setText(restaurant.getCuisineType());
        }

        if (restaurant.getDescription() != null) {
            restaurantDescription.setText(restaurant.getDescription());
        } else {
            restaurantDescription.setText(R.string.no_details);
        }

        scrollMain.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                scrollDescription.getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            }
        });
        scrollDescription.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event)
            {
                // Disallow the touch request for parent scroll on touch of child view
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
    }

    @Override
    public Intent getParentActivityIntent() {
        final Bundle bundle = new Bundle();
        final Intent intent = new Intent(this, MainActivity.class);

        bundle.putInt(Constants.ACTIVE_TAB, 1);
        intent.putExtras(bundle);

        return intent;
    }
}
