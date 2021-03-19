package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.User;
import com.revature.repos.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo ur;

	@Override
	public User addUser(User u) {
		return ur.save(u);
	}

	@Override
	public User getUser(int id) {
		return ur.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {
		return (List<User>) ur.findAll();
	}

	@Override
	public User updateUser(User u) {
		return ur.save(u);
	}

	@Override
	public boolean deleteUser(int id) {
		try {
			ur.delete(ur.findById(id).get());
			return true;
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	

}
