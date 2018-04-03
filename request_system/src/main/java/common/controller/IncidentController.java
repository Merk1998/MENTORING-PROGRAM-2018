package common.controller;

import common.entity.Incident;
import common.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class IncidentController {

    @Autowired
    IncidentRepository repository;

    @GetMapping("/incidents")
    public @ResponseBody
    Iterable<Incident> getAllIncidents() {
        return repository.findAll();
    }

    @PostMapping(path = "/incidents")
    public String addIncident (@RequestBody String name){
        Incident temp= new Incident();
        temp.setName(name);
        repository.save(temp);
        return "Added new incident " + name;
    }
}