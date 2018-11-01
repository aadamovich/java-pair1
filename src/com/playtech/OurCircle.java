package com.playtech;

public class OurCircle {
    private Point center;
    private double radius;

    public OurCircle(Point center, long radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

}
