import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Safe {
    public ArrayList<Alarm> alarms = new ArrayList<>();
    private final String pin;
    private final FileWriter fileWriter = new FileWriter("log.txt");
    public PrintWriter printWriter = new PrintWriter(fileWriter);

    public Safe(String pin) throws IOException {
        this.pin = pin;
    }

    public void addAlarm(Alarm aAlarm) {
        alarms.add(aAlarm);
    }
    public void removeAlarm(Alarm aAlarm) {
        alarms.remove(aAlarm);
    }

    public void enterPin(String aPin) throws IOException {
        if (aPin.equalsIgnoreCase(pin)) {
            correctPin();
        } else {
            wrongPin();
        }
    }
    private void wrongPin() throws IOException {
        PinEvent pinEvent = new EventSource(this);
        System.out.println("Zły pin!\n");
        for (Alarm a : alarms) {
            a.alarmTurnOn(pinEvent);
        }
    }
    private void correctPin() throws IOException {
        PinEvent pinEvent = new EventSource(this);
        System.out.println("Otwarto sejf.\n");
        for (Alarm a : alarms) {
            a.alarmTurnOff(pinEvent);
        }
    }
}
