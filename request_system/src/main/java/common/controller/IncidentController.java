package common.controller;

import common.entity.GroupType;
import common.entity.Incident;
import common.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    public @ResponseBody
    ResponseEntity<String> postIncident (@RequestBody Incident inc){
        repository.save(inc);
        return new ResponseEntity<String>("Incident " + inc.getName() + " was added", HttpStatus.CREATED);
    }
}