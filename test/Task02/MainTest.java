package Task02;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MainTest {
    /**
     * Main functionality test
     */
    @Test
    public void testCalc() {
        Calc calc = new Calc();
        calc.init("1");
        assertEquals(1.43, calc.getArea().getResult(), .1e-10);
        calc.init("101");
        assertEquals(35.83, calc.getArea().getResult(), .1e-10);
        calc.init("1011");
        assertEquals(173.39, calc.getArea().getResult(), .1e-10);
        calc.init("1111");
        assertEquals(322.43, calc.getArea().getResult(), .1e-10);
    }

    /**
     * Serialization test
     */
    @Test
    public void testRestore() {
        Calc calc = new Calc();
        String binaryString;
        double result;
        for (int ctr = 0; ctr < 1000; ctr++) {
            binaryString = Integer.toBinaryString((int) (Math.random() * 10));
            result = calc.init(binaryString);
            try {
                calc.save();
            } catch (IOException e) {
                Assert.fail(e.getMessage());
            }
            calc.init(Integer.toBinaryString((int) (Math.random() * 10)));
            try {
                calc.restore();
            } catch (Exception e) {
                Assert.fail(e.getMessage());
            }
            assertEquals(result, calc.getArea().getResult(), .1e-10);
        }
    }
}
