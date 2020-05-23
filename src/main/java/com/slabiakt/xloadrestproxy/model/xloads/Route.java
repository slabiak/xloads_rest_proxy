package com.slabiakt.xloadrestproxy.model.xloads;

import com.slabiakt.xloadrestproxy.model.hopper.Path;
import com.slabiakt.xloadrestproxy.model.hopper.Points;
import com.slabiakt.xloadrestproxy.model.otp.Itinerary;
import com.slabiakt.xloadrestproxy.model.otp.Leg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Route {

    String mode;
    long totalTime;
    double totalDistance;
    List<PolyLine> sections;


//    long startTime;
//    long endTime;
//    long walkTime;
//    long transitTime;
//    long waitingTime;
//    double walkDistance;
//    int transfers;
//    List<Leg> legs;


//    double distance;


    public Route(Path path) {
        this.mode = path.getMode();
        this.totalTime = path.getTime()/1000;
        this.totalDistance = path.getDistance();
        PolyLine polyLine = new PolyLine(path.getPoints(),path.getMode());
        List<PolyLine> polyLines = new ArrayList<>();
        polyLines.add(polyLine);
        this.sections = polyLines;
    }

    public Route(Itinerary itinerary) {
        this.totalTime = itinerary.getDuration();
        this.sections = itinerary.getLegs().stream().map(leg -> new PolyLine(leg)).collect(Collectors.toList());
        this.totalDistance = 0;
        this.mode = "transit";
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public List<PolyLine> getSections() {
        return sections;
    }

    public void setSections(List<PolyLine> sections) {
        this.sections = sections;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
