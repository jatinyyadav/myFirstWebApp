package com.jatin.springboot.myFirstWebApp.todo;

import java.time.LocalDate;

public class Todo {

	public Todo(int id, String username, LocalDate targetDate, String description, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.targetDate = targetDate;
		this.description = description;
		this.done = done;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", targetDate=" + targetDate + ", description="
				+ description + ", done=" + done + "]";
	}
	private int id;
	private String username;
	private LocalDate targetDate;
	private String description;
	private boolean done;
}
