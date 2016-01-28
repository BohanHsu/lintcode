package trailingZeros;

class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        long count = 0;
        while (n / 5 > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
};

