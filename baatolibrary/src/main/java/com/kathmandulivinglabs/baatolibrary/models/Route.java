package com.kathmandulivinglabs.baatolibrary.models;

public class Route {
    private String encodedPolyline;
    private double distanceInMeters;
    private long timeInMs;
    private Object instructionList;

    public String getEncodedPolyline() {
        return encodedPolyline;
    }

    public void setEncodedPolyline(String encodedPolyline) {
        this.encodedPolyline = encodedPolyline;
    }

    public double getDistanceInMeters() {
        return distanceInMeters;
    }

    public void setDistanceInMeters(double distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
    }

    public long getTimeInMs() {
        return timeInMs;
    }

    public void setTimeInMs(long timeInMs) {
        this.timeInMs = timeInMs;
    }

    public Object getInstructionList() {
        return instructionList;
    }

    public void setInstructionList(Object instructionList) {
        this.instructionList = instructionList;
    }

    @Override
    public String toString() {
        return "Route{" +
                "encodedPolyline='" + encodedPolyline + '\'' +
                ", distanceInMeters=" + distanceInMeters +
                ", timeInMs=" + timeInMs +
                ", instructionList=" + instructionList +
                '}';
    }
}
