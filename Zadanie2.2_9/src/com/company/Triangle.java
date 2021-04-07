package com.company;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    Triangle() {}

    Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public String toString() {
        return "Segment[v1=(" + pointA.getX() + "," + pointA.getY() +
                "),v2=(" + pointB.getX() + "," + pointB.getY() +
                "),v3=(" + pointC.getX() + "," + pointC.getY() + ")]";
    }

    public double getDistances() {
        Segment edge1 = new Segment(pointA,pointB);
        Segment edge2 = new Segment(pointB,pointC);
        Segment edge3 = new Segment(pointC,pointA);

        return edge1.getLength() + edge2.getLength() + edge3.getLength();
    }

    public void getType() {
        Segment edge1 = new Segment(pointA,pointB);
        Segment edge2 = new Segment(pointB,pointC);
        Segment edge3 = new Segment(pointC,pointA);

        if ((edge1.getLength() != edge2.getLength()) && (edge1.getLength() != edge3.getLength())
                && (edge2.getLength() != edge3.getLength())) {
            System.out.println("Trójkąt jest różnoboczny");
        } else if ((edge1.getLength() == edge2.getLength()) && (edge2.getLength() == edge3.getLength())
                && edge3.getLength() == edge1.getLength()) {
            System.out.println("Trójkąt jest równoboczny");
        } else {
            System.out.println("Trójkąt jest równoramienny");
        }
    }
}
