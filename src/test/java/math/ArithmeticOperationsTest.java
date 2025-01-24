package math;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArithmeticOperationsTest {

    private ArithmeticOperations operations = new ArithmeticOperations();

    @Test
    public void testDivide() {
        assertEquals(2.0, operations.divide(10, 5), 0.00001);
        assertEquals(0.5, operations.divide(1, 2), 0.00001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        operations.divide(10, 0);
    }

    @Test
    public void testMultiply() {
        assertEquals(20, operations.multiply(4, 5));
        assertEquals(0, operations.multiply(5, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyNegativeNumber() {
        operations.multiply(-1, 5);
        operations.multiply(3, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyOverflow() {
        operations.multiply(Integer.MAX_VALUE, 2);
    }
}
