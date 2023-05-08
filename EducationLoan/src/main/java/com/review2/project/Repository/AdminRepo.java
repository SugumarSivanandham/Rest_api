package com.review2.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review2.project.Model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel,String>{

}
