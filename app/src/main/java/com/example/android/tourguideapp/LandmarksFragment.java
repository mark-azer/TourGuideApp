package com.example.android.tourguideapp;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LandmarksFragment extends Fragment {


    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

       // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.cn_tower, R.string.cn_tower_address));
        attractions.add(new Attraction(R.string.niagara_falls, R.string.niagara_falls_address));
        attractions.add(new Attraction(R.string.parliament_hill, R.string.parliament_hill_address));
        attractions.add(new Attraction(R.string.royal_ontario_museum, R.string.royal_ontario_museum_address));
        attractions.add(new Attraction(R.string.warplane_museum, R.string.warplane_museum_address));
        attractions.add(new Attraction(R.string.hockey_hall_of_fame, R.string.hockey_hall_of_fame_address));
        attractions.add(new Attraction(R.string.art_museum_of_ontario, R.string.art_museum_of_ontario_address));
        attractions.add(new Attraction(R.string.blue_mountains_resort, R.string.blue_mountains_resort_address));

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
