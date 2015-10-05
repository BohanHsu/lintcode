package _3SumClosest;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers ,int target) {
        // write your code here
        int cloeset = numbers[0] + numbers[1] + numbers[2];
        Arrays.sort(numbers);

        int i = 0;
        int j, k;

        while (i < numbers.length - 2) {
            j = i + 1;
            k = numbers.length - 1;
            while (j < k) {
                int localSum = numbers[i] + numbers[j] + numbers[k];
                //System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", localSum=" + localSum + ", cloeset=" + cloeset);
                if (localSum == target) {
                    return target;
                } else if (localSum < target) {
                    if (Math.abs(target - localSum) < Math.abs(target - cloeset)) {
                        cloeset = localSum;
                    }
                    j++;
                } else if (localSum > target) {
                    if (Math.abs(target - localSum) < Math.abs(target - cloeset)) {
                        cloeset = localSum;
                    }
                    k--;
                }
            }

            i++;
        }

        return cloeset;
    }
}
