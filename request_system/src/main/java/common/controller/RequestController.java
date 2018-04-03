package common.controller;

import common.entity.Request;
import common.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
    public String addReuest (@RequestBody String name){
        Request temp= new Request();
        temp.setName(name);
        repository.save(temp);
        return "Added new request " + name;
    }
}