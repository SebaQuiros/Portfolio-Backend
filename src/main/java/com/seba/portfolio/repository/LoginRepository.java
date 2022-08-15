package com.seba.portfolio.repository;

import com.seba.portfolio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<User, Integer> {
    User findByMailUser(String mailUser);
}
