package controller;

import entity.Incident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repository.IncidentRepository;

@Controller
public class IncidentController {

    @Autowired
    IncidentRepository repository;

    @GetMapping("/incident")
    public Iterable<Incident> getAllIncidents() {
        return repository.findAll();
    }
}