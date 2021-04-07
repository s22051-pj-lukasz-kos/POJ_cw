package com.company;

public class Numbers {
    private int one;
    private int two;
    private int three;

    Numbers(int one, int two, int three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public int getOne() {
        return one;
    }

    public int getTwo() {
        return two;
    }

    public int getThree() {
        return three;
    }

    public long sum() {
        return (long) one + two + three;
    }

    public double average() {
        return (double) sum() / 3;
    }

    public int min() {
        int tmp = one;
        if (two < one) {
            tmp = two;
        }
        if (three < tmp) {
            tmp = three;
        }
        return tmp;
    }

    public int max() {
        int tmp = one;
        if (two > one) {
            tmp = two;
        }
        if (three > tmp) {
            tmp = three;
        }
        return tmp;
    }

    public double geometric() {
        long underRoot = (long) one * two * three;
        double power = (double) 1/3;
        return Math.pow(underRoot, power);
    }
}
