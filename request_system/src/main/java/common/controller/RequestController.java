package common.controller;

import common.entity.Request;
import common.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class RequestController {

    @Autowired
    RequestRepository repository;

    @GetMapping("/requests")
    public @ResponseBody Iterable<Request> getAllRequests() {
        return repository.findAll();
    }
}