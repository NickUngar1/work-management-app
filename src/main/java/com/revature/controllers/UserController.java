package com.revature.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.User;
import com.revature.services.UserService;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService us;
	@Autowired
	HttpSession sess;
	
	@GetMapping(value = "/users/{id}")
	public User getUser(@PathVariable("id") int id) {
		try {
			return us.getUser(id);
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException in UserController.getUser");
			// e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping(value = "/users", produces = "application/json")
	public List<User> getAllUsers() {
		try {
			return us.getAllUsers();
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException in UserController.getAllUsers");
			// e.printStackTrace();
		}
		return null;
	}
	
	
	@PostMapping(value = "/users", consumes = "application/json", produces = "application/json")
	public @ResponseBody User addUser(@RequestBody User user) {
		try {
			return us.addUser(user);
		} catch (Exception e) {
			System.out.println("Exception in UserController.addUser Likely duplicate value in unique column");
			// e.printStackTrace();
		}
		return null;

	}
	
	@PutMapping(value = "/users/{id}", consumes = "application/json")
	public User updateUser(@PathVariable("id") int userID, @RequestBody User change) {
		try {
			change.setUserID(userID);
			return us.updateUser(change);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@DeleteMapping(value = "/users/{id}")
	public boolean deleteUser(@PathVariable("id") int id) {
		try {
			return us.deleteUser(id);
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException in UserController.deleteUser");
			// e.printStackTrace();
		}
		return false;
	}

}
