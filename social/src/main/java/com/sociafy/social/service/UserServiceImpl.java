package com.sociafy.social.service;

import com.sociafy.social.domain.User;
import com.sociafy.social.entities.UserEntity;
import com.sociafy.social.repository.UserRepository;
import com.sociafy.social.utils.CommonUtils;
import com.sociafy.social.utils.DtoToEntityConverter;
import com.sociafy.social.utils.EntityToDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public synchronized boolean saveUser(User user) {
        UserEntity userEntity = DtoToEntityConverter.convert(user);
        userEntity.setPassword(bCryptPasswordEncoder.encode(userEntity.getPassword()));
        List<UserEntity> users = userRepository.findByUsername(userEntity.getUsername());
        if (users.size() > 0) {
            return false;
        } else {
            userRepository.save(userEntity);
            return true;
        }
    }

    @Override
    public User getUserByUsername(String username) {
        List<UserEntity> users = userRepository.findByUsername(username);
        if (users.size() > 0) {
            // TODO change this
            return null;
        } else {
            return EntityToDtoConverter.convert(users.get(0));
        }
    }
}
