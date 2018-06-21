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
import com.example.hannabotar.tourguideapp.model.Hotel;
import com.example.hannabotar.tourguideapp.util.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HotelActivity extends AppCompatActivity {

    @BindView(R.id.hotel_title)
    TextView hotelTitle;

    @BindView(R.id.hotel_photo)
    ImageView hotelPhoto;

    @BindView(R.id.hotel_address)
    TextView hotelAddress;

    @BindView(R.id.hotel_phone)
    TextView hotelPhone;

    @BindView(R.id.hotel_email)
    TextView hotelEmail;

    @BindView(R.id.hotel_website)
    TextView hotelWebsite;

    @BindView(R.id.hotel_description)
    TextView hotelDescription;

    @BindView(R.id.phone_layout)
    RelativeLayout phoneLayout;
    @BindView(R.id.mail_layout)
    RelativeLayout mailLayout;
    @BindView(R.id.web_layout)
    RelativeLayout webLayout;

    @BindView(R.id.stars_layout)
    LinearLayout starsLayout;
    @BindView(R.id.star_1)
    ImageView star1;
    @BindView(R.id.star_2)
    ImageView star2;
    @BindView(R.id.star_3)
    ImageView star3;
    @BindView(R.id.star_4)
    ImageView star4;
    @BindView(R.id.star_5)
    ImageView star5;

    @BindView(R.id.scroll_main)
    ScrollView scrollMain;
    @BindView(R.id.scroll_description)
    ScrollView scrollDescription;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        Hotel hotel = (Hotel) intent.getSerializableExtra(Constants.EXTRA_HOTEL);

        hotelTitle.setText(hotel.getName());

        if (hotel.getPhotoId() != null) {
            hotelPhoto.setImageResource(hotel.getPhotoId());
        } else {
            hotelPhoto.setImageResource(R.drawable.default_img);
        }

        hotelAddress.setText(hotel.getAddress());

        if (hotel.getPhone() != null) {
            phoneLayout.setVisibility(View.VISIBLE);
            hotelPhone.setText(hotel.getPhone());
        } else {
            hotelPhone.setVisibility(View.GONE);
            phoneLayout.setVisibility(View.GONE);
        }

        if (hotel.getEmail() != null) {
            mailLayout.setVisibility(View.VISIBLE);
            hotelEmail.setText(hotel.getEmail());
        } else {
            mailLayout.setVisibility(View.GONE);
        }

        if (hotel.getWebsite() != null) {
            webLayout.setVisibility(View.VISIBLE);
            hotelWebsite.setText(hotel.getWebsite());
        } else {
            hotelWebsite.setVisibility(View.GONE);
            webLayout.setVisibility(View.GONE);
        }

        if (hotel.getStars() != null) {
            switch (hotel.getStars()) {
                case 5:
                    break;
                case 4:
                    star5.setImageResource(R.drawable.star_empty);
                    break;
                case 3:
                    star5.setImageResource(R.drawable.star_empty);
                    star4.setImageResource(R.drawable.star_empty);
                    break;
                case 2:
                    star5.setImageResource(R.drawable.star_empty);
                    star4.setImageResource(R.drawable.star_empty);
                    star3.setImageResource(R.drawable.star_empty);
                    break;
                case 1:
                    star5.setImageResource(R.drawable.star_empty);
                    star4.setImageResource(R.drawable.star_empty);
                    star3.setImageResource(R.drawable.star_empty);
                    star2.setImageResource(R.drawable.star_empty);
                    break;
                default:
                    starsLayout.setVisibility(View.INVISIBLE);
                    break;
            }
        } else {
            // show no rating text?...
            starsLayout.setVisibility(View.INVISIBLE);
        }

        if (hotel.getDescription() != null) {
            hotelDescription.setText(hotel.getDescription());
        } else {
            hotelDescription.setText(R.string.no_details);
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

        bundle.putInt(Constants.ACTIVE_TAB, 2);
        intent.putExtras(bundle);

        return intent;
    }
}
