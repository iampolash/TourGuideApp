package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //Create an Array of locations
        final ArrayList<Location> locations = new ArrayList<>();


        locations.add(new Location(R.string.res_xinxian, R.string.xinxian_details, R.drawable.xinxian));
        locations.add(new Location(R.string.res_bayleaf, R.string.bayleaf_details, R.drawable.bayleaf));
        locations.add(new Location(R.string.res_yantai, R.string.yantai_details, R.drawable.yantai));
        locations.add(new Location(R.string.res_banolota, R.string.banolota_details, R.drawable.banolota));
        locations.add(new Location(R.string.res_bayleaf, R.string.bayleaf_details, R.drawable.bayleaf));
        locations.add(new Location(R.string.res_kfc, R.string.kfc_details, R.drawable.kfc));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single location.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_restaurant);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each location in the list of locations.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }

}
