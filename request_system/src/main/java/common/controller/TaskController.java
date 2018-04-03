package common.controller;

import common.entity.Task;
import common.repository.TaskRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping (path = "/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class TaskController {

    @Autowired
    TaskRepository repository;

    @GetMapping("/tasks")
    public @ResponseBody Iterable<Task>  getAllTasks() {
        return repository.findAll();
    }

    @PostMapping(path = "/tasks")
    public String addTask (@RequestBody String name){
        Task temp= new Task();
        temp.setName(name);
        repository.save(temp);
        return "Added new task " + name;
    }
}