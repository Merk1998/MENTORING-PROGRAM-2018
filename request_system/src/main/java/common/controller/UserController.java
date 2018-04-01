package common.controller;

import common.entity.User;
import common.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping (path = "/demo")
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("/users")
    public @ResponseBody Iterable<User> getAllUsers() {
        return repository.findAll();
    }
}