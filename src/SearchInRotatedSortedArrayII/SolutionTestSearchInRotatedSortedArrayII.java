package SearchInRotatedSortedArrayII;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTestSearchInRotatedSortedArrayII {
    @Test
    public void testSearch() {
        Solution solution = new Solution();
        int[] nums = null;
        int target = 0;

        nums = new int[]{6,7,8,9,0,1,2,3,4,5};
        target = 6;
        assertEquals(searchArray(nums, target), solution.search(nums, target));

        nums = new int[]{6,7,8,9,0,1,2,3,4,5};
        target = 5;
        assertEquals(searchArray(nums, target), solution.search(nums, target));

        nums = new int[]{6,7,8,9,0,1,2,3,4,5};
        target = 0;
        assertEquals(searchArray(nums, target), solution.search(nums, target));

        nums = new int[]{6,7,8,9,0,1,2,3,4,5};
        target = 10;
        assertEquals(searchArray(nums, target), solution.search(nums, target));

        nums = new int[]{6,7,8,9,0,1,2,3,4,5};
        target = -10;
        assertEquals(searchArray(nums, target), solution.search(nums, target));

        nums = new int[]{4,4,4,4,4,4,1,1,4,4,4,4};
        target = -10;
        assertEquals(searchArray(nums, target), solution.search(nums, target));

        nums = new int[]{4,4,4,4,4,4,1,1,4,4,4,4};
        target = 1;
        assertEquals(searchArray(nums, target), solution.search(nums, target));

        nums = new int[]{4,4,4,4,4,4,1,1,4,4,4,4};
        target = 4;
        assertEquals(searchArray(nums, target), solution.search(nums, target));
    }

    public boolean searchArray(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return true;
        }
        return false;
    }
}