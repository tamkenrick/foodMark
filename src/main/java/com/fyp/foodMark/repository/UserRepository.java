package com.fyp.foodMark.repository;

import com.fyp.foodMark.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // add custom repository methods here
    @Query("SELECT u.id FROM User u WHERE u.username = ?1 AND  u.password = ?2")
    Long findIdByUser(String username, String password);
}
