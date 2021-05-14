import java.io.IOException;

public interface Alarm {
    void alarmTurnOn(PinEvent pinEvent) throws IOException;
    void alarmTurnOff(PinEvent pinEvent) throws IOException;
}
