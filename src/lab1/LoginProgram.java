package lab1;

import java.io.*;
/**
 *
 * @author Bartosz
 */
public class LoginProgram {
    public static void main(String[] argv){
        Login log = new Login ("ala", "makota");
        try{
            InputStreamReader rd = new InputStreamReader(System.in);
            BufferedReader bfr = new BufferedReader(rd);

            // TODO: prosba o wpisanie hasła i loginu
            System.out.println("Podaj login:");
            String login = bfr.readLine();
            System.out.println("Podaj hasło:");
            String haslo = bfr.readLine();

        /*TODO: sprawdzenie czy podane hasło i login zgadzaja sie z tymi
         przechowywanymi w obiekcie log Jeśli tak, to ma zostać
         wyswietlone "OK", jesli nie - prosze wyswietlić informacje o błedzie
         */
        if (log.check(login, haslo)==true){
            System.out.println("OK");
        }
        else{
            System.out.println("Podano bledne dane logowania");
        }

        }catch(IOException e){e.printStackTrace();}

    }
}
