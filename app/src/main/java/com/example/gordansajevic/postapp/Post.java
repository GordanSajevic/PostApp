package com.example.gordansajevic.postapp;

/**
 * Created by gordansajevic on 14/04/15.
 */
public class Post {

    private int mID;
    private String mTitle;
    private String mContent;

    public Post(int mID, String mTitle, String mContent) {
        this.mID = mID;
        this.mTitle = mTitle;
        this.mContent = mContent;
    }

    public String toString(){
        return mTitle +" \n" + mContent;
    }

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }
}
