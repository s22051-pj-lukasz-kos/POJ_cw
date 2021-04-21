package com.company;

public class Main {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2,3);
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
