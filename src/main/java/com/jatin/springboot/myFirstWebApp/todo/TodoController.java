package com.jatin.springboot.myFirstWebApp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
	
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}


	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = TodoService.findByUsername("jatin");
		model.addAttribute("todos", todos);
		return "listTodos";
	}
	
	@RequestMapping(value="add-todo", method=RequestMethod.GET)
	public String ShowNewTodoPage() {
		return "todo";
	}
	
	@RequestMapping(value="add-todo", method=RequestMethod.POST)
	public String AddNewTodo(@RequestParam String description, ModelMap model) {
		String username = (String)model.get("name");
		todoService.addTodo(username,LocalDate.now().plusYears(1),description,false);
		return "redirect:list-todos";
	}
}
	
