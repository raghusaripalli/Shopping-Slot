package com.productivity.simplyschedule.repository;

import com.productivity.simplyschedule.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}