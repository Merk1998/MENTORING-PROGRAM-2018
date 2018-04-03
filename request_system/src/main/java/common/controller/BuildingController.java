package common.controller;

import common.entity.Building;
import common.entity.TaskType;
import common.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
    public String addTaskType (@RequestBody String name){
        Building temp= new Building();
        temp.setName(name);
        buildingRepository.save(temp);
        return "Added new building " + name;
    }
}