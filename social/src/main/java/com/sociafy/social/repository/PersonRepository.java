package com.sociafy.social.repository;

import com.sociafy.social.domain.Person;
import com.sociafy.social.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, String> {

    Person findByUsername(String username);
}
