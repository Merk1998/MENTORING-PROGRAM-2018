package common.controller;

import common.entity.AssetToRequest;
import common.repository.AssetToRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class AssetToRequestController {

    @Autowired
    AssetToRequestRepository repository;

    @GetMapping("/asset_to_request")
    public Iterable<AssetToRequest> getAllAssetToRequest() {
        return repository.findAll();
    }
}