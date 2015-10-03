package subarraySum;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/3/15.
 */
public class SolutionTestSubarraySum {
    @Test
    public void testSubarraySum() {
        Solution solution = new Solution();
        int[] nums = {-3, 1, 2, -3, 4};
        int[] expectedResult = {0, 2};

        ArrayList<Integer> alResult = solution.subarraySum(nums);
        assertEquals(2, alResult.size());
        for (int i = 0; i < alResult.size(); i++) {
            assertEquals(expectedResult[i], alResult.get(i).intValue());
        }

        nums = new int[]{6, -3, 1, 2, -3, 4};
        expectedResult = new int[]{1, 3};

        alResult.clear();
        alResult = solution.subarraySum(nums);
        assertEquals(2, alResult.size());
        for (int i = 0; i < alResult.size(); i++) {
            assertEquals(expectedResult[i], alResult.get(i).intValue());
        }
    }
}