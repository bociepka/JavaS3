package lab4.Photo;

public class NotAPhotoException extends Exception {
    private static String message = "Plik nie jest zdjeciem";

    @Override
    public String getMessage() {
        return message;
    }
}
