package common.controller;

import common.entity.User;
import common.entity.UserGroup;
import common.repository.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/users_groups") //works very well
    public @ResponseBody
    ResponseEntity<String> postUserGroup(@RequestBody UserGroup userg) {
        userGroupRepository.save(userg);
        return new ResponseEntity<String>("User group " + userg.getName() + " was added", HttpStatus.CREATED);
    }

}