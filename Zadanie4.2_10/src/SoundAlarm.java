public class SoundAlarm implements Alarm {
    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        System.out.println("Łeeuuu Łeeuuu!!!");
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        System.out.println(" ... ");
    }
}
