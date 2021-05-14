import javax.print.attribute.standard.Severity;
import java.io.IOException;

public class SoundAlarm implements Alarm {
    Logger consoleLogger = new ConsoleLogger();
    Logger fileLogger = new FileLogger();
    @Override
    public void alarmTurnOn(PinEvent pinEvent) throws IOException {
        String message = "Włączył się alarm!";
        consoleLogger.LogMessage(Severity.WARNING, (EventSource) pinEvent, message);
        fileLogger.LogMessage(Severity.WARNING, (EventSource) pinEvent, message);
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) throws IOException {
        String message = "Wyłączono alarm";
        consoleLogger.LogMessage(Severity.REPORT, (EventSource) pinEvent, message);
        fileLogger.LogMessage(Severity.REPORT, (EventSource) pinEvent, message);
    }
}
