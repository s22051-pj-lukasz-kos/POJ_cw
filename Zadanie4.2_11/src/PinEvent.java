import java.util.Date;

public class PinEvent {
    private final Safe safe;
    public final Date eventDate = new Date();

    public PinEvent(Safe safe) {
        this.safe = safe;
    }

    public Safe getSafe() {
        return safe;
    }
}
