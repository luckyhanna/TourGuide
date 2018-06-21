package com.example.hannabotar.tourguideapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hannabotar.tourguideapp.R;
import com.example.hannabotar.tourguideapp.model.Restaurant;
import com.example.hannabotar.tourguideapp.model.Restaurant;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {

    @BindView(R.id.restaurant_title)
    TextView restaurantTitle;

    @BindView(R.id.restaurant_cuisine)
    TextView restaurantCuisine;

    @BindView(R.id.restaurant_photo)
    ImageView restaurantPhoto;

    @BindView(R.id.background_photo)
    ImageView backgroundPhoto;

    @BindView(R.id.restaurant_address)
    TextView restaurantAddress;

    @BindView(R.id.restaurant_phone)
    TextView restaurantPhone;

    @BindView(R.id.restaurant_email)
    TextView restaurantEmail;

    @BindView(R.id.restaurant_website)
    TextView restaurantWebsite;

    @BindView(R.id.phone_layout)
    RelativeLayout phoneLayout;
    @BindView(R.id.mail_layout)
    RelativeLayout mailLayout;
    @BindView(R.id.web_layout)
    RelativeLayout webLayout;

    public RestaurantAdapter(@NonNull Context context, @NonNull List<Restaurant> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.restaurant_item, parent, false);
        }

        ButterKnife.bind(this, listItemView);

        Restaurant currentRestaurant = getItem(position);

        restaurantTitle.setText(currentRestaurant.getName());

        if (currentRestaurant.getCuisineType() != null) {
            restaurantCuisine.setText(currentRestaurant.getCuisineType());
        }

        if (currentRestaurant.getPhotoId() != null) {
            restaurantPhoto.setImageResource(currentRestaurant.getPhotoId());
            backgroundPhoto.setImageResource(currentRestaurant.getPhotoId());
        } else {
            restaurantPhoto.setImageResource(R.drawable.default_img);
            backgroundPhoto.setImageResource(R.drawable.default_img);
        }

        restaurantAddress.setText(currentRestaurant.getAddress());

        if (currentRestaurant.getPhone() != null) {
            phoneLayout.setVisibility(View.VISIBLE);
            restaurantPhone.setText(currentRestaurant.getPhone());
        } else {
            restaurantPhone.setVisibility(View.GONE);
            phoneLayout.setVisibility(View.GONE);
        }

        if (currentRestaurant.getEmail() != null) {
            mailLayout.setVisibility(View.VISIBLE);
            restaurantEmail.setText(currentRestaurant.getEmail());
        } else {
            mailLayout.setVisibility(View.GONE);
        }

        if (currentRestaurant.getWebsite() != null) {
            webLayout.setVisibility(View.VISIBLE);
            restaurantWebsite.setText(currentRestaurant.getWebsite());
        } else {
            restaurantWebsite.setVisibility(View.GONE);
            webLayout.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
