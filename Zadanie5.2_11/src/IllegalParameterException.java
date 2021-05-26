public class IllegalParameterException extends Exception {
    public IllegalParameterException() {
        super("Argument nie może być wartością ujemną");
    }
    public IllegalParameterException(String msg) {
        super(msg);
    }
}
