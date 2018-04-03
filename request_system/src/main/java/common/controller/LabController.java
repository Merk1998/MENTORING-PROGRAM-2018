package common.controller;

import common.entity.Lab;
import common.repository.LabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class LabController {

    @Autowired
    LabRepository labRepository;

    @GetMapping("/labs")
    public @ResponseBody Iterable<Lab> getAllLabs() {
        return labRepository.findAll();
    }

    @PostMapping(path = "/labs")
    public String addLab (@RequestBody String name){
        Lab temp= new Lab();
        temp.setName(name);
        labRepository.save(temp);
        return "Added new lab " + name;
    }
}