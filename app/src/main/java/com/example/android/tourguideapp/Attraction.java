package com.example.android.tourguideapp;

public class Attraction {

    /** String resource ID for the name of the attraction */
    private int mAttractionName;

    /** String resource ID for the address of the attraction */
    private int mAttractionAddress;

    /** Image resource ID for the attraction */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this attraction */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Attraction object.
     *
     * @param attractionName is the string resource ID for the name of the attraction
     * @param attractionAddress is the string resource Id for the address of the attraction
     */
    public Attraction(int attractionName, int attractionAddress) {
        mAttractionName = attractionName;
        mAttractionAddress= attractionAddress;
    }

    /**
     * Create a new Attraction object.
     *
     * @param attractionName is the string resource ID for the name of the attraction
     * @param attractionAddress is the string resource Id for the address of the attraction
     * @param imageResourceId is the drawable resource ID for the image associated with the attraction
     */
    public Attraction(int attractionName, int attractionAddress, int imageResourceId) {
        mAttractionName = attractionName;
        mAttractionAddress = attractionAddress;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the name of the attraction.
     */
    public int getAttractionName() {
        return mAttractionName;
    }

    /**
     * Get the string resource ID for the address of the attraction.
     */
    public int getAttractionAddress() {
        return mAttractionAddress;
    }

    /**
     * Return the image resource ID of the attraction.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this attraction.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
