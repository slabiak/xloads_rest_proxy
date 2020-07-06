package com.slabiakt.xloadrestproxy.proxy.model.otp;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize(using = OtpResponseDeserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OtpResponse {

    private List<Itinerary> itineraries;

    public List<Itinerary> getItineraries() {
        return itineraries;
    }

    public void setItineraries(List<Itinerary> itineraries) {
        this.itineraries = itineraries;
    }
}
