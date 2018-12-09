package lab4.MovieSub;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MovieSub {

    public static void delay(String wej, String wyj, int ms, int fps) throws IOException, WrongFileFormatException, WrongFramesException {
        try {
            File input = new File(wej);
        }catch(Exception e){};
        FileReader fileReader = new FileReader(wej);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        PrintWriter fileWriter = new PrintWriter(wyj);

        Pattern compiledPattern = Pattern.compile("\\{(\\d+)\\}\\{(\\d+)\\}(.+)");
        String textLine = bufferedReader.readLine();
        int linecounter = 1;
        do {
            Matcher matcher = compiledPattern.matcher(textLine);
            if(matcher.matches()){
                int start = Integer.parseInt(matcher.group(1));
                int end = Integer.parseInt(matcher.group(2));
                start += ms/fps*1000;
                end += ms/fps*1000;

                if(end < start){
                    throw new WrongFramesException("Zle numery klatek");
                }

                fileWriter.print("{" + String.valueOf(start) +"}{" + String.valueOf(end) +"}" + matcher.group(3) +"\n");
            }
            else{
                throw new WrongFileFormatException("Cos nie tak z plikiem w linii " + String.valueOf(linecounter) + ":\n" + textLine);
            }

            textLine = bufferedReader.readLine();
            linecounter++;
        } while(textLine != null);

    }
}