package com.slabiakt.xloadrestproxy.model.otp;

public class Leg {

    long startTime;
    long endTime;
    double distance;
    String mode;
    double duration;
    boolean transitLeg;
    Place from;
    Place to;
    EncodedPolylineBean legGeometry;


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

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
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

    public EncodedPolylineBean getLegGeometry() {
        return legGeometry;
    }

    public void setLegGeometry(EncodedPolylineBean legGeometry) {
        this.legGeometry = legGeometry;
    }
}
