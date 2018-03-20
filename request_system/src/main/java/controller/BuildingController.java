package controller;

import entity.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repository.BuildingRepository;

@Controller
public class BuildingController {

    @Autowired
    BuildingRepository repository;

    @GetMapping("/buildings")
    public Iterable<Building> getAllBuildings() {
        return repository.findAll();
    }
}