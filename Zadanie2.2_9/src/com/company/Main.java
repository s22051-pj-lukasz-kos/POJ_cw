package com.company;

public class Main {

    public static void main(String[] args) {
	    Point pointA = new Point(0, 200);
	    Point pointB = new Point();
	    Point pointCScalene = new Point(0,0);
	    Point pointCIsosceles = new Point(160, 400);
	    Segment tmpSegment = new Segment(pointA, pointB);
        Triangle scaleneTriangle = new Triangle(pointA, pointB, pointCScalene);
        Triangle isoscelesTriangle = new Triangle(pointA, pointB, pointCIsosceles);

        System.out.println(tmpSegment.toString());
        System.out.println("Length of that segment is equal to " + tmpSegment.getLength() + "\n");

        scaleneTriangle.getType();
        System.out.println(scaleneTriangle.toString());
        System.out.println("Perimeter of this triangle is equal to " + scaleneTriangle.getDistances() + "\n");

        isoscelesTriangle.getType();
        System.out.println(isoscelesTriangle.toString());
        System.out.println("Perimeter of this triangle is equal to " + isoscelesTriangle.getDistances());
    }
}
