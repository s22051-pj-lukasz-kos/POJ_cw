public class Samochod extends Pojazd {
    enum segment {A, B, C, D, E, F, S, H, J, M}
    private final segment seg;
    private final long VIN;
    protected static int maxLiczbaPojazdow;
    private static int counter = 0;

    public Samochod(double moc, double momentObrotowy, String marka, String nazwa, double pojemnoscSilnika, String rodzajSilnika, String segment, long VIN) {
        super(moc, momentObrotowy, marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.seg = Enum.valueOf(Samochod.segment.class, segment.toUpperCase());
        this.VIN = VIN;

        if (this.getClass() == Samochod.class) {
            counter++;
            nrPojazdu = counter;
        }
    }

    @Override
    public String wyswietl() {
        return "Samochód. VIN: " + VIN +
                ". Segment: " + seg + ". " +
                super.wyswietl() +
                (this.getClass() == Samochod.class ? maxLiczbaPojazdow : "");
    }
}
