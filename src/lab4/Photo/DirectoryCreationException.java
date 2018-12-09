package lab4.Photo;

public class DirectoryCreationException extends Exception {
    private static String message = "Nie udało sie utworzyć folderu";

    @Override
    public String getMessage() {
        return message;
    }
}
