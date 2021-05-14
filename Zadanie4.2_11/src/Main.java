import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Safe safe1 = new Safe("1234");
        SoundAlarm soundAlarm = new SoundAlarm();
        BarsAlarm barsAlarm = new BarsAlarm();
        PoliceAlarm policeAlarm = new PoliceAlarm();
        DogsAlarm dogsAlarm = new DogsAlarm();

        safe1.addAlarm(soundAlarm);
        safe1.addAlarm(barsAlarm);
        safe1.addAlarm(policeAlarm);
        safe1.addAlarm(dogsAlarm);

        safe1.enterPin("1111");
        safe1.enterPin("1234");

        safe1.printWriter.close();
    }
}
