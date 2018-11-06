package kolokwium1.appl;
import kolokwium1.excp.TooBigNumberException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void add() {
        StringCalculator k = new StringCalculator();
        k.Add("123abcd");
        Assert.assertEquals(k.result,"123abcd");
    }

    @Test
    public void multiply() {
        StringCalculator k = new StringCalculator();
        k.Add("123abcd");
        try {
            k.Multiply(2);
        }catch (TooBigNumberException e){
            
        }
        Assert.assertEquals(k.result,"123abcd123abcd");
    }
}