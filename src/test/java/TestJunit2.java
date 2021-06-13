import example.test.calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit2 {

    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void testSubstractExpected5() {
        assertEquals(5,calculator.substract(8.0,3.0),DELTA);
    }
}
