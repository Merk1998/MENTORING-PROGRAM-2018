package common.controller;

import common.entity.User;
import common.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping (path = "/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/post_user") //works very well
    public @ResponseBody
    ResponseEntity<String> postUser(@RequestBody User user) {
        userRepository.save(user);
        return new ResponseEntity<String>("User " + user.getName() + " was added", HttpStatus.CREATED);
    }

}