package common.controller;

import common.entity.AssetToRequest;
import common.entity.Building;
import common.repository.AssetToRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class AssetToRequestController {

    @Autowired
    AssetToRequestRepository repository;

    @GetMapping("/asset_to_request")
    public Iterable<AssetToRequest> getAllAssetToRequest() {
        return repository.findAll();
    }

    @PostMapping(path = "/asset_to_request")
    public @ResponseBody
    ResponseEntity<String> postAssetToRequest (@RequestBody AssetToRequest atr){
        repository.save(atr);
        return new ResponseEntity<String>("AssetToRequest relationship was added", HttpStatus.CREATED);
    }
}