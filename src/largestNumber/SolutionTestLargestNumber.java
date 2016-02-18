package largestNumber;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/18/16.
 */
public class SolutionTestLargestNumber {
    Solution solution = null;
    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testNumsToIntArr() {
        int num = 12345;
        int[] expectedResult = new int[]{1,2,3,4,5};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(solution.numsToIntArr(num)));
    }

    @Test
    public void testLargestNumber() {
        int[] nums = new int[]{1, 20, 23, 4, 8};
        String expectedResult = "8423201";
        assertEquals(expectedResult, solution.largestNumber(nums));

        nums = new int[]{678,678678};
        expectedResult = "678678678";
        assertEquals(expectedResult, solution.largestNumber(nums));

        nums = new int[]{678,678679};
        expectedResult = "678679678";
        assertEquals(expectedResult, solution.largestNumber(nums));

        nums = new int[]{678,678677};
        expectedResult = "678678677";
        assertEquals(expectedResult, solution.largestNumber(nums));

        nums = new int[]{678,67867};
        expectedResult = "67867867";
        assertEquals(expectedResult, solution.largestNumber(nums));


        nums = new int[]{654,65465};
        expectedResult = "65465654";
        assertEquals(expectedResult, solution.largestNumber(nums));

        nums = new int[]{0};
        expectedResult = "0";
        assertEquals(expectedResult, solution.largestNumber(nums));

        nums = new int[]{0,0};
        expectedResult = "0";
        assertEquals(expectedResult, solution.largestNumber(nums));
    }
}