package woodCut;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/12/15.
 */
public class SolutionTestWoodCut {

    @Test
    public void testWoodCut() {
        Solution solution = new Solution();

        int[] l = null;
        int k = 0;
        int expectedResult = 0;

        l = new int[]{232, 124, 456};
        k = 7;
        expectedResult = 114;

        assertEquals(expectedResult, solution.woodCut(l, k));

        l = new int[]{2147483644,2147483645,2147483646,2147483647};
        k = 4;
        expectedResult = 2147483644;
        assertEquals(expectedResult, solution.woodCut(l, k));
    }
}