public class DogsAlarm implements Alarm {
    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        System.out.println("Spuszczono psy!");
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        System.out.println("Psy wyłapał hycel");
    }
}
