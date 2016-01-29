package updateBits;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 1/28/16.
 */
public class SolutionTestUpdateBits {
    @Test
    public void testUpdateBits() {
        Solution s = new Solution();
        int n = 0b10000000000, m = 0b10101, i=2, j=6;
        int expectedResult = 0b10001010100;
        int result = s.updateBits(n, m, i, j);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testUpdateBits1() {
        Solution s = new Solution();
        int n = 1, m = -1, i=0, j=31;
        int expectedResult = -1;
        int result = s.updateBits(n, m, i, j);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testUpdateBits2() {
        Solution s = new Solution();
        int n = -521, m = 0, i=31, j=31;
        int expectedResult = 2147483127;
        int result = s.updateBits(n, m, i, j);
        assertEquals(expectedResult, result);
    }
}