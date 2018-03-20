package controller;

import entity.UserGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repository.UserGroupRepository;

@Controller
public class UserGroupController {

    @Autowired
    UserGroupRepository repository;

    @GetMapping("/users_groups")
    public Iterable<UserGroup> getAllUsersGroups() {
        return repository.findAll();
    }
}