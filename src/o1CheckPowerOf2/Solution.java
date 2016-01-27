package o1CheckPowerOf2;

class Solution {
    /*
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        // write your code here
        return brainKernighanAlgorithm(n) == 1;
    }

    public int brainKernighanAlgorithm(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
};
