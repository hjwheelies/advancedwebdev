package edu.edgewood.ProjectRough.servlet;

import edu.edgewood.ProjectRough.dao.*;
import edu.edgewood.ProjectRough.model.User;



public class UserService {
	private UserJdbcDao dao;
	
	public UserService () {
		dao = new UserJdbcDao();
		
	}
	
	public User find (String username, String password){
		try{
			return dao.get(username,  password);
		}catch (Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
}