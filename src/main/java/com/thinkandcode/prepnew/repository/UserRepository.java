package com.thinkandcode.prepnew.repository;

import com.thinkandcode.prepnew.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "Select * from user", nativeQuery = true)
    List<User> getALLUser();
}
