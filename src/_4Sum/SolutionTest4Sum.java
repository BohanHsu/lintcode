package _4Sum;

import compareStrings.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.Assert.*;

public class SolutionTest4Sum {
    @Test
    public void testFailedOnline1() {
        Solution solution = new Solution();
        int[] numbers = null;
        int target = 0;
        ArrayList<ArrayList<Integer>> result = null;
        int[][] expectedResult = null;

        numbers = new int[]{0,0,-1012,0,0,0,-3002,0,0,0,-10,-19,0,0,90,0,92,0,1,1,1,9,9,9,10,11,1001,2001,-404,201,203,201,999,345,1,1,1,1,1,1,1,-2,1,1,1,1,1,-1,1,1,-2,1,1,1,1,3,1,1,1,1,1,-1200,1,1,1,1,1,2,1202,2,2,-4,2,2,2,2,4,5,6,1,1,-11,1,1,1,1,1,1,1,1,101,1,1,1,1,1,-1,1,-6};
        target = 92;

        result = solution.fourSum(numbers, target);
        expectedResult = alToIntArray(trueFourSum(numbers, target));
        compareResult(expectedResult, result);
    }

    @Test
    public void testFailedOnline() {
        Solution solution = new Solution();
        int[] numbers = null;
        int target = 0;
        ArrayList<ArrayList<Integer>> result = null;
        int[][] expectedResult = null;

        numbers = new int[]{-2, -3, 5, -1, -4, 5, -11, 7, 1, 2, 3, 4, -7, -1, -2, -3, -4, -5};
        target = 2;
        expectedResult = new int[][]{
                {-11, 1, 5, 7},
                {-11, 2, 4, 7},
                {-11, 3, 5, 5},
                {-7, -3, 5, 7},
                {-7, -2, 4, 7},
                {-7, -1, 3, 7},
                {-7, -1, 5, 5},
                {-7, 1, 3, 5},
                {-7, 2, 3, 4},
                {-5, -4, 4, 7},
                {-5, -3, 3, 7},
                {-5, -3, 5, 5},
                {-5, -2, 2, 7},
                {-5, -2, 4, 5},
                {-5, -1, 1, 7},
                {-5, -1, 3, 5},
                {-5, 1, 2, 4},
                {-4, -4, 3, 7},
                {-4, -4, 5, 5},
                {-4, -3, 2, 7},
                {-4, -3, 4, 5},
                {-4, -2, 1, 7},
                {-4, -2, 3, 5},
                {-4, -1, 2, 5},
                {-4, -1, 3, 4},
                {-4, 1, 2, 3},
                {-3, -3, 1, 7},
                {-3, -3, 3, 5},
                {-3, -2, 2, 5},
                {-3, -2, 3, 4},
                {-3, -1, -1, 7},
                {-3, -1, 1, 5},
                {-3, -1, 2, 4},
                {-2, -2, -1, 7},
                {-2, -2, 1, 5},
                {-2, -2, 2, 4},
                {-2, -1, 1, 4},
                {-2, -1, 2, 3},
                {-1, -1, 1, 3}
        };

        result = solution.fourSum(numbers, target);
        compareResult(expectedResult, result);
    }
    @Test
    public void testFourSum() {
        Solution solution = new Solution();
        int[] numbers = null;
        int target = 0;
        ArrayList<ArrayList<Integer>> result = null;
        int[][] expectedResult = null;

        numbers = new int[]{1, 0, -1, 0, -2, 2};
        target = 0;
        expectedResult = new int[][]{
                new int[]{-1, 0, 0, 1},
                new int[]{-2, -1, 1, 2},
                new int[]{-2, 0, 0, 2}
        };
        result = solution.fourSum(numbers, target);
        compareResult(expectedResult, result);
    }

    public void compareResult(int[][] expectedResult, final ArrayList<ArrayList<Integer>> result) {
        assertEquals(expectedResult.length, result.size());

        Arrays.sort(expectedResult, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                for (int i = 0; i < o1.length; i++) {
                    if (o1[i] != o2[i]) {
                        return o1[i] - o2[i];
                    }
                }
                return 0;
            }
        });

        Collections.sort(result, new Comparator<ArrayList<Integer>>() {
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


        for (int i = 0; i < expectedResult.length; i++) {
            for (int j = 0; j < expectedResult[i].length; j++) {
                assertEquals(expectedResult[i][j], result.get(i).get(j).intValue());
            }
        }
    }


    public ArrayList<ArrayList<Integer>> trueFourSum(int[] num, int target) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);

        for (int i = 0; i < num.length - 3; i++) {
            if (i != 0 && num[i] == num[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < num.length - 2; j++) {
                if (j != i + 1 && num[j] == num[j - 1])
                    continue;

                int left = j + 1;
                int right = num.length - 1;
                while (left < right) {
                    int sum = num[i] + num[j] + num[left] + num[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        ArrayList<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(num[i]);
                        tmp.add(num[j]);
                        tmp.add(num[left]);
                        tmp.add(num[right]);
                        rst.add(tmp);
                        left++;
                        right--;
                        while (left < right && num[left] == num[left - 1]) {
                            left++;
                        }
                        while (left < right && num[right] == num[right + 1]) {
                            right--;
                        }
                    }
                }
            }
        }

        return rst;
    }

    public int[][] alToIntArray(ArrayList<ArrayList<Integer>> results) {
        int[][] expectedResult = new int[results.size()][4];

        for (int i = 0; i < results.size(); i++) {
            for (int j = 0; j < 4; j++) {
                expectedResult[i][j] = results.get(i).get(j).intValue();
            }
        }
        return expectedResult;
    }

}
