package common.controller;

import common.entity.Asset;
import common.entity.Building;
import common.entity.User;
import common.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class AssetController {

    @Autowired
    private AssetRepository assetRepository;

    @GetMapping(path="/assets")
    public @ResponseBody Iterable<Asset> getAllAssetToRequest() {
        return assetRepository.findAll();
    }

    @PostMapping(path = "/assets")
    public @ResponseBody
    ResponseEntity<String> postAsset (@RequestBody Asset asset){
        assetRepository.save(asset);
        return new ResponseEntity<String>("Asset " + asset.getName() + " was added", HttpStatus.CREATED);
    }
}