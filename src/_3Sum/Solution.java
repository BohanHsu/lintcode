package _3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        HashSet<Solution.Triple> set = new HashSet<Triple>();

        Arrays.sort(numbers);

        int i = 0;
        int j,k;

        while (i < numbers.length - 2) {
            j = i + 1;
            k = numbers.length - 1;

            while (j < k) {
                if (numbers[i] + numbers[j] + numbers[k] < 0) {
                    j++;
                } else if (numbers[i] + numbers[j] + numbers[k] > 0) {
                    k--;
                } else {
                    // found solution
                    Triple triple = new Triple(numbers[i], numbers[j], numbers[k]);
                    if (!set.contains(triple)) {
                        set.add(triple);
                        ArrayList<Integer> localSolution = new ArrayList<Integer>();
                        localSolution.add(numbers[i]);
                        localSolution.add(numbers[j]);
                        localSolution.add(numbers[k]);
                        results.add(localSolution);
                    }
                    j++;
                    k--;
                }
            }
            i++;
        }
        return results;
    }

    class Triple {
        int a,b,c;

        public Triple(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Triple triple = (Triple) o;

            if (a != triple.a) return false;
            if (b != triple.b) return false;
            return c == triple.c;

        }

        @Override
        public int hashCode() {
            int result = a;
            result = 31 * result + b;
            result = 31 * result + c;
            return result;
        }
    }
}
