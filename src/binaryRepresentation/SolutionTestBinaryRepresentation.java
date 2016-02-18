package binaryRepresentation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/17/16.
 */
public class SolutionTestBinaryRepresentation {
    Solution solution = null;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testIntegralDecimalToBinary() {
        long n = 100;
        String expectedResult = "1100100";
        assertEquals(expectedResult, solution.integralDecimalToBinary(n));
        n = 123456;
        expectedResult = "11110001001000000";
        assertEquals(expectedResult, solution.integralDecimalToBinary(n));
    }

    @Test
    public void testFractionDecimalToBinary() {
        String n = "125";
        String expectedResult = "001";
        assertEquals(expectedResult, solution.fractionDecimalToBinary(n, 100));
        assertEquals(expectedResult, solution.fractionDecimalToBinary(n, 3));
        expectedResult = null;
        assertEquals(expectedResult, solution.fractionDecimalToBinary(n, 2));
    }

    @Test
    public void testBinaryRepresentation() {
        String n = "3.5";
        String expectedResult = "11.1";
        assertEquals(expectedResult, solution.binaryRepresentation(n));
        n = "3.72";
        expectedResult = "ERROR";
        assertEquals(expectedResult, solution.binaryRepresentation(n));
    }

    @Test
    public void testBinaryRepresentation1() {
        String n = "1.0";
        String expectedResult = "1";
        assertEquals(expectedResult, solution.binaryRepresentation(n));
        n = "0.5";
        expectedResult = "0.1";
        assertEquals(expectedResult, solution.binaryRepresentation(n));
        n = "17817287.6418609619140625";
        expectedResult = "1000011111101111011000111.1010010001010001";
        assertEquals(expectedResult, solution.binaryRepresentation(n));
    }
}