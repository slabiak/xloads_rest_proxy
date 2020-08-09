package com.slabiakt.xloadrestproxy.proxy.model.xloads;

import com.slabiakt.xloadrestproxy.proxy.model.hopper.Path;
import com.slabiakt.xloadrestproxy.proxy.model.otp.Itinerary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Route {
    //all
    long totalTime;
    String mode;
    List<PolyLine> sections;

    //car,foot
    double totalDistance;

    //transit
    long startTime;
    long endTime;
    long walkTime;
    long transitTime;
    long waitingTime;
    double walkDistance;
    int transfers;


    public Route(Path path) {
        this.totalTime = path.getTime() / 1000;
        this.mode = path.getMode();
        PolyLine polyLine = new PolyLine(path.getPoints(), path.getMode());
        List<PolyLine> polyLines = new ArrayList<>();
        polyLines.add(polyLine);
        this.sections = polyLines;
        this.totalDistance = path.getDistance();
    }

    public Route(Itinerary itinerary) {
        this.totalTime = itinerary.getDuration();
        this.mode = "transit";
        this.sections = itinerary.getLegs().stream().map(leg -> new PolyLine(leg)).collect(Collectors.toList());
        this.totalDistance = 0;
        this.startTime = itinerary.getStartTime();
        this.endTime = itinerary.getEndTime();
        this.walkTime = itinerary.getWalkTime();
        this.transitTime = itinerary.getTransitTime();
        this.waitingTime = itinerary.getWaitingTime();
        this.walkDistance = itinerary.getWalkDistance();
        this.transfers = itinerary.getTransfers();
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getWalkTime() {
        return walkTime;
    }

    public void setWalkTime(long walkTime) {
        this.walkTime = walkTime;
    }

    public long getTransitTime() {
        return transitTime;
    }

    public void setTransitTime(long transitTime) {
        this.transitTime = transitTime;
    }

    public long getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(long waitingTime) {
        this.waitingTime = waitingTime;
    }

    public double getWalkDistance() {
        return walkDistance;
    }

    public void setWalkDistance(double walkDistance) {
        this.walkDistance = walkDistance;
    }

    public int getTransfers() {
        return transfers;
    }

    public void setTransfers(int transfers) {
        this.transfers = transfers;
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
