package com.kathmandulivinglabs.baatolibrary.models;

import java.util.List;

public class Place {
    private String license;

    private String score;

    private String address;

    private LatLon centroid;

    private String placeId;

    private String name;

    private Geometry geometry;

    private String type;

    private List<String> tags;

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LatLon getCentroid() {
        return centroid;
    }

    public void setCentroid(LatLon centroid) {
        this.centroid = centroid;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Place{" +
                "license='" + license + '\'' +
                ", score='" + score + '\'' +
                ", address='" + address + '\'' +
                ", centroid=" + centroid +
                ", placeId='" + placeId + '\'' +
                ", name='" + name + '\'' +
                ", geometry=" + geometry +
                ", type='" + type + '\'' +
                ", tags=" + tags +
                '}';
    }
}
