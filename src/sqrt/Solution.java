package sqrt;

class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        long from = 0;
        long to = x;
        long rt = (from + to) / 2;

        while (!isRoot(x, rt)) {
            if (isRoot(x, from)) {
                return (int)from;
            }
            if (isRoot(x, to)) {
                return (int)to;
            }

            if (rt * rt > x) {
                to = rt;
                rt = (from + to) / 2;
            } else {
                from = rt;
                rt = (from + to) / 2;
            }
        }

        return (int)rt;
    }

    public boolean isRoot(long x, long rt) {
        return (rt * rt <= x && (rt + 1) * (rt + 1) > x);
    }
}
