package lab5.mammoth;

import lab5.mammoth.InadequateFoodException;
import lab5.mammoth.Mammoth;
import lab5.mammoth.Meat;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MammothTest {

    @Test(expected = InadequateFoodException.class)
    public void eatThrowingExceptionTest() {
        Mammoth m = new Mammoth();
        m.eat(new Meat());
    }

    @Test
    public void eatExceptionMessageTest(){
        try {
            Mammoth m = new Mammoth();
            m.eat(new Meat());
            fail("Expected an InadequateFoodException to be thrown");
        } catch (InadequateFoodException e) {
            assertThat(e.getMessage(), is("I don't like meat"));
        }
    }
}