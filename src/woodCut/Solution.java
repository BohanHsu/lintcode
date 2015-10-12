package woodCut;

public class Solution {
    /**
     *@param L: Given n pieces of wood with length L[i]
     *@param k: An integer
     *return: The maximum length of the small pieces.
     */
    public int woodCut(int[] L, int k) {
        int[] l = L;

        int from = 1, to = Integer.MIN_VALUE;

        for (int i = 0; i < l.length; i++) {
            if (l[i] > to) {
                to = l[i];
            }
        }

        while (from <= to) {
            if (checkNumOfPiece(l, k, from) == 0) {
                return from;
            }

            if (checkNumOfPiece(l, k, to) == 0) {
                return to;
            }

            if (to - from <= 1) {
                return 0;
            }

            long f = from;
            long t = to;
            long middle = (f + t) / 2;
            int i = (int) middle;

            int iResult = checkNumOfPiece(l, k, i);
            if (iResult == 0) {
                return i;
            } else if (iResult == -1) {
                to = i;
            } else if (iResult == 1) {
                from = i;
            } else {
                return 0;
            }

        }
        return 0;
    }

    public int checkNumOfPiece(int[] l, int k, int length) {
        long sum1 = 0;
        long sum2 = 0;
        for (int i = 0; i < l.length; i++) {
            sum1 += (l[i] / length);
            sum2 += (l[i] / (length + 1));
        }

        if (sum1 >= k && sum2 < k) {
            return 0;
        } else if (sum1 < k && sum2 <= k) {
            return -1;
        } else if (sum1 >= k && sum2 >= k) {
            return 1;
        }
        return 2;
    }
}
