package common.controller;

import common.entity.GroupType;
import common.repository.GroupTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class GroupTypeController {

    @Autowired
    GroupTypeRepository repository;

    @GetMapping("/groups_types")
    public @ResponseBody Iterable<GroupType> getAllGroupsTypes() {
        return repository.findAll();
    }
}