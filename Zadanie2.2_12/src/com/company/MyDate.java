package com.company;

public class MyDate {
    private int month;
    private int day;
    private int year;

    MyDate(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public void setYear(int year) {
        try {
            this.year = year;
            if (year < 1990 || year > 2050) {
                throw new IllegalArgumentException("Liczba spoza zakresu. Zakres lat to 1990-2050");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setMonth(int month) {
        try {
            this.month = month;
            if (month < 0 || month > 12) {
                throw new IllegalArgumentException("Liczba spoza zakresu. Zakres miesięcy to 0-12");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setDay(int day) {
        try {
            this.day = day;
            if (day < 0 || day > 31) {
                throw new IllegalArgumentException("Liczba spoza zakresu. Zakres dni to 0-31");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }
}
