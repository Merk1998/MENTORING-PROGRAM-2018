package common.controller;

import common.entity.UserType;
import common.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserTypeController {

    @Autowired
    UserTypeRepository userTypeRepository;

    @GetMapping("/users_types")
    public @ResponseBody
    Iterable <UserType> getAllUsersTypes() {
        return userTypeRepository.findAll();
    }

    @PostMapping(path = "/users_types")
    public String addUserType(@RequestBody String name){
        UserType temp = new UserType();
        temp.setName(name);
        userTypeRepository.save(temp);
        return "Added new user type " + name;
    }
}