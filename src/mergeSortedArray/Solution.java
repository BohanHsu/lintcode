package mergeSortedArray;

class Solution {
    /**
     * @param A: sorted integer array A which has m elements,
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int[] a = A;
        int[] b = B;
        int i = m + n - 1;
        m--;
        n--;
        while (m >= 0 || n >= 0) {
            if (m >= 0 && n >= 0) {
                if (a[m] > b[n]) {
                    a[i] = a[m];
                    m--;
                } else {
                    a[i] = b[n];
                    n--;
                }
            } else if (m >= 0 && n < 0) {
                a[i] = a[m];
                m--;
            } else if (m < 0 && n >= 0) {
                a[i] = b[n];
                n--;
            }
            i--;
        }
    }
}
