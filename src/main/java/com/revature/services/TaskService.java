package com.revature.services;

import java.util.List;

import com.revature.beans.Task;

public interface TaskService {
	
	public Task addTask(Task t);
	public Task getTask(int id);
	public List<Task> getAllTasks();
	public Task updateTask(Task t);
	public boolean deleteTask(int id);

}
