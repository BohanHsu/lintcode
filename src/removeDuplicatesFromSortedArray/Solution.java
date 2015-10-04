package removeDuplicatesFromSortedArray;

public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here

        if (nums.length == 0)
            return 0;

        if (nums.length < 3) {
            if (nums.length == 2 && nums[0] != nums[1]) {
                return 2;
            } else {
                return 1;
            }
        }

        int i = 1;
        int j = -1;

        while (j < nums.length) {
            while (i < nums.length && nums[i-1] < nums[i]) {
                i++;
            }
            if (j == -1) {
                j = i + 1;
            }

            while (j < nums.length && nums[j] <= nums[i-1]) {
                j++;
            }

            if (j < nums.length) {
                nums[i] = nums[j];
            }
            //System.out.println("i=" + i + ", j=" + j);
            //printArray(nums);
            i++;
        }

        return i-1;
    }

    //private void printArray(int[] nums) {
    //    System.out.print('[');
    //    for (int i = 0; i < nums.length - 1; i++) {
    //        System.out.print(nums[i] + ", ");
    //    }
    //    System.out.println(nums[nums.length-1] + "]");
    //}
}
