package uniquePaths;

import compareStrings.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/15/15.
 */
public class SolutionTestUniquePaths {
    @Test
    public void testUniquePaths() {
        Solution solution = new Solution();
        int expectedResult = 0;

        expectedResult = 1;
        assertEquals(expectedResult, solution.uniquePaths(1,3));

        expectedResult = 1;
        assertEquals(expectedResult, solution.uniquePaths(3,1));

        expectedResult = 2;
        assertEquals(expectedResult, solution.uniquePaths(2,2));

        expectedResult = 1799579064;
        assertEquals(expectedResult, solution.uniquePaths(8,68));
    }
}