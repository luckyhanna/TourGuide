package com.example.hannabotar.tourguideapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.hannabotar.tourguideapp.R;
import com.example.hannabotar.tourguideapp.adapter.MonumentAdapter;
import com.example.hannabotar.tourguideapp.model.Monument;
import com.example.hannabotar.tourguideapp.util.Util;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MonumentsFragment extends Fragment {

    @BindView(R.id.items_list)
    ListView listView;

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_items, container, false);

        ButterKnife.bind(this, view);

        List<Monument> monumentList = Util.getMonuments();

        MonumentAdapter adapter = new MonumentAdapter(view.getContext(), monumentList);

        listView.setAdapter(adapter);

        return view;
    }

}
