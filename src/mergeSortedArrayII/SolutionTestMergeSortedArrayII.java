package mergeSortedArrayII;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by bohan on 10/7/15.
 */
public class SolutionTestMergeSortedArrayII {
    @Test
    public void testMergeSortedArray() {
        Solution solution = new Solution();
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{2,4,5,6};
        ArrayList<Integer> result = null;
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> expectedResult = new ArrayList<Integer>();

        for (int i : arr1) {
            a.add(i);
            expectedResult.add(i);
        }

        for (int i : arr2) {
            b.add(i);
            expectedResult.add(i);
        }

        Collections.sort(expectedResult);
        //System.out.println(expectedResult.toString());

        result = solution.mergeSortedArray(a, b);
        //System.out.println(result.toString());

        assertEquals(expectedResult.size(), result.size());

        for (int i = 0; i < expectedResult.size(); i++) {
            //System.out.println(expectedResult.get(i).intValue());
            //System.out.println(result.get(i).intValue());
            assertEquals(expectedResult.get(i).intValue(), result.get(i).intValue());
        }
    }

}