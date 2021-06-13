import example.test.calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit3 {

    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void testDevideExpected25() {
        assertEquals(25,calculator.devide(75,3),DELTA);
    }
}
