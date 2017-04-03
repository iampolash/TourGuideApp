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
public class HotelsFragment extends Fragment {

    /**
     * default constructor
     */
    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);


        //Create an Array of locations
        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(R.string.hotel_comfort_inn, R.string.comfort_inn_details, R.drawable.comfort_inn));
        locations.add(new Location(R.string.hotel_la_meridian, R.string.la_meridian_details, R.drawable.la_medidian));
        locations.add(new Location(R.string.hotel_long_beach, R.string.long_beach_details, R.drawable.long_beach));
        locations.add(new Location(R.string.hotel_sonargaon, R.string.sonargaon_details, R.drawable.panpacific_sonargoan));
        locations.add(new Location(R.string.hotel_serina, R.string.serina_details, R.drawable.serina));
        locations.add(new Location(R.string.hotel_radison_blu, R.string.radison_blu_details, R.drawable.radison_blu));
        locations.add(new Location(R.string.hotel_westin, R.string.westin_details, R.drawable.westing_dhaka));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single location.
        final LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_hotels);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // lista_view file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of locations.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }

}
