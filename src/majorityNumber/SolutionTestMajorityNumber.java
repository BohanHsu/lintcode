package majorityNumber;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/17/16.
 */
public class SolutionTestMajorityNumber {
    public ArrayList<Integer> convert(int[] arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    @Test
    public void testMajorityNumber() {
        Solution solution = new Solution();
        int[] arr = null;
        arr = new int[]{1,1,1,1,2,2,2};
        int expectedResult = 1;
        //assertEquals(expectedResult, solution.majorityNumber(convert(arr)));

        arr = new int[]{2,1,2,1,2};
        expectedResult = 2;
        assertEquals(expectedResult, solution.majorityNumber(convert(arr)));
    }

}