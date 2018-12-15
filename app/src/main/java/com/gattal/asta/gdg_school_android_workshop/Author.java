package com.gattal.asta.gdg_school_android_workshop;

public class Author {
    private String mName;
    private String mPicture;
    private String mDescription;

    public Author(String mName, String mPicture, String mDescription) {
        this.mName = mName;
        this.mPicture = mPicture;
        this.mDescription = mDescription;
    }

    public String getmName() {

        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPicture() {
        return mPicture;
    }

    public void setmPicture(String mPicture) {
        this.mPicture = mPicture;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
