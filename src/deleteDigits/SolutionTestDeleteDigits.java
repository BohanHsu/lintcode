package deleteDigits;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/18/16.
 */
public class SolutionTestDeleteDigits {
    @Test
    public void testDeleteDigits() {
        Solution solution = new Solution();
        String a = "178542";
        int k = 4;
        String expectedResult = "12";
        assertEquals(expectedResult, solution.DeleteDigits(a, k));

        a = "123456789";
        k = 1;
        expectedResult = "12345678";
        assertEquals(expectedResult, solution.DeleteDigits(a, k));

        a = "90249";
        k = 2;
        expectedResult = "24";
        assertEquals(expectedResult, solution.DeleteDigits(a, k));

        a = "191817161514";
        k = 9;
        expectedResult = "111";
        assertEquals(expectedResult, solution.DeleteDigits(a, k));
    }

    @Test
    public void testDeleteDigits1() {
        Solution solution = new Solution();
        String a = "10009";
        int k = 1;
        String expectedResult = "9";
        assertEquals(expectedResult, solution.DeleteDigits(a, k));

        a = "9876141516171818818181890001988181700198181778786761256512651653145345143";
        k = 55;
        expectedResult = "1111111345143";
        assertEquals(expectedResult, solution.DeleteDigits(a, k));
    }
}