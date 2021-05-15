public class BarsAlarm implements Alarm {
    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        System.out.println("Kraty opadły");
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        System.out.println("Kraty uniosły się");
    }
}
