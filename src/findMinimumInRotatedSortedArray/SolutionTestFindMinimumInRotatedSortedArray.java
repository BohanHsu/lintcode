package findMinimumInRotatedSortedArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/12/15.
 */
public class SolutionTestFindMinimumInRotatedSortedArray {
    @Test
    public void testFindMin() {
        Solution solution = new Solution();
        int[] num = null;

        num = new int[]{4, 5, 6, 7, 0, 1, 2};
        assertEquals(min(num), solution.findMin(num));

    }

    public int min(int[] num) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        return min;
    }
}