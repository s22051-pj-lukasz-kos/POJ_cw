import java.util.ArrayList;

public class Safe {
    public ArrayList<Alarm> alarms = new ArrayList<>();
    private final String pin;

    public Safe(String pin) {
        this.pin = pin;
    }

    public void addAlarm(Alarm aAlarm) {
        alarms.add(aAlarm);
    }

    public void removeAlarm(Alarm aAlarm) {
        alarms.remove(aAlarm);
    }

    public void enterPin(String aPin) {
        if (aPin.equalsIgnoreCase(pin)) {
            correctPin();
        } else {
            wrongPin();
        }
    }

    private void wrongPin() {
        PinEvent pinEvent = new PinEvent(this);
        for (Alarm a : alarms) {
            a.alarmTurnOn(pinEvent);
        }
        System.out.println("Zły pin!");
    }

    private void correctPin() {
        PinEvent pinEvent = new PinEvent(this);
        for (Alarm a : alarms) {
            a.alarmTurnOff(pinEvent);
        }
        System.out.println("Otwarto sejf.");
    }
}
