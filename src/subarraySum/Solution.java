package subarraySum;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();
        int currentSum = 0;

        sums.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            int sum = currentSum;
            if (sums.containsKey(sum)) {
                result.add(sums.get(sum) + 1);
                result.add(i);
                return result;
            }
            sums.put(sum, i);
        }

        return null;
    }
}
