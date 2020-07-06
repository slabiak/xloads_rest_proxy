package com.slabiakt.xloadrestproxy.proxy.service;

import com.slabiakt.xloadrestproxy.proxy.model.otp.OtpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class OtpService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${otp.url.prefix}")
    private String urlPrefix;

    private static String otpUrl = "/otp/routers/default/plan?fromPlace=%s,%s&toPlace=%s,%s&time=%s&date=%s&mode=TRANSIT,WALK&maxWalkDistance=804.672&arriveBy=false&wheelchair=false&locale=pl";

    public OtpResponse makeRequest(String fromLng, String fromLat, String toLng, String toLat, LocalDateTime depTime) {

        String date = depTime.toLocalDate().toString();
        String time = depTime.toLocalTime().toString();
        String url = urlPrefix + String.format(otpUrl, fromLat, fromLng, toLat, toLng, time, date);
        OtpResponse otpResponse = restTemplate.getForObject(url, OtpResponse.class);

        return otpResponse;
    }
}
