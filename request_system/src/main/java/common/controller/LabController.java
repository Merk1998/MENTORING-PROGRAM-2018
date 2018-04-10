package common.controller;

import common.entity.Incident;
import common.entity.Lab;
import common.repository.LabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    public @ResponseBody
    ResponseEntity<String> postLab (@RequestBody Lab lab){
        labRepository.save(lab);
        return new ResponseEntity<String>("Lab type " + lab.getName() + " was added", HttpStatus.CREATED);
    }
}