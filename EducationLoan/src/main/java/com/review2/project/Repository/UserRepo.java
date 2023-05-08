package com.review2.project.Repository;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.review2.project.Model.UserModel;

	public interface UserRepo extends JpaRepository<UserModel,Integer>{

	}


