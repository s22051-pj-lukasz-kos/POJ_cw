package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    final long secondsOfEarthYear = 31_557_600;
	    long seconds = in.nextLong();
	    String planet = in.next();
	    double years = 0.0;

	    switch (planet) {
            case "Ziemia" :
                years = (double) seconds / secondsOfEarthYear;
                break;
            case "Merkury" :
                years = seconds / (secondsOfEarthYear * 0.240_846_7);
                break;
            case "Wenus" :
                years = seconds / (secondsOfEarthYear * 0.615_197_26);
                break;
            case "Mars" :
                years = seconds / (secondsOfEarthYear * 1.880_815_8);
                break;
            case "Jowisz" :
                years = seconds / (secondsOfEarthYear * 11.862_615);
                break;
            case "Saturn" :
                years = seconds / (secondsOfEarthYear * 29.447_498);
                break;
            case "Uran" :
                years = seconds / (secondsOfEarthYear * 84.016_846);
                break;
            case "Neptun" :
                years = seconds / (secondsOfEarthYear * 164.791_32);
                break;
            default:
                break;
        }
        System.out.printf("%.2f", years);
    }
}
