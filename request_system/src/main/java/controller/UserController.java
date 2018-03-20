package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repository.UserRepository;

@Controller
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return repository.findAll();
    }
}