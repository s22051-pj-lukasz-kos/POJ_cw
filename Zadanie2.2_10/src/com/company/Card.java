package com.company;

public class Card {
    private enum Wartosc {
        DWA("2"), TRZY("3"), CZTERY("4"), PIEC("5"), SZESC("6"),
        SIEDEM("7"), OSIEM("8"), DZIEWIEC("9"), DZIESIEC("10"),
        WALET("Walet"), DAMA("Dama"), KROL("Król"), AS("As");

        private String value;
        Wartosc (String value) { this.value = value; }
        public String getValue() { return value; }
    }
    private enum Kolor {kier, karo, pik, trefl}

    private Wartosc wartosc;
    private Kolor kolor;

    public Card(int aWartosc, int aKolor) {
        this.wartosc = Wartosc.values()[aWartosc];
        this.kolor = Kolor.values()[aKolor];
    }

    public String getWartosc() {
        return wartosc.getValue();
    }

    public String getKolor() {
        return kolor.toString();
    }
}
