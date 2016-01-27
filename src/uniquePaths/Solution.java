package uniquePaths;

import java.util.Arrays;

public class Solution {
    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here

        //if (n == 1 || m == 1) {
        //    return 1;
        //}
        //return uniquePaths(m-1, n) + uniquePaths(m, n-1);
        int b = m > n ? m : n;
        int a = m <= n ? m : n;

        int[] arr = new int[a];

        Arrays.fill(arr, 1);

        for (int i = 1; i < b; i++) {
            for (int j = 1; j < a; j++) {
                arr[j] = arr[j] + arr[j-1];
            }
        }

        return arr[arr.length-1];
    }
}
