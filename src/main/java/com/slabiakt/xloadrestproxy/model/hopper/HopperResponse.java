package com.slabiakt.xloadrestproxy.model.hopper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.slabiakt.xloadrestproxy.model.otp.OtpResponseDeserializer;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HopperResponse {
    List<Path> paths;

    public List<Path> getPaths() {
        return paths;
    }

    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }
}
