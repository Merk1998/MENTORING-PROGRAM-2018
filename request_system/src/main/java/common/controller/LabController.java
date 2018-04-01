package common.controller;

import common.entity.Lab;
import common.repository.LabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class LabController {

    @Autowired
    LabRepository labRepository;

    @GetMapping("/lab")
    public @ResponseBody Iterable<Lab> getAllLabs() {
        return labRepository.findAll();
    }
}