package largestNumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by bohan on 2/18/16.
 */
public class Solution {
    /**
     *@param num: A list of non negative integers
     *@return: A string
     */
    public String largestNumber(int[] num) {
        // write your code here
        boolean allZero = true;
        LinkedList<int[]> arrNums = new LinkedList<int[]>();
        for (int i = 0; i < num.length; i++) {
            arrNums.add(numsToIntArr(num[i]));
            allZero = allZero && num[i] == 0;
        }
        if (allZero) {
            return "0";
        }

        Collections.sort(arrNums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1.length == o2.length) {
                    for (int i = 0; i < o1.length; i++) {
                        if (o1[i] < o2[i]) {
                            return -1;
                        } else if (o1[i] > o2[i]) {
                            return 1;
                        }
                    }
                    return 0;
                } else if (o1.length > o2.length) {
                    int upperBoundry = (o1.length / o2.length + ((o1.length % o2.length == 0) ? 0 : 1)) * o2.length;
                    for (int i = 0; i < upperBoundry; i++) {
                        if (i >= o1.length) {
                            if (o2[0] < o2[o2.length-1]) {
                                return -1;
                            } else if (o2[0] > o2[o2.length-1]) {
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                        if (o1[i] < o2[i%o2.length]) {
                            return -1;
                        } else if (o1[i] > o2[i%o2.length]) {
                            return 1;
                        }
                    }
                } else if (o1.length < o2.length) {
                    int upperBoundry = (o2.length / o1.length + ((o2.length % o1.length == 0) ? 0 : 1)) * o1.length;
                    for (int i = 0; i < upperBoundry; i++) {
                        if (i >= o2.length) {
                            if (o1[0] < o1[o1.length-1]) {
                                return 1;
                            } else if (o1[0] > o1[o1.length-1]) {
                                return -1;
                            } else {
                                return 0;
                            }
                        }
                        if (o1[i%o1.length] < o2[i]) {
                            return -1;
                        } else if (o1[i%o1.length] > o2[i%o2.length]) {
                            return 1;
                        }
                    }
                }
                return 0;
            }
        });

        Collections.reverse(arrNums);

        int length = 0;
        for (int[] arr : arrNums) {
            length += arr.length;
        }

        char[] chars = new char[length];
        int index = 0;
        for (int[] arr : arrNums) {
            for (int j = 0; j < arr.length; j++) {
                chars[index] = (char)(arr[j] + 48);
                index++;
            }
        }
        return new String(chars);
    }

    public int[] numsToIntArr(int num) {
        if (num == 0) {
            return new int[]{0};
        }
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (num > 0) {
            stack.add(0, num % 10);
            num /= 10;
        }
        int[] result = new int[stack.size()];
        int i = 0;
        for (Integer integer : stack) {
            result[i] = integer;
            i++;
        }
        return result;
    }
}