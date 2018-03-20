package controller;

import entity.AssetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repository.AssetTypeRepository;

@Controller
public class AssetTypeController {

    @Autowired
    AssetTypeRepository repository;

    @GetMapping("/assets_types")
    public Iterable<AssetType> getAllAssetsTypes() {
        return repository.findAll();
    }
}