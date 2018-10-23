package lab4.zad5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] argv) throws IOException {
        Polibiusz pol = new Polibiusz();
        ROT11 rot = new ROT11();
        Cryptographer crypt = new Cryptographer();
        System.out.print("Wybierz:\n");
        System.out.print("1.Crypt Polibiuszem\n2.Crypt Rot11\n3.Decrypt Polibiuszem\n4.Decrypt Rot11\n");
        Scanner odczyt_wyboru = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        int i = odczyt_wyboru.nextInt();
        System.out.print("Ścieżka do pliku wejściowego\n");
        Scanner p_we = new Scanner(System.in);
        String we = p_we.nextLine();
        File wejscie = new File(we);
        System.out.print("Ścieżka do pliku wyjściowego\n");
        Scanner p_wy = new Scanner(System.in);
        String wy = p_wy.nextLine();
        File wyjscie = new File(wy);

        int switcher;
        switch (i) {
            case 1:
                Cryptographer.cryptfile(wejscie, wyjscie, pol);
                break;
            case 2:
                Cryptographer.cryptfile(wejscie, wyjscie, rot);
                break;
            case 3:
                Cryptographer.decryptfile(wejscie, wyjscie, pol);
                break;
            case 4:
                Cryptographer.decryptfile(wejscie, wyjscie, rot);
                break;
            default:
                System.out.print("Zły kod operacji");
        }
    }
}