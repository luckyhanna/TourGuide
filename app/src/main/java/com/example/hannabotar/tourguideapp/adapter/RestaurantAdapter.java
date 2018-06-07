package com.example.hannabotar.tourguideapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
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

    @BindView(R.id.restaurant_photo)
    ImageView restaurantPhoto;

    @BindView(R.id.restaurant_address)
    TextView restaurantAddress;

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

        if (currentRestaurant.getPhotoId() != null) {
            restaurantPhoto.setImageResource(currentRestaurant.getPhotoId());
        } else {
            restaurantPhoto.setImageResource(R.drawable.default_img);
        }

        restaurantAddress.setText(currentRestaurant.getAddress());

        return listItemView;
    }
}
