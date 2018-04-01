package common.controller;

import common.entity.Task;
import common.repository.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping (path = "/demo")
public class TaskController {

    @Autowired
    TaskRepository repository;

    @GetMapping("/tasks")
    public @ResponseBody Iterable<Task>  getAllTasks() {
        return repository.findAll();
    }
}