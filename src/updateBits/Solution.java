package updateBits;

class Solution {
    /**
     *@param n, m: Two integer
     *@param i, j: Two bit positions
     *return: An integer
     */
    public int updateBits(int n, int m, int i, int j) {
        return (int) updateBitsHelper(n, m, i, j);
    }

    public long updateBitsHelper(long n, long m, int i, int j) {
        int windowLength = j - i;
        long mask = (long) Math.pow(2, (windowLength + 1)) - 1;
        m = m & mask;
        long reverseMask = ((long)(-1)) ^ mask;
        reverseMask = reverseMask << i | ((long) Math.pow(2, i) - 1);
        n = n & reverseMask;
        m = m << i;
        return m | n;
    }
}
