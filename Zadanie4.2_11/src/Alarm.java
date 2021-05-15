import java.io.IOException;

public interface Alarm {
    Logger consoleLogger = new ConsoleLogger();
    Logger fileLogger = new FileLogger();

    void alarmTurnOn(PinEvent pinEvent) throws IOException;
    void alarmTurnOff(PinEvent pinEvent) throws IOException;
}
