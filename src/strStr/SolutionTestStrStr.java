package strStr;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 9/23/15.
 */
public class SolutionTestStrStr {
    @Test
    public void testStrStr() {
        Solution solution = new Solution();
        String source = "ABCABDABC";
        String target = "BCA";
        int expectedResult = 1;
        assertEquals(expectedResult, solution.strStr(source, target));
    }

    @Test
    public void testNextOfTarget() {
        Solution solution = new Solution();
        char[] ptrn = "ABCABDABC".toCharArray();
        int[] expectedResult = new int[]{-1, 0, 0, 0, 1, 2, 0 ,1, 2, 3};
        int[] b = solution.preProcessPattern(ptrn);
        assertEquals(expectedResult.length, b.length);

        for (int i = 0; i < b.length; i++) {
            assertEquals(expectedResult[i], b[i]);
        }
    }
}