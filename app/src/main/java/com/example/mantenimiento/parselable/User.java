package com.example.mantenimiento.parselable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Mantenimiento on 11/11/2015.
 */
public class User implements Parcelable {

    public String username;
    public String password;

    public User(String username, String password)
    {
        this.username=username;
        this.password=password;
    }

    protected User(Parcel in) {
        this.username = in.readString();
        this.password = in.readString();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(this.username);
        dest.writeString(this.password);
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        public User[] newArray(int size) {
            return new User[size];
        }
    };

}
