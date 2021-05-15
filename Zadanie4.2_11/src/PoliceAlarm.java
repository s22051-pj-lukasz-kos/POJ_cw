import javax.print.attribute.standard.Severity;
import java.io.IOException;

public class PoliceAlarm implements Alarm {
    @Override
    public void alarmTurnOn(PinEvent pinEvent) throws IOException {
        String message = "Nadciąga ochrona";
        this.consoleLogger.LogMessage(Severity.WARNING, (EventSource) pinEvent, message);
        this.fileLogger.LogMessage(Severity.WARNING, (EventSource) pinEvent, message);
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) throws IOException {
        String message = "Ochrona się wycofuje";
        this.consoleLogger.LogMessage(Severity.REPORT, (EventSource) pinEvent, message);
        this.fileLogger.LogMessage(Severity.REPORT, (EventSource) pinEvent, message);
    }
}
