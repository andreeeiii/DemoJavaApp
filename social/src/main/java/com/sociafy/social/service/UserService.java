package com.sociafy.social.service;

import com.sociafy.social.domain.User;

public interface UserService {

    public boolean saveUser(User user);

    public User getUserByUsername(String username);
}
