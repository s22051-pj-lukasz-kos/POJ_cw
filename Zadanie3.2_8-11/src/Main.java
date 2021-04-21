public class Main {

    public static void main(String[] args) {
        Kosiarka kosiarz = new Kosiarka(true, false, 1, "Still", "Sharp", 0.5, "BENZYNa");
        System.out.println(kosiarz.wyswietl());
        Pojazd.maxLiczbaPojazdow = 10;
        Pojazd pojazd1 = new Pojazd(10, 20, "VW", "Polo", 1.2, "benzyna");
        Pojazd pojazd2 = new Pojazd(30, 400, "Merc", "S", 5, "lpg");
        Samochod.maxLiczbaPojazdow = 20;
        Samochod sam1 = new Samochod(12, 21, "sam1", "cos1", 1.2, "hybryda", "a",1235 );
        Pojazd pojazd3 = new Pojazd(-1, 5000, "Coś", "toś", 0.125, "diesel");
        Jednoslad.maxLiczbaPojazdow = 30;
        Jednoslad jed1 = new Jednoslad("marka jed1", "rower1", "rower");
        Jednoslad jed2 = new Jednoslad(0, 400, "marka jed2", "motór", 0.125, "benzyna", "motocykl");
        Samochod sam2 = new Samochod(123, 213, "sam2", "cos2", 1.3, "elektryczny", "b",6543 );
        Pojazd pojazd4 = new Pojazd(-1, 5000, "Coś", "toś", 0.125, "diesel");
        System.out.println(pojazd1.wyswietl());
        System.out.println(pojazd2.wyswietl());
        System.out.println(sam1.wyswietl());
        System.out.println(jed1.wyswietl());
        System.out.println(pojazd3.wyswietl());
        System.out.println(jed2.wyswietl());
        System.out.println(sam2.wyswietl());
        System.out.println(pojazd4.wyswietl());
    }
}
