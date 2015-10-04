package firstMissingPositive;

public class Solution {
    /**
     * @param A: an array of integers
     * @return: an integer
     */
    public int firstMissingPositive(int[] A) {
        // write your code here
        int[] a = A;

        int i = 0;
        while (i < a.length) {
            //System.out.println(i);
            while (a[i] != i + 1 && a[i] >= 1 && a[i] <= a.length) {
                int j = a[i];
                //System.out.println("i=" + i + ", j=" + j + ", a[i]=" + a[i] + ", a[j]=" + a[j]);
                if (j >= 1 && j <= a.length) {
                    if (a[j-1] == j) {
                        break;
                    }
                    swap(a, i, j-1);
                }
            }
            i++;
        }

        i = 0;
        while (i < a.length) {
            if (a[i] != i+1) {
                return i + 1;
            }
            i++;
        }
        return a.length + 1;
    }

    public void swap(int[] nums, int i, int j) {
        int tmp  = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
