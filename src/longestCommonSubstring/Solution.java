package longestCommonSubstring;

public class Solution {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
        String stra = A;
        String strb = B;

        int[][] matrix = new int[stra.length()][strb.length()];

        int val = 0;
        int max = 0;
        for (int i = 0; i < stra.length(); i++) {
            for (int j = 0; j < strb.length(); j++) {
                if (stra.charAt(i) == strb.charAt(j)) {
                    if (i > 0 && j > 0) {
                        val = matrix[i-1][j-1] + 1;
                    } else {
                        val = 1;
                    }
                } else {
                    val = 0;
                }
                if (val > max) {
                    max = val;
                }
                matrix[i][j] = val;
            }

        }

        return max;
    }
}
