package controller;

import entity.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repository.RequestRepository;

@Controller
public class RequestController {

    @Autowired
    RequestRepository repository;

    @GetMapping("/requests")
    public Iterable<Request> getAllRequests() {
        return repository.findAll();
    }
}