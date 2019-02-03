package com.sociafy.social.service;

import com.sociafy.social.entities.UserEntity;
import com.sociafy.social.repository.UserRepository;
import com.sociafy.social.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public synchronized boolean saveUser(UserEntity userEntity) {
        List<UserEntity> users = userRepository.findByUsername(userEntity.getUsername());
        if (users.size() > 0) {
            return false;
        } else {
            userRepository.save(userEntity);
            return true;
        }
    }
}
