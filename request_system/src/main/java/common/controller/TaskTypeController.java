package common.controller;

import common.entity.Task;
import common.repository.TaskTypeRepository;
import common.entity.TaskType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    public @ResponseBody
    ResponseEntity<String> postTaskType (@RequestBody TaskType taskt){
        repository.save(taskt);
        return new ResponseEntity<String>("Task type " + taskt.getName() + " was added", HttpStatus.CREATED);
    }
}