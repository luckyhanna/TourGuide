package com.example.hannabotar.tourguideapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hannabotar.tourguideapp.R;
import com.example.hannabotar.tourguideapp.model.Event;
import com.example.hannabotar.tourguideapp.util.Constants;
import com.example.hannabotar.tourguideapp.util.Util;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventActivity extends AppCompatActivity {

    @BindView(R.id.event_title)
    TextView eventTitle;

    @BindView(R.id.event_photo)
    ImageView eventPhoto;

    @BindView(R.id.event_location)
    TextView eventLocation;

    @BindView(R.id.event_date)
    TextView eventDate;

    @BindView(R.id.event_description)
    TextView eventDescription;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        Event event = (Event) intent.getSerializableExtra(Constants.EXTRA_EVENT);

        eventTitle.setText(event.getName());

        if (event.getPhotoId() != null) {
            eventPhoto.setImageResource(event.getPhotoId());
        } else {
            eventPhoto.setImageResource(R.drawable.default_img);
        }

        eventLocation.setText(event.getLocation());

        if (event.getDate() != null) {
            eventDate.setText(Util.formatDate(event.getDate()));
        } else {
            eventDate.setText(R.string.coming_soon);
        }

        if (event.getDescription() != null) {
            eventDescription.setText(event.getDescription());
        } else {
            eventDescription.setText(R.string.no_details);
        }
    }
}
