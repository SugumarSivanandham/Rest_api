package com.review2.project.Repository;
	import org.springframework.data.jpa.repository.JpaRepository;

	import com.review2.project.Model.LoanApplicationModel;

	public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel,Integer>{

}