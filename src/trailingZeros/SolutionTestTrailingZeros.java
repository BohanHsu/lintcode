package trailingZeros;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 1/28/16.
 */
public class SolutionTestTrailingZeros {
    @Test
    public void testTrailingZeros() {
        Solution solution = new Solution();
        long num = 11;
        long expectedResult = 2;

        long result = solution.trailingZeros(num);
        assertEquals(expectedResult, result);
    }

}