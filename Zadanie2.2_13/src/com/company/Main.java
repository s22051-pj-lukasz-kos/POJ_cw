package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var generator = new Random();
        int num1 = generator.nextInt(100);
        int num2 = generator.nextInt(100);
        int num3 = generator.nextInt(100);
        Numbers numbers = new Numbers(num1, num2, num3);

        System.out.printf("Liczby: %d %d %d\n", numbers.getOne(), numbers.getTwo(), numbers.getThree());
        System.out.println("Suma: " + numbers.sum());
        System.out.println("Średnia: " + numbers.average());
        System.out.println("Najmniejsza: " + numbers.min());
        System.out.println("Największa: " + numbers.max());
        System.out.println("Średnia geometryczna: " + numbers.geometric());
    }
}
