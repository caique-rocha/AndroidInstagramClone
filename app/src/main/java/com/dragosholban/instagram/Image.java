package com.dragosholban.instagram;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Image {

    public String userId;
    public String downloadUrl;
    private User user;

    public Image() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Image(String userId, String downloadUrl) {
        this.userId = userId;
        this.downloadUrl = downloadUrl;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }
}
