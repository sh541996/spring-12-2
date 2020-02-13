package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
    public List<User> getUsers(){
    	return userDao.getUsers();
    }
    
    public ResponseEntity<?> insertUser(User user) {
    	return userDao.insertUser(user);
    }
    
    public ResponseEntity<?> getUser(int id) {
    	return userDao.getUser(id);
    }
    
    public  int deleteUser(int id) {
    	return userDao.deleteUser(id);
    }
    
   
}
