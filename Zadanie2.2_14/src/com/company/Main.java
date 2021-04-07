package com.company;

public class Main {

    public static void main(String[] args) {
	    Invoice ksiazka = new Invoice("123", "Książka", 3, 29.90);
	    Invoice bezcen = new Invoice("987", "Rupieć", 5000, 0);
	    Invoice proznia = new Invoice();

        System.out.printf("%s o nr %s. Ilość: %d. Cena: %s\n", ksiazka.getProduct_description(), ksiazka.getProduct_number(), ksiazka.getQuantity(), ksiazka.getPricePerItem());
        System.out.println("Całkowita wartość towarów: " + ksiazka.amount());
        System.out.printf("%s o nr %s. Ilość: %d. Cena: %s\n", bezcen.getProduct_description(), bezcen.getProduct_number(), bezcen.getQuantity(), bezcen.getPricePerItem());
        System.out.println("Całkowita wartość towarów: " + bezcen.amount());
        System.out.printf("%s o nr %s. Ilość: %d. Cena: %s\n", proznia.getProduct_description(), proznia.getProduct_number(), proznia.getQuantity(), proznia.getPricePerItem());
        System.out.println("Całkowita wartość towarów: " + proznia.amount());

        proznia.setProduct_number("12345");
        proznia.setProduct_description("Próżnia");
        proznia.setQuantity(-1);
        proznia.setPricePerItem(9999);

        System.out.printf("%s o nr %s. Ilość: %d. Cena: %s\n", proznia.getProduct_description(), proznia.getProduct_number(), proznia.getQuantity(), proznia.getPricePerItem());
        System.out.println("Całkowita wartość towarów: " + proznia.amount());
    }
}
