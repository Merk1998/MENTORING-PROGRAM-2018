package common.controller;

import common.repository.TaskTypeRepository;
import common.entity.TaskType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping (path = "/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class TaskTypeController {

    @Autowired
    TaskTypeRepository repository;

    @GetMapping("/tasks_types")
    public @ResponseBody Iterable<TaskType> getAllTasksTypes() {
        return repository.findAll();
    }

    @PostMapping(path = "/tasks_types")
    public String addTaskType (@RequestBody String name){
        TaskType temp= new TaskType();
        temp.setName(name);
        repository.save(temp);
        return "Added new task type " + name;
    }
}