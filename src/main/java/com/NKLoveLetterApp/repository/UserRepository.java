package com.NKLoveLetterApp.repository;

import com.NKLoveLetterApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
