package singleNumberIII;

import org.junit.Test;
import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/20/16.
 */
public class SolutionTestSingleNumberIII {
    public int[] linkedListToArray(List<Integer> linkedList) {
        int[] result = new int[linkedList.size()];
        int i = 0;
        for (Integer integer : linkedList) {
            result[i] = integer;
            i++;
        }
        return result;
    }

    @Test
    public void testSingleNumberIII() {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,2,3,4,4,5,3};
        int[] expectedResult = new int[]{1,5};
        Arrays.sort(expectedResult);
        int[] actualResult = linkedListToArray(solution.singleNumberIII(nums));
        Arrays.sort(actualResult);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}