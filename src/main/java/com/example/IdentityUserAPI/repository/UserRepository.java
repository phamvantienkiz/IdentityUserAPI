package com.example.IdentityUserAPI.repository;

import com.example.IdentityUserAPI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
