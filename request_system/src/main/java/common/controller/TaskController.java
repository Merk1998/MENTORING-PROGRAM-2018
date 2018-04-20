package common.controller;

import common.entity.Incident;
import common.entity.Task;
import common.repository.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    public @ResponseBody
    ResponseEntity<String> postTask (@RequestBody Task task){
        repository.save(task);
        return new ResponseEntity<String>("Task " + task.getName() + " was added", HttpStatus.CREATED);
    }
}