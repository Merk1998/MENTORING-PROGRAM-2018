package controller;

import entity.Task;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import repository.TaskRepository;

@Controller
public class TaskController {

    @Autowired
    TaskRepository repository;

    @GetMapping("/tasks")
    public /*Iterable<Task> */ String getAllTasks() {
        return "I'm works";
        //return repository.findAll();
    }
}