package lab4.zad5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cryptographer {
    public static void cryptfile(File in, File out, Algorithm algo){
        Scanner sc = null;

        try {
            sc = new Scanner(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()) {
            Scanner sc2 = new Scanner(sc.nextLine());
            while (sc2.hasNext()) {
                String s = sc2.next();
                System.out.print(algo.crypt(s));
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.close();
    }
    public static void decryptfile(File in, File out, Algorithm algo){
        Scanner sc = null;

        try {
            sc = new Scanner(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()) {
            Scanner sc2 = new Scanner(sc.nextLine());
            while (sc2.hasNext()) {
                String s = sc2.next();
                System.out.print(algo.decrypt(s));
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.close();
    }
}
