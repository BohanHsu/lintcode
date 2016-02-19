package nextPermutation;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/19/16.
 */
public class SolutionTestNextPermutation {
    Solution solution = null;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testQuicksort() {
        int[] nums = new int[]{2,3,5,2,1,3,4};
        int[] expectedResult = Arrays.copyOfRange(nums, 0, nums.length);

        Arrays.sort(expectedResult, 1, 4);
        solution.quicksort(nums, 1, 3);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(nums));

        Arrays.sort(expectedResult);
        solution.quicksort(nums, 0, nums.length - 1);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(nums));
    }

    @Test
    public void testNextPermutation() {
        int[] nums = new int[]{1,3,2,3};
        int[] expectedResult = new int[]{1,3,3,2};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(solution.nextPermutation(nums)));

        nums = new int[]{4,3,2,1};
        expectedResult = new int[]{1,2,3,4};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(solution.nextPermutation(nums)));

        nums = new int[]{1,2,1};
        expectedResult = new int[]{2,1,1};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(solution.nextPermutation(nums)));
    }

}