package com.sociafy.social.utils;

import com.sociafy.social.domain.User;
import com.sociafy.social.entities.UserEntity;

public class DtoToEntityConverter {

    public static UserEntity convert(User dto) {
        UserEntity entity = new UserEntity();
        entity.setId(CommonUtils.generateId());
        entity.setAdmin(dto.getAdmin());
        entity.setPassword(dto.getPassword());
        entity.setUsername(dto.getUsername());
        return entity;
    }
}
