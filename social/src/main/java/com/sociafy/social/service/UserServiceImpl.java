package com.sociafy.social.service;

import com.sociafy.social.entities.UserEntity;
import com.sociafy.social.repository.UserRepository;
import com.sociafy.social.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean saveUser(String username, String password) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(CommonUtils.generateId());
        userEntity.setUsername(username);
        userEntity.setPassword(password);
        userEntity.setAdmin(Boolean.FALSE);
        try {
            userRepository.save(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
