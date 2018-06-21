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
import com.example.hannabotar.tourguideapp.model.Monument;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MonumentAdapter extends ArrayAdapter<Monument> {

    @BindView(R.id.monument_title)
    TextView monumentTitle;

    @BindView(R.id.monument_photo)
    ImageView monumentPhoto;

    @BindView(R.id.background_photo)
    ImageView backgroundPhoto;

    @BindView(R.id.monument_address)
    TextView monumentAddress;

    @BindView(R.id.monument_phone)
    TextView monumentPhone;

    @BindView(R.id.monument_email)
    TextView monumentEmail;

    @BindView(R.id.monument_website)
    TextView monumentWebsite;

    @BindView(R.id.phone_layout)
    RelativeLayout phoneLayout;
    @BindView(R.id.mail_layout)
    RelativeLayout mailLayout;
    @BindView(R.id.web_layout)
    RelativeLayout webLayout;

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
            backgroundPhoto.setImageResource(currentMonument.getPhotoId());
        } else {
            monumentPhoto.setImageResource(R.drawable.default_img);
            backgroundPhoto.setImageResource(R.drawable.default_img);
        }

        monumentAddress.setText(currentMonument.getAddress());

        if (currentMonument.getPhone() != null) {
            phoneLayout.setVisibility(View.VISIBLE);
            monumentPhone.setText(currentMonument.getPhone());
        } else {
            monumentPhone.setVisibility(View.GONE);
            phoneLayout.setVisibility(View.GONE);
        }

        if (currentMonument.getEmail() != null) {
            mailLayout.setVisibility(View.VISIBLE);
            monumentEmail.setText(currentMonument.getEmail());
        } else {
            mailLayout.setVisibility(View.GONE);
        }

        if (currentMonument.getWebsite() != null) {
            webLayout.setVisibility(View.VISIBLE);
            monumentWebsite.setText(currentMonument.getWebsite());
        } else {
            monumentWebsite.setVisibility(View.GONE);
            webLayout.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
