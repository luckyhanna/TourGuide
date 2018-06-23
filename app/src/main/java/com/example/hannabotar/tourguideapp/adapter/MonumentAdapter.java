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
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hannabotar.tourguideapp.R;
import com.example.hannabotar.tourguideapp.activity.MonumentActivity;
import com.example.hannabotar.tourguideapp.model.Monument;
import com.example.hannabotar.tourguideapp.util.Constants;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MonumentAdapter extends ArrayAdapter<Monument> {

    @BindView(R.id.monument_title)
    TextView monumentTitle;

    @BindView(R.id.image_layout)
    RelativeLayout imageLayout;

    @BindView(R.id.monument_photo)
    ImageView monumentPhoto;

    @BindView(R.id.background_photo)
    ImageView backgroundPhoto;

    @BindView(R.id.monument_address)
    TextView monumentAddress;

    @BindView(R.id.monument_website)
    TextView monumentWebsite;

    @BindView(R.id.web_layout)
    RelativeLayout webLayout;

    public MonumentAdapter(@NonNull Context context, @NonNull List<Monument> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.monument_item, parent, false);
        }

        ButterKnife.bind(this, convertView);

        final Monument currentMonument = getItem(position);

        monumentTitle.setText(currentMonument.getName());

        if (currentMonument.getPhotoId() != null) {
            monumentPhoto.setImageResource(currentMonument.getPhotoId());
            backgroundPhoto.setImageResource(currentMonument.getPhotoId());
        } else {
            monumentPhoto.setImageResource(R.drawable.default_img);
            backgroundPhoto.setImageResource(R.drawable.default_img);
        }

        monumentAddress.setText(currentMonument.getAddress());

        if (currentMonument.getWebsite() != null) {
            webLayout.setVisibility(View.VISIBLE);
            monumentWebsite.setVisibility(View.VISIBLE);
            monumentWebsite.setText(currentMonument.getWebsite());
        } else {
            monumentWebsite.setVisibility(View.GONE);
            webLayout.setVisibility(View.GONE);
        }

        imageLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MonumentActivity.class);
                intent.putExtra(Constants.EXTRA_MONUMENT, currentMonument);
                getContext().startActivity(intent);
            }
        });

        return convertView;
    }
}
