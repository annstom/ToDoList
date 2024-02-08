package com.simpletodo.controller;

import com.simpletodo.entity.TodoTask;
import com.simpletodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
public class TodoController {
    @Autowired
    private TodoService todoService; // injected our service

    @GetMapping("/task/:id")
    public TodoTask getTask(@PathVariable int id){
        return todoService.getTask(id);
    }

    @GetMapping("/tasks")
    public List<?> getAllTasks(){
        return todoService.getAllTasks();
    }

    @DeleteMapping("/task/:id")
    public void deleteTask(@PathVariable int id){
        todoService.delete(id);
    }

    @PostMapping("/task")
    public TodoTask createTask(@RequestBody TodoTask todoTask){
        return todoService.createOrUpdate(todoTask);
    }
}
