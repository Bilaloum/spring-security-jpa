package com.bilal.spring.security.jpa;

import com.bilal.spring.security.jpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findUserByUserName(String userName);
}
