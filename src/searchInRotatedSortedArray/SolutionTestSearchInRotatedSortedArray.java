package searchInRotatedSortedArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/12/15.
 */
public class SolutionTestSearchInRotatedSortedArray {
    @Test
    public void testSearch() {
        Solution solution = new Solution();
        int[] nums = null;
        int target = 0;

        nums = new int[]{4, 5, 1, 2, 3};
        target = 1;
        assertEquals(expectedResult(nums, target), solution.search(nums, target));

        nums = new int[]{4, 5, 1, 2, 3};
        target = 0;
        assertEquals(expectedResult(nums, target), solution.search(nums, target));
    }

    public int expectedResult(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }

}