package controller;

import entity.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repository.UserTypeRepository;

@Controller
public class UserTypeController {

    @Autowired
    UserTypeRepository repository;

    @GetMapping("/users_types")
    public Iterable<UserType> getAllUsersTypes() {
        return repository.findAll();
    }
}