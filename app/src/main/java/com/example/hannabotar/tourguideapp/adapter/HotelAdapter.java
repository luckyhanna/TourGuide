package com.example.hannabotar.tourguideapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hannabotar.tourguideapp.R;
import com.example.hannabotar.tourguideapp.model.Hotel;
import com.example.hannabotar.tourguideapp.model.Hotel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HotelAdapter extends ArrayAdapter<Hotel> {

    @BindView(R.id.hotel_title)
    TextView hotelTitle;

    @BindView(R.id.image_layout)
    RelativeLayout imageLayout;

    @BindView(R.id.hotel_photo)
    ImageView hotelPhoto;

    @BindView(R.id.background_photo)
    ImageView backgroundPhoto;

    @BindView(R.id.hotel_address)
    TextView hotelAddress;

    @BindView(R.id.hotel_phone)
    TextView hotelPhone;

    @BindView(R.id.hotel_email)
    TextView hotelEmail;

    @BindView(R.id.hotel_website)
    TextView hotelWebsite;

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

    public HotelAdapter(@NonNull Context context, @NonNull List<Hotel> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.hotel_item, parent, false);
        }

        ButterKnife.bind(this, listItemView);

        Hotel currentHotel = getItem(position);

        hotelTitle.setText(currentHotel.getName());

        if (currentHotel.getPhotoId() != null) {
            hotelPhoto.setImageResource(currentHotel.getPhotoId());
            backgroundPhoto.setImageResource(currentHotel.getPhotoId());
        } else {
            hotelPhoto.setImageResource(R.drawable.default_img);
            backgroundPhoto.setImageResource(R.drawable.default_img);
        }

        hotelAddress.setText(currentHotel.getAddress());

        if (currentHotel.getPhone() != null) {
            phoneLayout.setVisibility(View.VISIBLE);
            hotelPhone.setText(currentHotel.getPhone());
        } else {
            hotelPhone.setVisibility(View.GONE);
            phoneLayout.setVisibility(View.GONE);
        }

        if (currentHotel.getEmail() != null) {
            mailLayout.setVisibility(View.VISIBLE);
            hotelEmail.setText(currentHotel.getEmail());
        } else {
            mailLayout.setVisibility(View.GONE);
        }

        if (currentHotel.getWebsite() != null) {
            webLayout.setVisibility(View.VISIBLE);
            hotelWebsite.setText(currentHotel.getWebsite());
        } else {
            hotelWebsite.setVisibility(View.GONE);
            webLayout.setVisibility(View.GONE);
        }

        if (currentHotel.getStars() != null) {
            switch (currentHotel.getStars()) {
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

        imageLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(getContext(), "clicked", Toast.LENGTH_SHORT);
                t.show();
            }
        });

        return listItemView;
    }
}
