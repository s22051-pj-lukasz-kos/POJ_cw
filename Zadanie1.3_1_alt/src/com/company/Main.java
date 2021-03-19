package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sentence = in.nextLine().toLowerCase();

        char[] letters = sentence.replaceAll("[^a-z]", "" ).toCharArray();
        Set<Character> lettersSet = new HashSet<>();
        for (char lett: letters) {
            lettersSet.add(lett);
        }

        if (lettersSet.size() == 26) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
