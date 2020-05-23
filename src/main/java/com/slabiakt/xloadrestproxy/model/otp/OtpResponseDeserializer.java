package com.slabiakt.xloadrestproxy.model.otp;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OtpResponseDeserializer extends StdDeserializer<OtpResponse> {

    public OtpResponseDeserializer() {
        this(null);
    }

    public OtpResponseDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public OtpResponse deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode productNode = jsonParser.getCodec().readTree(jsonParser);
        OtpResponse otpResponse = new OtpResponse();
        List<JsonNode> itineraries = new ArrayList<>();
        productNode.get("plan").get("itineraries").elements().forEachRemaining(e->{
            itineraries.add(e);
        });
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        List<Itinerary> result = itineraries.stream().map(i -> {
            try {
                return objectMapper.treeToValue(i, Itinerary.class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return new Itinerary();
            }
        }).collect(Collectors.toList());


        otpResponse.setItineraries(result);
        return otpResponse;
    }
}
