package subarraySumClosest;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/7/15.
 */
public class SolutionTestSubarraySumClosest {
    @Test
    public void testSubarraySumClosest() {
        Solution solution = new Solution();
        int[] nums = null;
        int[] expectedResult = null;
        ArrayList<Integer> result = null;

        nums = new int[]{-3,1,1,-3,5};
        result = solution.subarraySumClosest(nums);

        System.out.println(result.get(0));
        System.out.println(result.get(1));

        assertEquals(1, result.get(0).intValue());
        assertEquals(3, result.get(1).intValue());
    }
}