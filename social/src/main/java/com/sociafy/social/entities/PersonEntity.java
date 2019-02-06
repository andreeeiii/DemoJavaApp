package com.sociafy.social.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "Person")
public class PersonEntity extends UserEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private String id;

    @OneToOne
    @JoinColumn(name = "profile_id", nullable = false)
    private ProfileEntity profile;

    @Column(name = "creation_date")
    private Date creationDate;

   // private List<Int> array = new ArrayList<Integer>

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProfileEntity getProfile() {
        return profile;
    }

    public void setProfile(ProfileEntity profile) {
        this.profile = profile;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
