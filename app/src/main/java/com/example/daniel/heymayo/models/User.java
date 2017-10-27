package com.example.daniel.heymayo.models;

import com.google.firebase.database.IgnoreExtraProperties;

// [START blog_user_class]
@IgnoreExtraProperties
public class User {

    public String username;
    public String email;
    public String tokenID;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email, String tokenID) {
        this.username = username;
        this.email = email;
        this.tokenID = tokenID;
    }

}
// [END blog_user_class]