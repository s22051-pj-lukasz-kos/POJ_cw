import javax.print.attribute.standard.Severity;
import java.io.IOException;

public class PoliceAlarm implements Alarm {
    Logger consoleLogger = new ConsoleLogger();
    Logger fileLogger = new FileLogger();
    @Override
    public void alarmTurnOn(PinEvent pinEvent) throws IOException {
        String message = "Nadciąga ochrona";
        consoleLogger.LogMessage(Severity.WARNING, (EventSource) pinEvent, message);
        fileLogger.LogMessage(Severity.WARNING, (EventSource) pinEvent, message);
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) throws IOException {
        String message = "Ochrona się wycofuje";
        consoleLogger.LogMessage(Severity.REPORT, (EventSource) pinEvent, message);
        fileLogger.LogMessage(Severity.REPORT, (EventSource) pinEvent, message);
    }
}
