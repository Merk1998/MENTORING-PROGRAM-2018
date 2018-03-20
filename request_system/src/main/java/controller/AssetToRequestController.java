package controller;

import entity.AssetToRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repository.AssetToRequestRepository;

@Controller
public class AssetToRequestController {

    @Autowired
    AssetToRequestRepository repository;

    @GetMapping("/asset_to_request")
    public Iterable<AssetToRequest> getAllAssetToRequest() {
        return repository.findAll();
    }
}