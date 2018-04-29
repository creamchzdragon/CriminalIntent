package com.example.tyler.criminalintent;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Tyler on 2/5/2018.
 */

public class Crime implements Serializable{
    String mTitle;
    UUID mID;
    private String mSuspect;
    private Date mDate;
    private boolean mSolved;

    public Crime(String mTitle){
        mID = UUID.randomUUID();
        this.mTitle=mTitle;
        mDate=new Date();

    }
    public Crime(){
        mID=UUID.randomUUID();
        mTitle="";
        mDate=new Date();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getmID() {
        return mID;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String mSuspect) {
        this.mSuspect = mSuspect;
    }
    public String getPhotoFilename() {
        return "IMG_" + getmID().toString() + ".jpg";
    }

}
