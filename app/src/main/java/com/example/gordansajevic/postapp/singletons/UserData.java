package com.example.gordansajevic.postapp.singletons;

import android.util.Base64;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by gordansajevic on 14/04/15.
 */
public class UserData {
    private static UserData ourInstance = new UserData();

    public static UserData getInstance() {
        return ourInstance;
    }

    private int mId;
    private String mEmail;
    private String mPassword;
    private String mUsername;

    private UserData() {
        mId = -1;
    }

    public String toJson(){
        JSONObject obj = new JSONObject();
        try {
            obj.put("email", mEmail);
            obj.put("password", mPassword);
            return obj.toString();
        } catch(JSONException e){
            e.printStackTrace();
            return null;
        }

    }

    public String getBaseAuth(){
        return "Base " + Base64.encodeToString(String.format("%s:%s", mEmail, mPassword).getBytes(), Base64.NO_WRAP);
    }

    public boolean isAuthenticated(){
        return mId > 0;
    }

    public int getmId() {
        return mId;
    }

    public String getmEmail() {
        return mEmail;
    }

    public String getmPassword() {
        return mPassword;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }
}
