package lab4.Photo;

public class WrongDirectoryException extends Exception {
    private static String message = "Wybrany folder nie istnieje";

    @Override
    public String getMessage() {
        return message;
    }
}
