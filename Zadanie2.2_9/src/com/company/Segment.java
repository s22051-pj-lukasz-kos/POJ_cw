package com.company;

public class Segment {
    private Point pointA;
    private Point pointB;

    Segment() {}

    Segment(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public String toString() {
        return "Segment[v1=(" + pointA.getX() + "," + pointA.getY() +
                "),v2=(" + pointB.getX() + "," + pointB.getY() + ")]";
    }

    public double getLength() {
        return pointA.distance(pointB);
    }
}
