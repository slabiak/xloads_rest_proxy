package com.slabiakt.xloadrestproxy.proxy.model.otp;

public class Place {

    public String name;
    public double lon;
    public double lat;
    public long arrival;
    public long departure;
    public String orig;
    public String zoneId;
    public int stopIndex;
    public int stopSequence;
    public String vertexType;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public long getArrival() {
        return arrival;
    }

    public void setArrival(long arrival) {
        this.arrival = arrival;
    }

    public long getDeparture() {
        return departure;
    }

    public void setDeparture(long departure) {
        this.departure = departure;
    }

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public int getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(int stopSequence) {
        this.stopSequence = stopSequence;
    }

    public String getVertexType() {
        return vertexType;
    }

    public void setVertexType(String vertexType) {
        this.vertexType = vertexType;
    }
}
