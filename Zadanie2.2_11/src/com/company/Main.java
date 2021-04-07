package com.company;

public class Main {

    public static void main(String[] args) {
	    Student lukaszKos = new Student("Łukasz", "Kos", 22051, 67, 3);
	    Student drugiStudent = new Student(10101, 35, 4);
	    Student walinski = new Student("Waliński", 12345, 90);
	    Student unknown = new Student(1212, 20);
	    Student unknown2 = new Student();

		System.out.println("Student(String imie, String nazwisko, int nrIndeksu, int obecnosc, int ocenaPOJ)");
	    System.out.printf("%s %s, %d. Obecność: %d%%. Ocena: %d\n", lukaszKos.getImie(), lukaszKos.getNazwisko(), lukaszKos.getNrIndeksu(), lukaszKos.getObecnosc(), lukaszKos.getOcenaPOJ());
		System.out.println("Student(int nrIndeksu, int obecnosc, int ocenaPOJ = 4)");
		System.out.printf("%s %s, %d. Obecność: %d%%. Ocena: %d\n", drugiStudent.getImie(), drugiStudent.getNazwisko(), drugiStudent.getNrIndeksu(), drugiStudent.getObecnosc(), drugiStudent.getOcenaPOJ());
		System.out.println("Student(String nazwisko, int nrIndeksu, int obecnosc)");
		System.out.printf("%s %s, %d. Obecność: %d%%. Ocena: %d\n", walinski.getImie(), walinski.getNazwisko(), walinski.getNrIndeksu(), walinski.getObecnosc(), walinski.getOcenaPOJ());
		System.out.println("Student(int nrIndeksu, int obecnosc)");
		System.out.printf("%s %s, %d. Obecność: %d%%. Ocena: %d\n", unknown.getImie(), unknown.getNazwisko(), unknown.getNrIndeksu(), unknown.getObecnosc(), unknown.getOcenaPOJ());
		System.out.println("Student()");
		System.out.printf("%s %s, %d. Obecność: %d%%. Ocena: %d\n", unknown2.getImie(), unknown2.getNazwisko(), unknown2.getNrIndeksu(), unknown2.getObecnosc(), unknown2.getOcenaPOJ());
		unknown2.setImie("Dawid");
		unknown2.setNazwisko("Kowalski");
		unknown2.setNrIndeksu(101);
		unknown2.setObecnosc(35);
		System.out.println("Ostatni student po mutatorach imienia, nazwiska, indeksu i obecności=35%");
		System.out.printf("%s %s, %d. Obecność: %d%%. Ocena: %d\n", unknown2.getImie(), unknown2.getNazwisko(), unknown2.getNrIndeksu(), unknown2.getObecnosc(), unknown2.getOcenaPOJ());
    }
}
