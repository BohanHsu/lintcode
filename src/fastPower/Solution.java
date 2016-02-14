package fastPower;

/**
 * Created by bohan on 2/12/16.
 */
class Solution {
    /*
     * @param a, b, n: 32bit integers
     * @return: An integer
     */
    public int fastPower(int a, int b, int n) {
        // write your code here
        if (n == 0) {
            return 1 % b;
        }
        if (n == 1) {
            return a % b;
        }
        long rootRemainder = fastPower(a, b, (n / 2));
        return (int)(((rootRemainder * rootRemainder) % b * (n % 2 == 1 ? a : 1)) % b);
    }
};
