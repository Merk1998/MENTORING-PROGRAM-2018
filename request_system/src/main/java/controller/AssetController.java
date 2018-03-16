package controller;

import entity.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import repository.AssetRepository;

@Controller
public class AssetController {

    @Autowired
    AssetRepository repository;

    @RequestMapping("/assets")
    public Iterable<Asset> getAllAssets() {
        return repository.findAll();
    }
}