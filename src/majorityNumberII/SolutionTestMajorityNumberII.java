package majorityNumberII;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/21/16.
 */
public class SolutionTestMajorityNumberII {

    public ArrayList<Integer> arrayToArrayList(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : nums) {
            result.add(i);
        }
        return result;
    }

    @Test
    public void testMajorityNumber() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 2, 1, 3, 3};
        int expectedResult = 1;
        int actualResult = solution.majorityNumber(arrayToArrayList(nums));
        assertEquals(expectedResult, actualResult);

        nums = new int[]{7,1,7,7,61,61,61,10,10,10,61};
        expectedResult = 61;
        actualResult = solution.majorityNumber(arrayToArrayList(nums));
        assertEquals(expectedResult, actualResult);

        nums = new int[]{2,3,4,2,3,4,1,4,1,1,4};
        expectedResult = 4;
        actualResult = solution.majorityNumber(arrayToArrayList(nums));
        assertEquals(expectedResult, actualResult);
    }
}