package lab5.mammoth;

import lab5.mammoth.A;
import org.junit.Assert;
import org.junit.Test;

public class ATest {

    @Test
    public void metpierwszyTest() {
        int i = 1;
        Assert.assertEquals("met(1) should be 'pierwszy'","pierwszy", A.met(i));
    }
    @Test
    public void metdrugiTest() {
        int i = 2;
        Assert.assertEquals("met(1) should be 'drugi'","drugi",A.met(i));
    }
    @Test
    public void metdefaultTest() {
        int i = 3;
        Assert.assertEquals("default met() result should be 'inny'","inny",A.met(i));
    }
}