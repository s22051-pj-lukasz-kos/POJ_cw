import javax.print.attribute.standard.Severity;
import java.io.IOException;

public interface Logger {
    void LogMessage(Severity severity, EventSource eventSource, String message) throws IOException;
}
