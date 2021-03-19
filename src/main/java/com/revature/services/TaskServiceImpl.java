package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Task;
import com.revature.repos.TaskRepo;

@Service
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	TaskRepo tr;

	@Override
	public Task addTask(Task t) {
		return tr.save(t);
	}

	@Override
	public Task getTask(int id) {
		return tr.findById(id).get();
	}

	@Override
	public List<Task> getAllTasks() {
		return (List<Task>) tr.findAll();
	}

	@Override
	public Task updateTask(Task t) {
		return tr.save(t);
	}

	@Override
	public boolean deleteTask(int id) {
		try {
			tr.delete(tr.findById(id).get());
			return true;
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
			return false;
		}	
	}
	
	

}
