package com.sociafy.social.utils;

import com.sociafy.social.domain.User;
import com.sociafy.social.entities.UserEntity;

public class EntityToDtoConverter {

    public static User convert(UserEntity entity) {
        User dto = new User();
        dto.setAdmin(entity.getAdmin());
        dto.setPassword(entity.getPassword());
        dto.setUsername(entity.getUsername());
        return dto;
    }
}
