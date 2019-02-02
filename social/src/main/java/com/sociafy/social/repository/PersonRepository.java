package com.sociafy.social.repository;

import com.sociafy.social.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import problem.one.Player;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {

    Player findByUsername(String username);
}
