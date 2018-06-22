package com.example.hannabotar.tourguideapp.adapter;

import android.content.Context;
import android.content.Intent;
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
import com.example.hannabotar.tourguideapp.activity.HotelActivity;
import com.example.hannabotar.tourguideapp.model.Hotel;
import com.example.hannabotar.tourguideapp.model.Hotel;
import com.example.hannabotar.tourguideapp.util.Constants;

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

    @BindView(R.id.hotel_website)
    TextView hotelWebsite;

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

        final Hotel currentHotel = getItem(position);

        hotelTitle.setText(currentHotel.getName());

        if (currentHotel.getPhotoId() != null) {
            hotelPhoto.setImageResource(currentHotel.getPhotoId());
            backgroundPhoto.setImageResource(currentHotel.getPhotoId());
        } else {
            hotelPhoto.setImageResource(R.drawable.default_img);
            backgroundPhoto.setImageResource(R.drawable.default_img);
        }

        hotelAddress.setText(currentHotel.getAddress());

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
                Intent intent = new Intent(getContext(), HotelActivity.class);
                intent.putExtra(Constants.EXTRA_HOTEL, currentHotel);
                getContext().startActivity(intent);
            }
        });

        return listItemView;
    }
}
