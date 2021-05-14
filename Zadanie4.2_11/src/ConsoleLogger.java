import javax.print.attribute.standard.Severity;

public class ConsoleLogger implements Logger {
    @Override
    public void LogMessage(Severity severity, EventSource eventSource, String message) {
        System.out.println(eventSource.eventDate);
        System.out.println(severity.toString() + ": " + message + "\n");
    }
}
