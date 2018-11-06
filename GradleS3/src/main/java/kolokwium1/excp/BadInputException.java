package kolokwium1.excp;

public class BadInputException extends Exception {
    private static String message = "Podany tekst nie znajduje się w kalkulatorze, nie można go odjąć";

    @Override
    public String getMessage() {
        return message;
    }
}
