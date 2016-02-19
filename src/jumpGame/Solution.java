package jumpGame;

/**
 * Created by bohan on 2/18/16.
 */
public class Solution {
    /**
     * @param A: A list of integers
     * @return: The boolean answer
     */
    public boolean canJump(int[] A) {
        // wirte your code here
        int[] nums = A;
        if (nums.length <= 1) {
            return true;
        }
        int boundry = nums[0];
        int i = 0;
        while (i < boundry) {
            if (i + nums[i] > boundry) {
                boundry = i + nums[i];
            }
            i++;
            if (boundry >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
