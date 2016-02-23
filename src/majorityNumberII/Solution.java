package majorityNumberII;

import java.util.ArrayList;

/**
 * Created by bohan on 2/21/16.
 */
public class Solution {
    /**
     * @param nums: A list of integers
     * @return: The majority number that occurs more than 1/3
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code

        int count1 = 0;
        int index1 = 0;
        int count2 = 0;
        int index2 = 0;

        int i = 0;
        for (Integer integer : nums) {
            if (nums.get(index1).equals(integer)) {
                count1++;
            } else if (nums.get(index2).equals(integer)) {
                count2++;
            } else if (count1 == 0) {
                index1 = i;
                count1 = 1;
            } else if (count2 == 0) {
                index2 = i;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }

            i++;
        }

        count1 = 0;
        count2 = 0;

        for (Integer integer : nums) {
            if (integer.equals(nums.get(index1))) {
                count1++;
            }
            if (integer.equals(nums.get(index2))) {
                count2++;
            }
        }

        return count1 > count2 ? nums.get(index1) : nums.get(index2);
    }
}
