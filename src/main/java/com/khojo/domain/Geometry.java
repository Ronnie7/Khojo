package com.khojo.domain;

public class Geometry {

    public Location location;
    public Location viewpoint;
    public Location southwest;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getViewpoint() {
        return viewpoint;
    }

    public void setViewpoint(Location viewpoint) {
        this.viewpoint = viewpoint;
    }

    public Location getSouthwest() {
        return southwest;
    }

    public void setSouthwest(Location southwest) {
        this.southwest = southwest;
    }


}