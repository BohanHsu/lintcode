package uniqueBinarySearchTrees;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/6/16.
 */
public class SolutionTestUniqueBinarySearchTrees {
    @Test
    public void testNumTrees() {
        Solution solution = new Solution();
        int n = 3;
        int expectedResult = 5;
        assertEquals(expectedResult, solution.numTrees(n));
    }

    @Test
    public void testNumTrees1() {
        Solution solution = new Solution();
        int n = 0;
        int expectedResult = 1;
        assertEquals(expectedResult, solution.numTrees(n));
        n = 1;
        assertEquals(expectedResult, solution.numTrees(n));
    }

    @Test
    public void testNumTrees2() {
        Solution solution = new Solution();
        int n = 4;
        int expectedResult = 14;
        assertEquals(expectedResult, solution.numTrees(n));
    }
}