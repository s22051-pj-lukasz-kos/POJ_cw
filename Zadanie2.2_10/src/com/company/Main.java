package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var generator = new Random();
        int pierwszaWartosc = generator.nextInt(12);
        int pierwszyKolor = generator.nextInt(3);
        int drugaWartosc = generator.nextInt(12);
        int drugiKolor = generator.nextInt(3);
        int trzeciaWartosc = generator.nextInt(12);
        int trzeciKolor = generator.nextInt(3);

        Card pierwszaKarta = new Card(pierwszaWartosc, pierwszyKolor);
        Card drugaKarta = new Card(drugaWartosc, drugiKolor);
        Card trzeciaKarta = new Card(trzeciaWartosc, trzeciKolor);

        System.out.println("Pierwsza karta to " + pierwszaKarta.getWartosc() + " " + pierwszaKarta.getKolor());
        System.out.println("Druga karta to " + drugaKarta.getWartosc() + " " + drugaKarta.getKolor());
        System.out.println("Trzecia karta to " + trzeciaKarta.getWartosc() + " " + trzeciaKarta.getKolor());
    }
}
