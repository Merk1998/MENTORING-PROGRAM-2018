package common.controller;

import common.entity.Request;
import common.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class RequestController {

    @Autowired
    RequestRepository repository;

    @GetMapping("/requests")
    public @ResponseBody Iterable<Request> getAllRequests() {
        return repository.findAll();
    }

    @PostMapping(path = "/requests")
    public @ResponseBody
    ResponseEntity<String> postRequest (@RequestBody Request req){
        repository.save(req);
        return new ResponseEntity<String>("Request " + req.getName() + " was added", HttpStatus.CREATED);
    }
}