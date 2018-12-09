package lab4.MovieSub;
import java.io.IOException;

public class main {
    public static void main(String args []){
        try {
            MovieSub.delay("C:\\Users\\Bartek\\IdeaProjects\\JavaS3\\src\\lab4\\MovieSub\\a.txt", "C:\\Users\\Bartek\\IdeaProjects\\JavaS3\\src\\lab4\\MovieSub//b.txt", 100, 30);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WrongFileFormatException k){
            k.printStackTrace();
        } catch (WrongFramesException l){
            l.printStackTrace();
        }

    }
}
