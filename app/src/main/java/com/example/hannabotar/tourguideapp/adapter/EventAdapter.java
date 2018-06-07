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
import com.example.hannabotar.tourguideapp.model.Event;
import com.example.hannabotar.tourguideapp.model.Event;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventAdapter extends ArrayAdapter<Event> {

    @BindView(R.id.event_title)
    TextView eventTitle;

    @BindView(R.id.event_photo)
    ImageView eventPhoto;

    @BindView(R.id.event_location)
    TextView eventLocation;

    public EventAdapter(@NonNull Context context, @NonNull List<Event> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.event_item, parent, false);
        }

        ButterKnife.bind(this, listItemView);

        Event currentEvent = getItem(position);

        eventTitle.setText(currentEvent.getName());

        if (currentEvent.getPhotoId() != null) {
            eventPhoto.setImageResource(currentEvent.getPhotoId());
        } else {
            eventPhoto.setImageResource(R.drawable.default_img);
        }

        eventLocation.setText(currentEvent.getLocation());

        return listItemView;
    }
}
