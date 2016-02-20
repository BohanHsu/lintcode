package jumpGameII;

/**
 * Created by bohan on 2/20/16.
 */
public class Solution {
    /**
     * @param A: A list of lists of integers
     * @return: An integer
     */
    public int jump(int[] A) {
        // write your code here
        int[] a = A;

        if (a.length <= 1) {
            return 0;
        }

        int[] jumps = new int[a.length];

        jumps[0] = 0;
        int j = 1;

        for (int i = 0; i < a.length; i++) {
            for (int k = j; k <= i + a[i] && k < jumps.length; k++) {
                jumps[k] = jumps[i] + 1;
                if (k == jumps.length - 1) {
                    return jumps[k];
                }
            }
            j = i + a[i] + 1;
        }
        return -1;
    }
}

