package com.jmworks.todoapi.controller;

import com.jmworks.todoapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@RequestMapping("/api")
@RepositoryRestController
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @DeleteMapping("/todos/all")
    public void deleteAllTodos() {
        todoRepository.deleteAll();
    }

}
