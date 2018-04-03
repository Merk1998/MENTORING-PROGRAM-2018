package common.controller;

import common.entity.GroupType;
import common.entity.TaskType;
import common.repository.GroupTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class GroupTypeController {

    @Autowired
    GroupTypeRepository repository;

    @GetMapping("/groups_types")
    public @ResponseBody Iterable<GroupType> getAllGroupsTypes() {
        return repository.findAll();
    }

    @PostMapping(path = "/group_types")
    public String addGroupType (@RequestBody String name){
        GroupType temp= new GroupType();
        temp.setName(name);
        repository.save(temp);
        return "Added new group type " + name;
    }
}