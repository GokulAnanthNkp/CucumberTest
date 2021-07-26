package com.devcases.usermanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devcases.usermanager.dao.UserDAO;
import com.devcases.usermanager.model.User;

@Service
public class UserService {
	
	@Autowired
    private UserDAO userDAO;
	
	public List<User> getAllUser(String panNumber) {
		return userDAO.getAllUser(panNumber);
	}
	

}
