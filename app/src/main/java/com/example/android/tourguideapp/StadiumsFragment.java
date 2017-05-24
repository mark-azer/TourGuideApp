package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class StadiumsFragment extends Fragment {


    public StadiumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.rogers_centre, R.string.rogers_centre_address,
                R.drawable.rogers_centre));
        attractions.add(new Attraction(R.string.air_canada_centre, R.string.air_canada_centre_address,
                R.drawable.air_canada_centre));
        attractions.add(new Attraction(R.string.bmo_field, R.string.bmo_field_address,
                R.drawable.bmo_field));
        attractions.add(new Attraction(R.string.canadian_tire_centre, R.string.canadian_tire_centre_address,
                R.drawable.canadian_tire_centre));
        attractions.add(new Attraction(R.string.td_place_stadium, R.string.td_place_stadium_address,
                R.drawable.td_place_stadium));
        attractions.add(new Attraction(R.string.tim_hortons_field, R.string.tim_hortons_field_address,
                R.drawable.tim_hortons_field));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
