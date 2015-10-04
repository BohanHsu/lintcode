package _2sum;

import java.util.HashMap;
import java.util.LinkedList;

public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int[] result = new int[2];
        HashMap<Integer, LinkedList<Integer>> numIndices = new HashMap<Integer, LinkedList<Integer>>();

        for (int i = 0; i < numbers.length; i++) {
            if (!numIndices.containsKey(numbers[i])) {
                numIndices.put(numbers[i], new LinkedList<Integer>());
            }
            numIndices.get(numbers[i]).add(i);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numIndices.containsKey(target - numbers[i])) {
                for (Integer index : numIndices.get(target - numbers[i])) {
                    if (index != i) {
                        if (i >= index) {
                            result[0] = 1 + index;
                            result[1] = 1 + i;
                        } else {
                            result[0] = 1 + i;
                            result[1] = 1 + index;
                        }
                        return result;
                    }
                }
            }
        }

        return null;
    }
}
