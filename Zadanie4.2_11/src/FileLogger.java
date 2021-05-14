import javax.print.attribute.standard.Severity;

public class FileLogger implements Logger {
    @Override
    public void LogMessage(Severity severity, EventSource eventSource, String message){
        eventSource.getSafe().printWriter.print(eventSource.eventDate + "\n");
        eventSource.getSafe().printWriter.print(severity.toString() + ": " + message + "\n\n");
    }
}
