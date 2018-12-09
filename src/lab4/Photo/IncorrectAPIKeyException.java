package lab4.Photo;

public class IncorrectAPIKeyException extends Exception {
    private static String message = "Niepoprawny klucz API";

    @Override
    public String getMessage() {
        return message;
    }
}