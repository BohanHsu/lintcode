package productOfArrayExcludeItself;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTestProductOfArrayExcludeItself {
    @Test
    public void testProductExcludeItself() {
        Solution solution = new Solution();
        ArrayList<Integer> arrayList = null;
        ArrayList<Long> resultList = null;
        int[] nums = null;
        long[] expectedResult = null;


        nums = new int[]{1,2,3};
        expectedResult = new long[]{6,3,2};

        arrayList = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(nums[i]);
        }

        resultList = solution.productExcludeItself(arrayList);

        assertEquals(expectedResult.length, resultList.size());
        for (int i = 0; i < resultList.size(); i++) {
            assertEquals(expectedResult[i], resultList.get(i).longValue());
        }


    }

}