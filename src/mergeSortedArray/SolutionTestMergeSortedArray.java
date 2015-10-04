package mergeSortedArray;

import compareStrings.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTestMergeSortedArray {

    int[] arrA = null;
    int[] arrB = null;

    @Test
    public void testMergeSortedArray() {
        Solution solution = new Solution();
        int m, n;
        int[] expectedResult;

        arrA = new int[]{1,2,3,0,0};
        m = 3;
        arrB = new int[]{4,5};
        n = 2;
        expectedResult = new int[]{1,2,3,4,5};

        solution.mergeSortedArray(arrA, m ,arrB, n);
        for (int i = 0; i < m + n; i++) {
            assertEquals(expectedResult[i], arrA[i]);
        }

        arrA = new int[]{1,2,3};
        m = 3;
        arrB = new int[]{};
        n = 0;
        expectedResult = new int[]{1,2,3};

        solution.mergeSortedArray(arrA, m ,arrB, n);
        for (int i = 0; i < m + n; i++) {
            assertEquals(expectedResult[i], arrA[i]);
        }

        arrA = new int[]{0,0};
        m = 0;
        arrB = new int[]{4,5};
        n = 2;
        expectedResult = new int[]{4,5};

        solution.mergeSortedArray(arrA, m ,arrB, n);
        for (int i = 0; i < m + n; i++) {
            assertEquals(expectedResult[i], arrA[i]);
        }

    }

}