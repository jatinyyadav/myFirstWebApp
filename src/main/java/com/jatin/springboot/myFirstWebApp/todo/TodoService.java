package com.jatin.springboot.myFirstWebApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	public static int todocount = 0;
	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo(++todocount,"jatin",LocalDate.now().plusYears(1),"bring groccery",false));
		todos.add(new Todo(++todocount,"jatin",LocalDate.now().plusYears(2),"wash clothes",false));
		todos.add(new Todo(++todocount,"jatin",LocalDate.now().plusYears(3),"complete the project",false));
	}
	
	public static List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username, LocalDate targetDate, String description, boolean done) {
		Todo todo = new Todo( ++todocount, username, targetDate, description, done);
		todos.add(todo);
	}
}
