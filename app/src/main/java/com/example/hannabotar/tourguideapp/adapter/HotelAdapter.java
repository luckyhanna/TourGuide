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
import com.example.hannabotar.tourguideapp.model.Hotel;
import com.example.hannabotar.tourguideapp.model.Hotel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HotelAdapter extends ArrayAdapter<Hotel> {

    @BindView(R.id.hotel_title)
    TextView hotelTitle;

    @BindView(R.id.hotel_photo)
    ImageView hotelPhoto;

    @BindView(R.id.hotel_address)
    TextView hotelAddress;

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
        } else {
            hotelPhoto.setImageResource(R.drawable.default_img);
        }

        hotelAddress.setText(currentHotel.getAddress());

        return listItemView;
    }
}
