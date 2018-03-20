package controller;

import entity.GroupType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repository.GroupTypeRepository;

@Controller
public class GroupTypeController {

    @Autowired
    GroupTypeRepository repository;

    @GetMapping("/groups_types")
    public Iterable<GroupType> getAllGroupsTypes() {
        return repository.findAll();
    }
}