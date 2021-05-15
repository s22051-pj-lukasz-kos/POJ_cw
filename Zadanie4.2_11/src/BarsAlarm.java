import javax.print.attribute.standard.Severity;
import java.io.IOException;

public class BarsAlarm implements Alarm {
    @Override
    public void alarmTurnOn(PinEvent pinEvent) throws IOException {
        String message = "Kraty opadły";
        this.consoleLogger.LogMessage(Severity.WARNING, (EventSource) pinEvent, message);
        this.fileLogger.LogMessage(Severity.WARNING, (EventSource) pinEvent, message);
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) throws IOException {
        String message = "Kraty uniosły się";
        this.consoleLogger.LogMessage(Severity.REPORT, (EventSource) pinEvent, message);
        this.fileLogger.LogMessage(Severity.REPORT, (EventSource) pinEvent, message);
    }
}
