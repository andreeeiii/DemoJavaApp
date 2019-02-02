package com.sociafy.social.service;

import com.sociafy.social.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public boolean isUserRegistered(String username) {
        if (personRepository.findByUsername(username) != null) {
            return true;
        }
        return false;
    }
}
