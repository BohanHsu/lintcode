package removeElement;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/3/15.
 */
public class SolutionTestRemoveElement {
    private int[] arr;
    @Test
    public void testRemoveElement() {
        Solution solution = new Solution();
        int elem = 0;
        int[] expectedArr = null;
        int expectedResult = 0;

        arr = new int[]{0,4,4,0,0,2,4,4};
        elem = 4;
        expectedArr = new int[]{0,0,0,2};
        expectedResult = 4;

        int result = solution.removeElement(arr, elem);
        assertEquals(expectedResult, result);
        int[] removedArray = new int[result];
        for (int i = 0; i < result; i++) {
            removedArray[i] = arr[i];
        }
        Arrays.sort(removedArray);
        Arrays.sort(expectedArr);
        for (int i = 0; i < result; i++) {
            assertEquals(expectedArr[i], removedArray[i]);
        }

        arr = new int[]{0,4,4,0,0,2,4,4};
        elem = 3;
        expectedArr = new int[]{0,4,4,0,0,2,4,4};
        expectedResult = 8;

        result = solution.removeElement(arr, elem);
        assertEquals(expectedResult, result);
        removedArray = new int[result];
        for (int i = 0; i < result; i++) {
            removedArray[i] = arr[i];
        }
        Arrays.sort(removedArray);
        Arrays.sort(expectedArr);
        for (int i = 0; i < result; i++) {
            assertEquals(expectedArr[i], removedArray[i]);
        }
    }
}