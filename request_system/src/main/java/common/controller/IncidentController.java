package common.controller;

import common.entity.Incident;
import common.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class IncidentController {

    @Autowired
    IncidentRepository repository;

    @GetMapping("/incident")
    public @ResponseBody
    Iterable<Incident> getAllIncidents() {
        return repository.findAll();
    }
}