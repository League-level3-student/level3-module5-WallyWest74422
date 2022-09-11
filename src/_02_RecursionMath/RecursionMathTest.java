package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(54, RecursionMath.recursiveMultiplication(9, 6));
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
        assertEquals(5, RecursionMath.recursiveDivision(10, 2));
        assertEquals(4, RecursionMath.recursiveDivision(16, 4));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
        assertEquals(8, RecursionMath.recursivePower(2, 3));
        assertEquals(64, RecursionMath.recursivePower(4, 3));
        assertEquals(7, RecursionMath.recursivePower(7, 1));
    }
}
