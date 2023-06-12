package com.example.demo.repository;

import com.example.demo.model.loginModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loginRepository extends JpaRepository<loginModel, String> {
}
