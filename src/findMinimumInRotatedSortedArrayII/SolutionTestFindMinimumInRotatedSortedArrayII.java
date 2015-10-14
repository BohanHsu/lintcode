package findMinimumInRotatedSortedArrayII;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTestFindMinimumInRotatedSortedArrayII {
    @Test
    public void testFindMin() {
        Solution solution = new Solution();
        int[] num = null;
        num = new int[]{5,6,7,8,9,0,1,2,3};
        assertEquals(ArrayMin(num), solution.findMin(num));

        num = new int[]{4,4,4,4,4,1,1,4,4};
        assertEquals(ArrayMin(num), solution.findMin(num));

        num = new int[]{4};
        assertEquals(ArrayMin(num), solution.findMin(num));

        num = new int[]{5,5};
        assertEquals(ArrayMin(num), solution.findMin(num));
    }

    public int ArrayMin(int[] num) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (min > num[i])
                min = num[i];
        }
        return min;
    }
}