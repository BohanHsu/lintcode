package searchA2DMatrix;

public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int from = 0;
        int to = matrix.length - 1;
        int line = -1;

        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        while (from <= to) {
            if (check1(matrix, from, target)) {
                line = from;
                break;
            }

            if (check1(matrix, to, target)) {
                line = to;
                break;
            }

            if (to - from <= 1) {
                return false;
            }

            int i = (from + to) / 2;

            if (matrix[i][0] < target) {
                from = i;
            } else {
                to = i;
            }
        }

        from = 0;
        to = matrix[line].length - 1;

        while (from <= to) {
            if (check2(matrix[line], from ,target)) {
                return true;
            }

            if (check2(matrix[line], to ,target)) {
                return true;
            }

            if (to - from <= 1) {
                return false;
            }

            int i = (from + to) / 2;

            if (matrix[line][i] < target) {
                from = i;
            } else {
                to = i;
            }
        }
        return false;
    }

    public boolean check1(int[][] matrix, int index, int target) {
        if (index == matrix.length - 1) {
            return matrix[index][0] <= target;
        }

        return matrix[index][0] <= target && matrix[index + 1][0] > target;
    }

    public boolean check2(int[] nums, int index, int target) {
        return  (nums[index] == target);
    }
}
