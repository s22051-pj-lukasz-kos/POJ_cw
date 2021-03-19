package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    ArrayList<Integer> tablica = new ArrayList<>();

	    String[] inputString = in.nextLine().split(" ");

        for (String st: inputString) {
            tablica.add(Integer.parseInt(st));
        }

	    max_rec(tablica);
    }

    static void max_rec(ArrayList<Integer> numbers) {
        if (numbers.size() > 1) {
            if (numbers.get(0) < numbers.get(1)) {
                numbers.remove(0);
            } else {
                numbers.remove(1);
            }
            max_rec(numbers);
        } else {
            System.out.println(numbers.get(0));
        }
    }
}
