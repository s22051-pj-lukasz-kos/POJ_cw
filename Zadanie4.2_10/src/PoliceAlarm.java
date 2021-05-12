public class PoliceAlarm implements Alarm {
    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        System.out.println("Nadciąga ochrona");
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        System.out.println("Ochrona się wycofuje");
    }
}
