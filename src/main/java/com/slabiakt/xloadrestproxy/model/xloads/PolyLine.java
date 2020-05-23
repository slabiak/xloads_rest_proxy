package com.slabiakt.xloadrestproxy.model.xloads;

import com.slabiakt.xloadrestproxy.model.otp.Leg;

import java.util.List;

public class PolyLine {
    String value;
    String mode;


    public PolyLine(Leg leg){
        this.value = leg.getLegGeometry().getPoints();
        this.mode = leg.getMode();
    }

    public PolyLine(String value, String mode) {
        this.value = value;
        this.mode = mode;
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
