package compareStrings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 9/22/15.
 */
public class SolutionTest {
    @Test
    public void testCompareStrings() {
        Solution solution = new Solution();
        String a = "ABCDEF";
        String b = "ABCDEF";
        boolean expectedResult = true;
        assertEquals(expectedResult, solution.compareStrings(a, b));

        a = "ABCDEF";
        b = "BCDE";
        expectedResult = true;
        assertEquals(expectedResult, solution.compareStrings(a, b));

        a = "ABCDEF";
        b = "";
        expectedResult = true;
        assertEquals(expectedResult, solution.compareStrings(a, b));

        a = "ABCDEF";
        b = "BCDET";
        expectedResult = false;
        assertEquals(expectedResult, solution.compareStrings(a, b));
    }

    @Test
    public void testFailedOnline() {
        Solution solution = new Solution();
        String a = "ABCDEF";
        String b = "ABCDEF";
        boolean expectedResult = true;
        assertEquals(expectedResult, solution.compareStrings(a, b));

        a = "A";
        b = "";
        expectedResult = true;
        assertEquals(expectedResult, solution.compareStrings(a, b));

    }
}