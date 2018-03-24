package com.izoom.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.izoom.app.model.User;

/**
 * Created by Jana.M
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
