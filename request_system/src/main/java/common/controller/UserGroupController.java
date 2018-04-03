package common.controller;

import common.entity.UserGroup;
import common.repository.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping (path="/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserGroupController {

    @Autowired
    UserGroupRepository userGroupRepository;

    @GetMapping("/users_groups")
    public @ResponseBody Iterable<UserGroup> getAllUsersGroups() {
        return userGroupRepository.findAll();
    }

    @PostMapping(path = "/users_groups")
    public String addUserGroup (@RequestBody String name){
        UserGroup temp= new UserGroup();
        temp.setName(name);
        userGroupRepository.save(temp);
        return "Added new user group " + name;
    }
}