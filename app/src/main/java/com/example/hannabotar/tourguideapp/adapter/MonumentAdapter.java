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
import com.example.hannabotar.tourguideapp.model.Monument;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MonumentAdapter extends ArrayAdapter<Monument> {

    @BindView(R.id.monument_title)
    TextView monumentTitle;

    @BindView(R.id.monument_photo)
    ImageView monumentPhoto;

    @BindView(R.id.monument_address)
    TextView monumentAddress;

    public MonumentAdapter(@NonNull Context context, @NonNull List<Monument> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.monument_item, parent, false);
        }

        ButterKnife.bind(this, listItemView);

        Monument currentMonument = getItem(position);

        monumentTitle.setText(currentMonument.getName());

        if (currentMonument.getPhotoId() != null) {
            monumentPhoto.setImageResource(currentMonument.getPhotoId());
        } else {
            monumentPhoto.setImageResource(R.drawable.default_img);
        }

        monumentAddress.setText(currentMonument.getAddress());

        return listItemView;
    }
}
