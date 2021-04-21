public class Jednoslad extends Pojazd {
    enum Typ {HULAJNOGA, ROWER, MOTOCYKL}
    private final Typ tp;
    protected static int maxLiczbaPojazdow;
    private static int counter = 0;

    public Jednoslad(double moc, double momentObrotowy, String marka, String nazwa, double pojemnoscSilnika, String rodzajSilnika, String typ) {
        super(moc, momentObrotowy, marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.tp = Enum.valueOf(Jednoslad.Typ.class, typ.toUpperCase());

        if (this.getClass() == Jednoslad.class) {
            counter++;
            nrPojazdu = counter;
        }
    }

    public Jednoslad(String marka, String nazwa, String typ) {
        super(0, 0, marka, nazwa, 0, "brak");
        this.tp = Enum.valueOf(Jednoslad.Typ.class, typ.toUpperCase());

        if (this.getClass() == Jednoslad.class) {
            counter++;
            nrPojazdu = counter;
        }
    }

    @Override
    public String wyswietl() {
        return tp + " " + this.nrPojazdu +
                " z " + (this.getClass() == Jednoslad.class ? maxLiczbaPojazdow : "") +
                ". Marka: " + this.marka +
                ". Nazwa: " + this.nazwa +
                (silnik != Enum.valueOf(Maszyna.rodzajSilnika.class, "BRAK") ? ". Rodzaj silnika: " + this.silnik : "") +
                (pojemnoscSilnika != 0 ? ". Pojemość silnika: " + this.pojemnoscSilnika : "") +
                (moc != 0 ? ". Moc: " + this.moc : "") +
                (momentObrotowy != 0 ? ". Moment obrotowy: " + this.momentObrotowy : "");
    }
}
