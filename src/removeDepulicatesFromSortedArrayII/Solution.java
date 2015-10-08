package removeDepulicatesFromSortedArrayII;

import java.util.HashSet;

public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here

        if (nums.length <= 2) {
            return nums.length;
        }

        HashSet<Integer> removeIndices = new HashSet<Integer>();
        int i=0, j;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i+1]) {
                j = i + 2;
                while (j < nums.length) {
                    if (nums[j] == nums[i]) {
                        removeIndices.add(j);
                        j++;
                    } else {
                        break;
                    }
                }
                i = j;
            } else {
                i++;
            }
        }

        i = 2;
        j = 2;

        while (j < nums.length) {
            if (removeIndices.contains(j)) {
                j++;
            } else {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }
        return i;
    }
}
