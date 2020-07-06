package com.slabiakt.xloadrestproxy.proxy.model.xloads;

import com.slabiakt.xloadrestproxy.proxy.model.otp.Leg;
import com.slabiakt.xloadrestproxy.proxy.model.otp.Place;

public class PolyLine {
    String value;
    String mode;

    //transit only
    long startTime;
    long endTime;
    double distance;
    String route;
    double duration;
    boolean transitLeg;
    Place from;
    Place to;
    String agencyName;

    public PolyLine(Leg leg) {
        this.value = leg.getLegGeometry().getPoints();
        this.mode = leg.getMode();
        this.startTime = leg.getStartTime();
        this.endTime = leg.getEndTime();
        this.distance = leg.getDistance();
        this.route = leg.getRoute();
        this.duration = leg.getDuration();
        this.transitLeg = leg.isTransitLeg();
        this.from = leg.getFrom();
        this.to = leg.getTo();
        this.agencyName = leg.getAgencyName();
    }
    
    public PolyLine(String value, String mode) {
        this.value = value;
        this.mode = mode;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
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

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public boolean isTransitLeg() {
        return transitLeg;
    }

    public void setTransitLeg(boolean transitLeg) {
        this.transitLeg = transitLeg;
    }

    public Place getFrom() {
        return from;
    }

    public void setFrom(Place from) {
        this.from = from;
    }

    public Place getTo() {
        return to;
    }

    public void setTo(Place to) {
        this.to = to;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
