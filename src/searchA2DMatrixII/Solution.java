package searchA2DMatrixII;

public class Solution {
    /**
     * @param matrix: A list of lists of integers
     * @param: A number you want to search in the matrix
     * @return: An integer indicate the occurrence of target in the given matrix
     */
    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int i = 0, j = (matrix[0].length-1), count = 0;

        while (i >= 0 && i < matrix.length && j >=0 && j < matrix[0].length) {
            if (matrix[i][j] == target) {
                count++;
                i++;
                j--;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
