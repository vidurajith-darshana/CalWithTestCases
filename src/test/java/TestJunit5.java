import example.test.calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit5 {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void testFactorialExpected24() {
        assertEquals(24,calculator.findFactorial(4),DELTA);
    }
}
