package com.company;

public class Student {
    private String imie = "Unknown";
    private String nazwisko = "Unknown";
    private int nrIndeksu;
    private int obecnosc;
    private int ocenaPOJ;

    Student() { }

    Student(String imie, String nazwisko, int nrIndeksu, int obecnosc, int ocenaPOJ) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
        this.ocenaPOJ = ocenaPOJ;
        setObecnosc(obecnosc);
    }

    Student(int nrIndeksu, int obecnosc, int ocenaPOJ) {
        this.nrIndeksu = nrIndeksu;
        this.ocenaPOJ = ocenaPOJ;
        setObecnosc(obecnosc);
    }

    Student(String nazwisko, int nrIndeksu, int obecnosc) {
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
        setObecnosc(obecnosc);
    }

    Student(int nrIndeksu, int obecnosc) {
        this.nrIndeksu = nrIndeksu;
        setObecnosc(obecnosc);
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public void setObecnosc(int obecnosc) {
        this.obecnosc = obecnosc;
        if (obecnosc < 50) {
            setOcenaPOJ(2);
        }
    }

    public void setOcenaPOJ(int ocenaPOJ) {
        this.ocenaPOJ = ocenaPOJ;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public int getObecnosc() {
        return obecnosc;
    }

    public int getOcenaPOJ() {
        return ocenaPOJ;
    }
}
