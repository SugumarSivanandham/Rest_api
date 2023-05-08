package org.crud.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.crud.app.model.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login ,Integer>{
	
	Login findByusername(String usrname);

}

