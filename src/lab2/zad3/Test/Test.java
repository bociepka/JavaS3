package lab2.zad3.Test;
import lab2.zad3.Punkt3D.Punkt3D;

import java.util.LinkedList;
import java.io.*;

public class Test {
    static LinkedList<Punkt3D> punkty;

    public static void main(String[] argv){
        int choice = 0;
        boolean continuing = true;
        while(continuing){
            System.out.println("1. Wczytaj punkt 3D");
            System.out.println("2. Wyświetl wszystkie punkty");
            System.out.println("3. Oblicz odległość");
            System.out.println("4. Zakończ");
            System.out.println("?");
            try{
                InputStreamReader rd = new InputStreamReader(System.in);
                BufferedReader bfr = new BufferedReader(rd);
            choice = Integer.parseInt(bfr.readLine());
            }catch(IOException e){e.printStackTrace();}
            switch(choice){
//                default:
//                    continuing = false;
                case 1:
                    String nazwa;
                    double _x;
                    double _y;
                    double _z;
                    System.out.println("Podaj nazwę:");
                    try{
                        InputStreamReader rd = new InputStreamReader(System.in);
                        BufferedReader bfr = new BufferedReader(rd);
                        nazwa = bfr.readLine();
                    }catch(IOException e){e.printStackTrace();}
                    System.out.println("Podaj wspolrzedna x:");
                    try{
                        InputStreamReader rd = new InputStreamReader(System.in);
                        BufferedReader bfr = new BufferedReader(rd);
                        _x = Double.parseDouble(bfr.readLine());
                    }catch(IOException e){e.printStackTrace();}
                    System.out.println("Podaj wspolrzedna y:");
                    try{
                        InputStreamReader rd = new InputStreamReader(System.in);
                        BufferedReader bfr = new BufferedReader(rd);
                        _y = Double.parseDouble(bfr.readLine());
                    }catch(IOException e){e.printStackTrace();}
                    System.out.println("Podaj wspolrzedna z:");
                    try{
                        InputStreamReader rd = new InputStreamReader(System.in);
                        BufferedReader bfr = new BufferedReader(rd);
                        _z = Double.parseDouble(bfr.readLine());
                    }catch(IOException e){e.printStackTrace();}
                case 2:
                    punkty.forEach((element)->element.print());
                case 3:

                case 4:
                    continuing = false;
            }
        }
    }
}
