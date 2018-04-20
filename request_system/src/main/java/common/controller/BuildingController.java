package common.controller;

import common.entity.Building;
import common.entity.TaskType;
import common.entity.User;
import common.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class BuildingController {

    @Autowired
    BuildingRepository buildingRepository;

    @GetMapping("/buildings")
    public @ResponseBody Iterable<Building> getAllBuildings() {
        return buildingRepository.findAll();
    }

    @PostMapping(path = "/buildings")
    public @ResponseBody
    ResponseEntity<String> postBuilding (@RequestBody Building build){
        buildingRepository.save(build);
        return new ResponseEntity<String>("Building " + build.getName() + " was added", HttpStatus.CREATED);
    }
}