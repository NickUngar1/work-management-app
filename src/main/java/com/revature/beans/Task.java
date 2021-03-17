package com.revature.beans;

import java.sql.Date;

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
class Task {

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
	private Date createdAt;
	
	@Column(name = "date_time_due")
	private Date dueAt;
	
	
}
