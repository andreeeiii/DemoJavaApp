package com.sociafy.social.entities;

import com.sociafy.social.domain.Profile;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "Person")
public class PersonEntity extends UserEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private String id;

    @Column(name = "profile")
    @OneToOne
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile profile;

    @Column(name = "creation_date")
    private Date creationDate;

   // private List<Int> array = new ArrayList<Integer>

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
