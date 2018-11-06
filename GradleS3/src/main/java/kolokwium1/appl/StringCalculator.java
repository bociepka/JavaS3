package kolokwium1.appl;
import kolokwium1.excp.BadInputException;
import kolokwium1.excp.NothingToSubstractFromException;
import kolokwium1.excp.TooBigNumberException;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class StringCalculator extends Calculator {
    public String result;

    StringCalculator(){
        this.result="";
    }

    @Override
    void SaveToFile(String filename) {
        try {
            String str = result;
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(str);
        writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    void Add(String x) {
        result = result + x;
    }

    @Override
    void Subtract(String x) throws NothingToSubstractFromException, BadInputException {
        if (this.result=="") throw new NothingToSubstractFromException();
        if (result.contains(x)== false) throw new BadInputException();
        String text = this.result;
        result = text.replaceAll(x,"");
    }

    @Override
    void Multiply(int x) throws TooBigNumberException {
        TooBigNumberException e = new TooBigNumberException();
        if (x>5) throw e;
        String text = this.result;
        for (int i=1;i<x;i++){
            result=result+text;
        }
    }

    public static void main(String[] argv) {
    StringCalculator kalkulator = new StringCalculator();
    System.out.print(kalkulator.result+"\n");
        kalkulator.Add("123abc");
        System.out.print(kalkulator.result+"\n");
        try {
            kalkulator.Multiply(5);
        }catch(TooBigNumberException e){
            System.out.println(e.getMessage());
        }
        System.out.print(kalkulator.result+"\n");
        try {
            kalkulator.Subtract("12");
        }catch(BadInputException e){
            System.out.println(e.getMessage());
        }catch(NothingToSubstractFromException e){
            System.out.println(e.getMessage());
        }
        System.out.print(kalkulator.result+"\n");
        kalkulator.SaveToFile("plik_wynikowy.txt");
    }
}
