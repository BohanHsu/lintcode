package partitionArray;

public class Solution {
    /**
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        //write your code here

        int i = 0;
        int j = 0;

        while (j < nums.length && nums[j] >= k) {
            j++;
        }
        if (j == nums.length) {
            return 0;
        }

        swap(nums, i, j);

        j = 1;

        while (j < nums.length) {
            if (nums[j] < k) {
                i++;
                //System.out.println("i=" + i + ", j=" + j);
                swap(nums, i, j);
            }

            j++;
        }
        return i + 1;
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
