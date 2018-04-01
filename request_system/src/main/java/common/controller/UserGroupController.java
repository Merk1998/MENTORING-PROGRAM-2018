package common.controller;

import common.entity.UserGroup;
import common.repository.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping (path="/demo")
public class UserGroupController {

    @Autowired
    UserGroupRepository repository;

    @GetMapping("/users_groups")
    public @ResponseBody Iterable<UserGroup> getAllUsersGroups() {
        return repository.findAll();
    }
}