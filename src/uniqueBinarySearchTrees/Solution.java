package uniqueBinarySearchTrees;

import java.util.Arrays;

public class Solution {
    /**
     * @paramn n: An integer
     * @return: An integer
     */
    public int numTrees(int n) {
        // write your code here
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;
        if (n <= 2) {
            return nums[n];
        }

        for (int i = 3; i < n + 1; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += (nums[j] * nums[i - 1 - j]);
            }
            nums[i] = sum;
        }

        //System.out.println(Arrays.toString(nums));
        return nums[n];
    }
}
