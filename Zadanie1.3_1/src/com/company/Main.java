package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sentence = in.nextLine().toLowerCase().replace(" ", "");
        char[] sentenceChar = sentence.toCharArray();

        boolean flag = true;
        for (char ch:sentenceChar) {
            if (ch < 'a' || ch > 'z') {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
