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

import com.revature.beans.Task;
import com.revature.services.TaskService;

@RestController
@CrossOrigin
public class TaskController {
	
	@Autowired
	TaskService ts;
	@Autowired
	HttpSession sess;
	
	@GetMapping(value = "/tasks/{id}")
	public Task getTask(@PathVariable("id") int id) {
		try {
			return ts.getTask(id);
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException in TaskController.getTask");
		}
		return null;
	}
	
	@GetMapping(value = "/tasks", produces = "application/json")
	public List<Task> getAllTasks() {
		try {
			return ts.getAllTasks();
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException in TaskController.getAllTasks");
			// e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping(value = "/tasks", consumes = "application/json", produces = "application/json")
	public @ResponseBody Task addUser(@RequestBody Task t) {
		try {
			return ts.addTask(t);
		} catch (Exception e) {
			System.out.println("Exception in TaskController.addTask Likely duplicate value in unique column");
			// e.printStackTrace();
		}
		return null;

	}
	
	@PutMapping(value = "/tasks/{id}", consumes = "application/json")
	public Task updateTask(@PathVariable("id") int taskID, @RequestBody Task t) {
		try {
			t.setTaskID(taskID);
			return ts.updateTask(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@DeleteMapping(value = "/tasks/{id}")
	public boolean deleteTask(@PathVariable("id") int id) {
		try {
			return ts.deleteTask(id);
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException in TaskController.deleteTask");
			// e.printStackTrace();
		}
		return false;
	}

}
