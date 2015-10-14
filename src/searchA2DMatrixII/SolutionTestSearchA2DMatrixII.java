package searchA2DMatrixII;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTestSearchA2DMatrixII {
    @Test
    public void testSearchMatrix() {
        int[][] matrix = {
                new int[]{1,3,5,7},
                new int[]{2,4,7,8},
                new int[]{3,5,9,10}
        };
        int target = 3;

        Solution solution = new Solution();
        assertEquals(2, solution.searchMatrix(matrix, target));
    }

}