package _4Sum;

import java.util.*;

public class Solution {
    /**
     * @param numbers : Give an array numbersbers of n integer
     * @param target  : you need to find four elements that's sum of target
     * @return : Find all unique quadruplets in the array which gives the sum of
     * zero.
     */
    public ArrayList<ArrayList<Integer>> fourSum(int[] numbers, int target) {
        class Result {
            int a, b, c, d;

            public Result(int a, int b, int c, int d) {
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Result result = (Result) o;

                if (a != result.a) return false;
                if (b != result.b) return false;
                if (c != result.c) return false;
                return d == result.d;

            }

            @Override
            public int hashCode() {
                int result = a;
                result = 31 * result + b;
                result = 31 * result + c;
                result = 31 * result + d;
                return result;
            }
        }
        Arrays.sort(numbers);

        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        HashSet<Result> set = new HashSet<Result>();

        int i, j, k, l;
        i = 0;

        while (i < numbers.length - 3) {
            j = i + 1;
            while (j < numbers.length - 2) {
                k = j + 1;
                l = numbers.length - 1;
                while (k < l) {
                    int localSum = numbers[i] + numbers[j] + numbers[k] + numbers[l];
                    if (localSum == target) {
                        Result r = new Result(numbers[i], numbers[j], numbers[k], numbers[l]);
                        set.add(r);
                        k++;
                        l--;
                    } else if (localSum < target) {
                        k++;
                    } else if (localSum > target) {
                        l--;
                    }
                }
                j++;
            }
            i++;
        }

        for (Result r : set) {

            ArrayList<Integer> result = new ArrayList<Integer>();
            result.add(r.a);
            result.add(r.b);
            result.add(r.c);
            result.add(r.d);
            results.add(result);
        }

        Collections.sort(results, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                for (int i = 0; i < o1.size(); i++) {
                    if (!o1.get(i).equals(o2.get(i))) {
                        return o1.get(i) - o2.get(i);
                    }
                }
                return 0;
            }
        });
        return results;
    }
}
