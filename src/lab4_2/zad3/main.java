package lab4_2.zad3;
import java.io.IOException;

public class main {
    public static void main(String args []){
        try {
            MovieSub.delay("C:\\Users\\Bartek\\IdeaProjects\\JavaS3\\src\\lab4_2\\zad3\\a.txt", "C:\\Users\\Bartek\\IdeaProjects\\JavaS3\\src\\lab4_2\\zad3//b.txt", 100, 30);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WrongFileFormatException k){
            k.printStackTrace();
        } catch (WrongFramesException l){

        }

    }
}
