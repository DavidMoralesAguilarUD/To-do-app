package com.example.demo.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter = 0;
	static {
		todos.add(new Todo(++idCounter, "in28minutes","Learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter, "in28minutes","Learn about Microservices", new Date(), false));
		todos.add(new Todo(++idCounter, "in28minutes","Learn about Angular", new Date(), true));
		todos.add(new Todo(++idCounter, "in28minutes","Learn about JS", new Date(), true));
		todos.add(new Todo(++idCounter, "in28minutes","Been hackerman", new Date(), true));
		
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	public Todo deletebyId(long id) {
		Todo todo = findById(id);
		if(todo==null) return null;
		
		if(todos.remove(todo)) {
			return todo;
		}
		return null;
	}
	private Todo findById(long id) {
		for(Todo todo:todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

}
