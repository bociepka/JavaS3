package kolokwium1.excp;

public class NothingToSubstractFromException extends Exception {

    private static String message = "Kalkulator jest pusty, nie można z niego nic usunąć";

    @Override
    public String getMessage() {
        return message;
    }
}
