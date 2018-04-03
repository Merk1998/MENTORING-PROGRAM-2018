package common.controller;

import common.entity.Asset;
import common.entity.User;
import common.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping(path="/say")
    public @ResponseBody
    String sayHello () {
        return "Hello, I'm work";
    }
}