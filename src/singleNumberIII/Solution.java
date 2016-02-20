package singleNumberIII;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by bohan on 2/20/16.
 */
public class Solution {
    /**
     * @param A : An integer array
     * @return : Two integers
     */
    public List<Integer> singleNumberIII(int[] A) {
        // write your code here
        int[] nums = A;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            n ^= nums[i];
        }

        int differentBit = n - (n & (n-1));

        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((differentBit & nums[i]) == 0) {
                num1 ^= nums[i];
            } else {
                num2 ^= nums[i];
            }
        }

        LinkedList<Integer> result = new LinkedList<Integer>();
        result.add(num1);
        result.add(num2);
        return result;
    }
}
