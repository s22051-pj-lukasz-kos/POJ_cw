public class Pojazd extends Maszyna {
    protected double moc;
    protected double momentObrotowy;
    protected final Enum<Maszyna.rodzajSilnika> silnik;
    protected int nrPojazdu;
    protected static int maxLiczbaPojazdow;
    private static int counter = 0;


    public Pojazd(double moc, double momentObrotowy, String marka, String nazwa, double pojemnoscSilnika, String rodzajSilnika) {
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        super.marka = marka;
        super.nazwa = nazwa;
        super.pojemnoscSilnika = pojemnoscSilnika;
        this.silnik = Enum.valueOf(Maszyna.rodzajSilnika.class, rodzajSilnika.toUpperCase());

        if (this.getClass() == Pojazd.class) {
            counter++;
            nrPojazdu = counter;
        }
    }

    public String wyswietl() {
        return "Marka: " + this.marka +
                ". Nazwa: " + this.nazwa +
                ". Pojemość silnika: " + this.pojemnoscSilnika +
                ". Rodzaj silnika: " + this.silnik +
                ". Moc: " + this.moc +
                ". Moment obrotowy: " + this.momentObrotowy +
                ". Pojazd " + this.nrPojazdu +
                " z " + (this.getClass() == Pojazd.class ? maxLiczbaPojazdow : "");
    }
}
