package math;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyMathTest {

    private MyMath myMath = new MyMath();

    @Test
    public void testFactorial_ValidInput() {
        assertEquals(1, myMath.factorial(0)); 
        assertEquals(1, myMath.factorial(1));
        assertEquals(2, myMath.factorial(2));
        assertEquals(6, myMath.factorial(3));
        assertEquals(24, myMath.factorial(4));
        assertEquals(120, myMath.factorial(5));
        assertEquals(479001600, myMath.factorial(12));  
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorial_NegativeInput() {
        myMath.factorial(-1);  
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorial_InputAboveLimit() {
        myMath.factorial(13);  
    }

    @Test
    public void testIsPrime_ValidPrimeNumbers() {
        assertTrue(myMath.isPrime(2));  
        assertTrue(myMath.isPrime(3));
        assertTrue(myMath.isPrime(5));
        assertTrue(myMath.isPrime(7));
        assertTrue(myMath.isPrime(11));
        assertTrue(myMath.isPrime(13));
    }

    @Test
    public void testIsPrime_NonPrimeNumbers() {
        assertFalse(myMath.isPrime(4));  
        assertFalse(myMath.isPrime(6));
        assertFalse(myMath.isPrime(8));
        assertFalse(myMath.isPrime(9));  
        assertFalse(myMath.isPrime(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPrime_InputLessThanTwo() {
        myMath.isPrime(1);  
    }
}
