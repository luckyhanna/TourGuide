package com.example.hannabotar.tourguideapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
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

    @BindView(R.id.scroll_main)
    ScrollView scrollMain;
    @BindView(R.id.scroll_description)
    ScrollView scrollDescription;
    
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

        scrollMain.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                scrollDescription.getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            }
        });
        scrollDescription.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event)
            {
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
    }

    @Override
    public Intent getParentActivityIntent() {
        final Bundle bundle = new Bundle();
        final Intent intent = new Intent(this, MainActivity.class);

        bundle.putInt(Constants.ACTIVE_TAB, 3);
        intent.putExtras(bundle);

        return intent;
    }
}
