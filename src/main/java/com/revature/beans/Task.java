package com.revature.beans;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TASKS")
public class Task {

	@Id
	@Column(updatable = false, name = "task_id")
	@SequenceGenerator(name = "TASK_SEQ", sequenceName = "TASK_SEQ", allocationSize = 1) 
	@GeneratedValue(generator = "TASK_SEQ", strategy = GenerationType.SEQUENCE)
	private int taskID;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "urgency")
	private int urgency;
	
	@Column(name = "date_time_created")
	private Timestamp createdAt;
	
	@Column(name = "date_time_due")
	private Timestamp dueAt;
	
	public Task() {
		super();
	}

	public Task(int taskID, User user, String title, String description, String category, int urgency,
			Timestamp createdAt, Timestamp dueAt) {
		super();
		this.taskID = taskID;
		this.user = user;
		this.title = title;
		this.description = description;
		this.category = category;
		this.urgency = urgency;
		this.createdAt = createdAt;
		this.dueAt = dueAt;
	}

	public Task(User user, String title, String description, String category, int urgency, Timestamp createdAt,
			Timestamp dueAt) {
		super();
		this.user = user;
		this.title = title;
		this.description = description;
		this.category = category;
		this.urgency = urgency;
		this.createdAt = createdAt;
		this.dueAt = dueAt;
	}

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getUrgency() {
		return urgency;
	}

	public void setUrgency(int urgency) {
		this.urgency = urgency;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getDueAt() {
		return dueAt;
	}

	public void setDueAt(Timestamp dueAt) {
		this.dueAt = dueAt;
	}

	@Override
	public String toString() {
		return "Task [taskID=" + taskID + ", user=" + user + ", title=" + title + ", description=" + description
				+ ", category=" + category + ", urgency=" + urgency + ", createdAt=" + createdAt + ", dueAt=" + dueAt
				+ "]";
	}
	
}
