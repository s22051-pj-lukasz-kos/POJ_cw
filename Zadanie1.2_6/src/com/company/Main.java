package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");

        System.out.println("\"%" + input[1] + " " + input[0] + "%\"");
    }
}