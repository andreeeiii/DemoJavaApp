package com.sociafy.social.repository;

import com.sociafy.social.entities.UserEntity;

public interface UserDao {

    public boolean saveUser(UserEntity userEntity);
}
