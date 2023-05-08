package org.crud.app.service;
	import java.util.List;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import org.crud.app.model.Login;
	import org.crud.app.repository.LoginRepo;

	@Service

	public class LoginService {
		@Autowired
		private LoginRepo lrepo;
		public String checkLogin(String usrname,String psword)
		{
			Login user= lrepo.findByusername(usrname);
			if(user==null)
			{
				return "No user found";
			}
			else
			{
				if(user.getPassword().equals(psword))
				{
					return "Login Succesfull";
				}
				else
				{
					return "Login Failed";
				}
			}
		} 
		public Login addUser(Login cl)
		{
			return lrepo.save(cl);
		}
		public List <Login> getUser()
		{
			return lrepo.findAll();
		}

	}


