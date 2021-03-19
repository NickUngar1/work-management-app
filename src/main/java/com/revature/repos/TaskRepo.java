package com.revature.repos;

import org.springframework.data.repository.CrudRepository;

import com.revature.beans.Task;

public interface TaskRepo extends CrudRepository<Task, Integer>{

}
