package common.controller;

import common.entity.AssetType;
import common.entity.TaskType;
import common.repository.AssetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class AssetTypeController {

    @Autowired
    AssetTypeRepository repository;

    @GetMapping("/assets_types")
    public @ResponseBody Iterable<AssetType> getAllAssetsTypes() {
        return repository.findAll();
    }

    @PostMapping(path = "/asset_types")
    public String addAssetType (@RequestBody String name){
        AssetType temp= new AssetType();
        temp.setName(name);
        repository.save(temp);
        return "Added new user group";
    }
}