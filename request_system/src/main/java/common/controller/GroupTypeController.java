package common.controller;

import common.entity.Asset;
import common.entity.GroupType;
import common.entity.TaskType;
import common.repository.GroupTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class GroupTypeController {

    @Autowired
    GroupTypeRepository repository;

    @GetMapping("/group_types")
    public @ResponseBody Iterable<GroupType> getAllGroupsTypes() {
        return repository.findAll();
    }

    @PostMapping(path = "/group_types")
    public @ResponseBody
    ResponseEntity<String> postGroupTypes (@RequestBody GroupType gr){
        repository.save(gr);
        return new ResponseEntity<String>("Group type " + gr.getName() + " was added", HttpStatus.CREATED);
    }
}