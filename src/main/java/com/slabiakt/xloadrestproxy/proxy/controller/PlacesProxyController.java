package com.slabiakt.xloadrestproxy.proxy.controller;

import com.slabiakt.xloadrestproxy.proxy.service.PhotonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api//place")
@CrossOrigin(origins = "*")
public class PlacesProxyController {

    @Autowired
    private PhotonService photonService;

    @GetMapping("/autocomplete")
    public Object autocomplete(@RequestParam String query) {
        return photonService.makeAutoCompleteRequest(query);
    }

    @GetMapping("/reverse")
    public Object reverse(@RequestParam String lat, @RequestParam String lng) {
        return photonService.makeReverseGeocodeRequest(lng, lat);
    }

}