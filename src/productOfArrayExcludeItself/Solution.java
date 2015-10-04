package productOfArrayExcludeItself;

import java.util.ArrayList;

public class Solution {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        ArrayList<Integer> nums = A;
        long[] mutiplleFromRight = new long[nums.size()];

        long res = 1;
        for (int i = nums.size() - 1; i >= 0; i--) {
            res *= nums.get(i);
            mutiplleFromRight[i] = res;
        }

        ArrayList<Long> result = new ArrayList<Long>(nums.size());

        res = 1;
        for (int i = 0; i < nums.size(); i++) {
            if (i == nums.size() - 1) {
                result.add(res);
            } else {
                result.add(mutiplleFromRight[i+1] * res);
                res *= nums.get(i);
            }
        }
        return result;
    }
}
