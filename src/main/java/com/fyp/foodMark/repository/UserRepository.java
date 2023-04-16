package com.fyp.foodMark.repository;

import com.fyp.foodMark.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // add custom repository methods here
}
