package de.lamp.crud;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository

public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findByLastNameStartsWithIgnoreCase(String lastName);
}