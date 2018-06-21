package com.example.hannabotar.tourguideapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.hannabotar.tourguideapp.R;
import com.example.hannabotar.tourguideapp.model.Monument;
import com.example.hannabotar.tourguideapp.util.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MonumentActivity extends AppCompatActivity {

    @BindView(R.id.monument_title)
    TextView monumentTitle;

    @BindView(R.id.monument_photo)
    ImageView monumentPhoto;

    @BindView(R.id.monument_address)
    TextView monumentAddress;

    @BindView(R.id.monument_phone)
    TextView monumentPhone;

    @BindView(R.id.monument_email)
    TextView monumentEmail;

    @BindView(R.id.monument_website)
    TextView monumentWebsite;

    @BindView(R.id.monument_description)
    TextView monumentDescription;

    @BindView(R.id.phone_layout)
    RelativeLayout phoneLayout;
    @BindView(R.id.mail_layout)
    RelativeLayout mailLayout;
    @BindView(R.id.web_layout)
    RelativeLayout webLayout;

    @BindView(R.id.scroll_main)
    ScrollView scrollMain;
    @BindView(R.id.scroll_description)
    ScrollView scrollDescription;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monument);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        Monument monument = (Monument) intent.getSerializableExtra(Constants.EXTRA_MONUMENT);

        monumentTitle.setText(monument.getName());

        if (monument.getPhotoId() != null) {
            monumentPhoto.setImageResource(monument.getPhotoId());
        } else {
            monumentPhoto.setImageResource(R.drawable.default_img);
        }

        monumentAddress.setText(monument.getAddress());

        if (monument.getPhone() != null) {
            phoneLayout.setVisibility(View.VISIBLE);
            monumentPhone.setText(monument.getPhone());
        } else {
            monumentPhone.setVisibility(View.GONE);
            phoneLayout.setVisibility(View.GONE);
        }

        if (monument.getEmail() != null) {
            mailLayout.setVisibility(View.VISIBLE);
            monumentEmail.setText(monument.getEmail());
        } else {
            mailLayout.setVisibility(View.GONE);
        }

        if (monument.getWebsite() != null) {
            webLayout.setVisibility(View.VISIBLE);
            monumentWebsite.setText(monument.getWebsite());
        } else {
            monumentWebsite.setVisibility(View.GONE);
            webLayout.setVisibility(View.GONE);
        }

        if (monument.getDescription() != null) {
            monumentDescription.setText(monument.getDescription());
        } else {
            monumentDescription.setText(R.string.no_details);
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
                // Disallow the touch request for parent scroll on touch of child view
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
    }

    @Override
    public Intent getParentActivityIntent() {
        final Bundle bundle = new Bundle();
        final Intent intent = new Intent(this, MainActivity.class);

        bundle.putInt(Constants.ACTIVE_TAB, 0);
        intent.putExtras(bundle);

        return intent;
    }
}
