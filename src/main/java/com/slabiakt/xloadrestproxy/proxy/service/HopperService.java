package com.slabiakt.xloadrestproxy.proxy.service;

import com.slabiakt.xloadrestproxy.proxy.model.hopper.HopperResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HopperService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${hooper.url.prefix}")
    private String urlPrefix;

    private static String hopperUrl = "/route?point=%s,%s&point=%s,%s&type=json&locale=pl-PL&weighting=fastest&vehicle=%s";

    public HopperResponse makeRequest(String fromLng, String fromLat, String toLng, String toLat, String vehicle) {
        String url = urlPrefix + String.format(hopperUrl, fromLat, fromLng, toLat, toLng, vehicle);
        HopperResponse forObject = restTemplate.getForObject(url, HopperResponse.class);
        forObject.getPaths().stream().forEach(path -> path.setMode(vehicle));
        return forObject;
    }
}
