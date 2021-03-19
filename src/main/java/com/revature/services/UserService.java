package com.revature.services;

import java.util.List;

import com.revature.beans.User;

public interface UserService {
	
	public User addUser(User u);
	public User getUser(int id);
	public List<User> getAllUsers();
	public User updateUser(User u);
	public boolean deleteUser(int id);

}
