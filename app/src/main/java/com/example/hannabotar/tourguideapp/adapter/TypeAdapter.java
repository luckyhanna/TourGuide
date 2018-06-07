package com.example.hannabotar.tourguideapp.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.hannabotar.tourguideapp.R;
import com.example.hannabotar.tourguideapp.fragment.EventsFragment;
import com.example.hannabotar.tourguideapp.fragment.HotelsFragment;
import com.example.hannabotar.tourguideapp.fragment.MonumentsFragment;
import com.example.hannabotar.tourguideapp.fragment.RestaurantsFragment;

public class TypeAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TypeAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MonumentsFragment();
            case 1:
                return new RestaurantsFragment();
            case 2:
                return new HotelsFragment();
            case 3:
                return new EventsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.monuments_title);
        } else if (position == 1) {
            return mContext.getString(R.string.restaurants_title);
        } else if (position == 2) {
            return mContext.getString(R.string.hotels_title);
        } else {
            return mContext.getString(R.string.events_title);
        }
    }
}