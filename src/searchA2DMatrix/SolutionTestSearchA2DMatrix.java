package searchA2DMatrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTestSearchA2DMatrix {

    @Test
    public void testSearchMatrix() {
        Solution solution = new Solution();
        int[][] matrix = null;
        int target = 3;
        boolean expectedResult = true;

        matrix = new int[][]{
                new int[]{1,3,5,7},
                new int[]{10,11,16,20},
                new int[]{23,30,34,50}
        };
        target = 3;
        expectedResult = true;
        assertEquals(expectedResult, solution.searchMatrix(matrix, target));

        target = 11;
        expectedResult = true;
        assertEquals(expectedResult, solution.searchMatrix(matrix, target));

        target = 12;
        expectedResult = false;
        assertEquals(expectedResult, solution.searchMatrix(matrix, target));

        target = 9;
        expectedResult = false;
        assertEquals(expectedResult, solution.searchMatrix(matrix, target));

        target = 59;
        expectedResult = false;
        assertEquals(expectedResult, solution.searchMatrix(matrix, target));

        target = 0;
        expectedResult = false;
        assertEquals(expectedResult, solution.searchMatrix(matrix, target));

        matrix = new int[][]{};
        target = 0;
        expectedResult = false;
        assertEquals(expectedResult, solution.searchMatrix(matrix, target));
    }

}