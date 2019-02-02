package com.sociafy.social.domain;


import java.util.Date;

public class Person extends User {

    private String id;

    private Profile profile;

    //private List<Event> attendingEvents;
    //private List<Event> likedEvents;

    private Date creationDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
