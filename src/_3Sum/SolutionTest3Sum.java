package _3Sum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/5/15.
 */
public class SolutionTest3Sum {
    @Test
    public void testThreeSum() {
        Solution solution = new Solution();
        int[] nums = null;
        int[][] expectedResult = null;
        ArrayList<ArrayList<Integer>> result = null;

        nums = new int[]{-1, 0, 1, 2, -1, -4};
        expectedResult = new int[][]{
                new int[]{-1, 0, 1},
                new int[]{-1, -1, 2}
        };

        result = solution.threeSum(nums);
        compare(expectedResult, result);

        nums = new int[]{-1, 0, 1, 2, -1, -4};
        expectedResult = new int[][]{
                new int[]{-1, 0, 1},
                new int[]{-1, -1, 2}
        };

        result = solution.threeSum(nums);
        compare(expectedResult, result);
    }

    public void compare(int[][] expectedResult, ArrayList<ArrayList<Integer>> result) {
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
                    if (o1.get(i) != o2.get(i)) {
                        return o1.get(i) - o2.get(i);
                    }
                }
                return 0;
            }
        });

        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(3, result.get(i).size());

            for (int j = 0; j < 3; j++) {
                assertEquals(expectedResult[i][j], result.get(i).get(j).intValue());
            }
        }
    }

}