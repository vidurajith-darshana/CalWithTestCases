import example.test.calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit4 {

    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void testAdditionExpected10() {
        assertEquals(10,calculator.addition(8.0,2.0),DELTA);
    }
}
