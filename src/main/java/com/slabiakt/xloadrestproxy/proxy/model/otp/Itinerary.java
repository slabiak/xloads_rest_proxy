package com.slabiakt.xloadrestproxy.proxy.model.otp;

import java.util.List;

public class Itinerary {
    long duration;
    long startTime;
    long endTime;
    long walkTime;
    long transitTime;
    long waitingTime;
    double walkDistance;
    int transfers;
    List<Leg> legs;


    public List<Leg> getLegs() {
        return legs;
    }

    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
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
}
