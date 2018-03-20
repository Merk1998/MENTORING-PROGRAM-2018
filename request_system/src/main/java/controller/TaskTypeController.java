package controller;

import entity.TaskType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repository.TaskTypeRepository;

@Controller
public class TaskTypeController {

    @Autowired
    TaskTypeRepository repository;

    @GetMapping("/tasks_types")
    public Iterable<TaskType> getAllTasksTypes() {
        return repository.findAll();
    }
}