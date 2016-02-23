package singleNumberII;

/**
 * Created by bohan on 2/20/16.
 */
public class Solution {
    /**
     * @param A : An integer array
     * @return : An integer
     */
    public int singleNumberII(int[] A) {
        // write your code here
        int[] nums = A;
        int[] bits = new int[32];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 32; j++) {
                if (((1 << j) & nums[i]) != 0) {
                    bits[j] += 1;
                }
            }
        }

        int result = 0;

        for (int j = 0; j < 32; j++) {
            bits[j] = bits[j] % 3;
            if (bits[j] == 1) {
                result |= (1 << j);
            }
        }

        return result;
    }
}