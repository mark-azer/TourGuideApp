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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.alo, R.string.alo_address));
        attractions.add(new Attraction(R.string.scaramouche, R.string.scaramouche_address));
        attractions.add(new Attraction(R.string.jacobs_steakhouse, R.string.jacobs_steakhouse_address));
        attractions.add(new Attraction(R.string.elm_tree, R.string.elm_tree_address));
        attractions.add(new Attraction(R.string.fraser_cafe, R.string.fraser_cafe_address));
        attractions.add(new Attraction(R.string.next, R.string.next_address));
        attractions.add(new Attraction(R.string.aroma_meze, R.string.aroma_meze_address));
        attractions.add(new Attraction(R.string.ag, R.string.ag_address));
        attractions.add(new Attraction(R.string.weinkeller, R.string.weinkeller_address));

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
