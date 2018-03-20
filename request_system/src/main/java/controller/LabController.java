package controller;

import entity.Lab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repository.LabRepository;

@Controller
public class LabController {

    @Autowired
    LabRepository repository;

    @GetMapping("/lab")
    public Iterable<Lab> getAllLabs() {
        return repository.findAll();
    }
}