package common.controller;

import common.entity.AssetType;
import common.repository.AssetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class AssetTypeController {

    @Autowired
    AssetTypeRepository assetTypeRepository;

    @GetMapping("/assets_types")
    public @ResponseBody Iterable<AssetType> getAllAssetsTypes() {
        return assetTypeRepository.findAll();
    }
}