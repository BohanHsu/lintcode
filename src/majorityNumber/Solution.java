package majorityNumber;

import java.util.ArrayList;

/**
 * Created by bohan on 2/17/16.
 */
public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i).equals(nums.get(index))) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                index = i;
                count++;
            }
        }
        return nums.get(index);
    }
}
