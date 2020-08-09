package com.slabiakt.xloadrestproxy.proxy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PhotonService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${photon.url.prefix}")
    private String urlPrefix;

    private static String photonReverseUrl = "/reverse?lon=%s&lat=%s";
    private static String photonAutoCompleteUrl = "/api/?q=%s&lon=17&lat=51&limit=10";

    public Object makeReverseGeocodeRequest(String lon, String lat) {
        String url = urlPrefix + String.format(photonReverseUrl, lon, lat);
        Object photonReverseGeocodeResponse = restTemplate.getForObject(url, Object.class);

        return photonReverseGeocodeResponse;
    }

    public Object makeAutoCompleteRequest(String searchText) {
        String url = urlPrefix + String.format(photonAutoCompleteUrl, searchText);
        Object photonAutoCompleteResponse = restTemplate.getForObject(url, Object.class);

        return photonAutoCompleteResponse;
    }
}
