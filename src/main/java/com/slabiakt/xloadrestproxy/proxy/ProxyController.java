package com.slabiakt.xloadrestproxy.proxy;

import com.slabiakt.xloadrestproxy.model.xloads.Route;
import com.slabiakt.xloadrestproxy.service.HopperService;
import com.slabiakt.xloadrestproxy.service.OtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/route")
@CrossOrigin(origins = "*")
public class ProxyController {

    @Autowired
    private OtpService otpService;

    @Autowired
    private HopperService hopperService;

    @GetMapping("/transit")
    public List<Route> ptransport(@RequestParam String fromLng, @RequestParam String fromLat, @RequestParam String toLng, @RequestParam String toLat, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime depTime) {
        return otpService.makeRequest(fromLng, fromLat, toLng, toLat, depTime).getItineraries().stream().map(itinerary -> new Route(itinerary)).collect(Collectors.toList());
    }

    @GetMapping("/car")
    public List<Route> car(@RequestParam String fromLng, @RequestParam String fromLat, @RequestParam String toLng, @RequestParam String toLat) {
        return hopperService.makeRequest(fromLng, fromLat, toLng, toLat, "car").getPaths().stream().map(path -> new Route(path)).collect(Collectors.toList());
    }

    @GetMapping("/foot")
    public List<Route> walk(@RequestParam String fromLng, @RequestParam String fromLat, @RequestParam String toLng, @RequestParam String toLat) {
        return hopperService.makeRequest(fromLng, fromLat, toLng, toLat, "foot").getPaths().stream().map(path -> new Route(path)).collect(Collectors.toList());
    }
}
