package majorityNumberIII;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/21/16.
 */
public class SolutionTestMajorityNumberIII {
    public ArrayList<Integer> arrayToArrayList(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i : nums) {
            result.add(i);
        }
        return result;
    }

    @Test
    public void testMajorityNumber() {
        Solution solution = new Solution();
        int[] nums = new int[]{3,1,2,3,2,3,3,4,4,4};
        int k = 3;
        int expectedResult = 3;
        assertEquals(expectedResult, solution.majorityNumber(arrayToArrayList(nums), k));
    }

}