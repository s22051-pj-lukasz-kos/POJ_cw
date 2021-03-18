package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(" ");  // pobranie linii danych
        float[] numbers = new float[input.length];

        // konwersja inputu ze String na typ zmiennoprzecinkowy
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Float.parseFloat(input[i]);
        }

        // sortowanie od najmniejszej
        float tmp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                    flag = true;
                }
            }
        }

        // przerzut do instiniejącej tablicy String
        NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);
        nf.setMinimumFractionDigits(6);
        for (int i = 0; i < input.length; i++) {
            input[i] = nf.format(numbers[i]);
        }

        // drukowanie danych
        System.out.println(input[0] + " " + input[1] + " " + input[2]);
        System.out.println(input[2] + " " + input[1] + " " + input[0]);
    }
}
