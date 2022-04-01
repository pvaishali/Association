package com.cg.placement.Client;

import com.cg.placement.entities.User;
import com.cg.placement.service.IUserService;
import com.cg.placement.service.UserServiceImpl;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		User user = new User();
		
		IUserService service = new UserServiceImpl();
		user.setId(1);
		user.setName("Vaishu");
		user.setType("teacher");
		user.setPassword("tyyui");
		service.addnewUser(user);
		
	
		System.out.println("ID is:"+user.getId());
		System.out.println("Name is:"+user.getName());
		
	}

}
