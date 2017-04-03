package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sksho on 23-Mar-17.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    private int mColorResourceId;

    public LocationAdapter(Activity context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID LocationTitle
        TextView locationTitleTextView = (TextView) convertView.findViewById(R.id.location_title);

        // Get the title name from the current Location object and
        // set this text on the title TextView
        locationTitleTextView.setText(currentLocation.getmLocationTitle());

        // Find the TextView in the list_item.xml layout with the ID LOcationDetails
        TextView locationDetailsTextView = (TextView) convertView.findViewById(R.id.location_details);

        // Get the version number from the current Location object and
        // set this text on the number TextView
        locationDetailsTextView.setText(currentLocation.getmLocationDetails());

        // Find the ImageView in the list_item.xml layout with the ID Image
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            // Get the image resource ID from the current Location object and
            // set the image to image
            imageView.setImageResource(currentLocation.getmImageResourceId());

            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = convertView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return convertView;
    }
}
