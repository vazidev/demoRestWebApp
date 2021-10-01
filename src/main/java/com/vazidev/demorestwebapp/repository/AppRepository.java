package com.vazidev.demorestwebapp.repository;

import com.vazidev.demorestwebapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AppRepository extends JpaRepository<User, String> {

    Optional<User> findByName(String user);
}
