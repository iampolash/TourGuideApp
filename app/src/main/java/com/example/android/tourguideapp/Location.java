package com.example.android.tourguideapp;

/**
 * Created by sksho on 23-Mar-17.
 */

public class Location {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    //tourguideapp title
    private int mLocationTitle;
    //location deails
    private int mLocationDetails;
    //Image resource id for the locations
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //default constructor
    public Location(int mLocationTitle, int mLocationDetails, int mImageResourceId) {
        this.mLocationTitle = mLocationTitle;
        this.mLocationDetails = mLocationDetails;
        this.mImageResourceId = mImageResourceId;
    }

    public int getmLocationTitle() {
        return mLocationTitle;
    }

    public int getmLocationDetails() {
        return mLocationDetails;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
