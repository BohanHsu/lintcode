package findPeakElement;

import compareStrings.*;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class SolutionTestFindPeakElement {
    @Test
    public void testFindPeak() {
        Solution solution = new Solution();
        int[] nums = null;
        nums = new int[]{1, 2, 1, 3, 4, 5, 7, 6};
        assertTrue(findAllSolution(nums).contains((solution.findPeak(nums))));
    }

    public HashSet<Integer> findAllSolution(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1] && nums[i] > nums[i-1]) {
                set.add(i);
            }
        }
        return set;
    }

}