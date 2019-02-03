package com.sociafy.social.repository;

import com.sociafy.social.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {

    List<UserEntity> findByUsername(String username);
}
