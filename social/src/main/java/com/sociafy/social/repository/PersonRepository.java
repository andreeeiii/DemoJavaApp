package com.sociafy.social.repository;

import com.sociafy.social.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {

    Person findByUsername(String username);
}
