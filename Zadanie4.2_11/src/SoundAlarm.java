import javax.print.attribute.standard.Severity;
import java.io.IOException;

public class SoundAlarm implements Alarm {
    @Override
    public void alarmTurnOn(PinEvent pinEvent) throws IOException {
        String message = "Włączył się alarm!";
        this.consoleLogger.LogMessage(Severity.WARNING, (EventSource) pinEvent, message);
        this.fileLogger.LogMessage(Severity.WARNING, (EventSource) pinEvent, message);
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) throws IOException {
        String message = "Wyłączono alarm";
        this.consoleLogger.LogMessage(Severity.REPORT, (EventSource) pinEvent, message);
        this.fileLogger.LogMessage(Severity.REPORT, (EventSource) pinEvent, message);
    }
}
