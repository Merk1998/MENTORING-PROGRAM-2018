package common.controller;

//import common.entity.UserType;
import common.entity.UserType;
import common.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class UserTypeController {

    @Autowired
    UserTypeRepository repository;

    @GetMapping("/users_types")
    public @ResponseBody
    Iterable <UserType> getAllUsersTypes() {
        return repository.findAll();
    }
}