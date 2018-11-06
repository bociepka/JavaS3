package kolokwium1.excp;

public class TooBigNumberException extends Exception {
    private static String message = "Zbyt duży mnożnik. Podaj liczbę mniejszą od 5";

    @Override
    public String getMessage() {
        return message;
    }
}
