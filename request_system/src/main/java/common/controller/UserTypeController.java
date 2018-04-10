package common.controller;

import common.entity.UserType;
import common.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserTypeController {

    @Autowired
    UserTypeRepository repository;

    @GetMapping("/users_types")
    public @ResponseBody
    Iterable <UserType> getAllUsersTypes() {
        return repository.findAll();
    }

    @PostMapping("/user_types") //works very well
    public @ResponseBody
    ResponseEntity<String> postUserType(@RequestBody UserType usert) {
        repository.save(usert);
        return new ResponseEntity<String>("User type " + usert.getName() + " was added", HttpStatus.CREATED);
    }

}