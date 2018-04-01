package common.controller;

import common.repository.TaskTypeRepository;
import common.entity.TaskType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping (path = "/demo")
public class TaskTypeController {

    @Autowired
    TaskTypeRepository repository;

    @GetMapping("/tasks_types")
    public @ResponseBody Iterable<TaskType> getAllTasksTypes() {
        return repository.findAll();
    }
}