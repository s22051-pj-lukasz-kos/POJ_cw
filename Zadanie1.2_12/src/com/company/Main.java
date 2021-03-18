package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumberFormatException {
        Scanner in = new Scanner(System.in);

        try {
            // take input
            String[] arrayLengthString = in.nextLine().split(" ");
            String[] firstArrayDataString = in.nextLine().split(" ");
            String[] secondArrayDataString = in.nextLine().split(" ");

            // create new arrays with integer type data
            int[] arrayLength = new int[arrayLengthString.length];
            int[] firstArrayData = new int[firstArrayDataString.length];
            int[] secondArrayData = new int[secondArrayDataString.length];

            // parsing String input to integer arrays
            for (int i = 0; i < arrayLength.length; i++) {
                arrayLength[i] = Integer.parseInt(arrayLengthString[i]);
            }

            for (int i = 0; i < firstArrayData.length; i++) {
                firstArrayData[i] = Integer.parseInt(firstArrayDataString[i]);
            }

            for (int i = 0; i < secondArrayData.length; i++) {
                secondArrayData[i] = Integer.parseInt(secondArrayDataString[i]);
            }

            // return smaller array length
            int minimum = Math.min(arrayLength[0], arrayLength[1]);

            // calc dot product
            int dotProduct = 0;
            for (int i = 0; i < minimum; i++) {
                dotProduct += firstArrayData[i]*secondArrayData[i];
            }

            // print result
            System.out.println(dotProduct);
        } catch (Exception e) {
            System.out.println("BŁĄD");
        }
    }
}
