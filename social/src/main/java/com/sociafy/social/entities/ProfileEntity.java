package com.sociafy.social.entities;

import com.sociafy.social.domain.Person;

import javax.persistence.*;

@Entity
@Table(name = "\"Profile\"")
public class ProfileEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private String id;

    @Column(name = "description")
    private String description;

    @Lob
    @Column(name = "picture")
    private byte[] picture;

    @OneToOne(mappedBy = "profile")
    private PersonEntity person;

    //private Badge[] badges;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }
}
