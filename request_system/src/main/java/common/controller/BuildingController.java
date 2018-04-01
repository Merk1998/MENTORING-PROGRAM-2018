package common.controller;

import common.entity.Building;
import common.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class BuildingController {

    @Autowired
    BuildingRepository buildingRepository;

    @GetMapping("/buildings")
    public @ResponseBody Iterable<Building> getAllBuildings() {
        return buildingRepository.findAll();
    }
}