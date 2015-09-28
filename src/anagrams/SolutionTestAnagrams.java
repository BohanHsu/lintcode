package anagrams;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by bohan on 9/24/15.
 */
public class SolutionTestAnagrams {
    @Test
    public void testAnagrams() {
        Solution solution = new Solution();
        String[] list = new String[]{"lint", "intl", "inlt", "code"};
        String[] expectedResult = new String[]{"lint", "inlt", "intl"};
        //String[] result = (String[]) solution.anagrams(list).toArray();
        List<String> linkedListResult = solution.anagrams(list);
        String[] result = new String[linkedListResult.size()];
        int k = 0;
        for (String str : linkedListResult) {
            result[k] = str;
            k++;
        }

        Arrays.sort(expectedResult);
        Arrays.sort(result);

        assertEquals(expectedResult.length, result.length);
        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], result[i]);
        }
    }

    @Test
    public void testAnagrams2() {
        Solution solution = new Solution();
        String[] list = new String[]{"", ""};
        String[] expectedResult = new String[]{"", ""};
        //String[] result = (String[]) solution.anagrams(list).toArray();
        List<String> linkedListResult = solution.anagrams(list);
        String[] result = new String[linkedListResult.size()];
        int k = 0;
        for (String str : linkedListResult) {
            result[k] = str;
            k++;
        }

        Arrays.sort(expectedResult);
        Arrays.sort(result);

        assertEquals(expectedResult.length, result.length);
        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], result[i]);
        }
    }

    @Test
    public void testAnagrams3() {
        Solution solution = new Solution();
        String[] list = new String[]{"", "", ""};
        String[] expectedResult = new String[]{"", "", ""};
        //String[] result = (String[]) solution.anagrams(list).toArray();
        List<String> linkedListResult = solution.anagrams(list);
        String[] result = new String[linkedListResult.size()];
        int k = 0;
        for (String str : linkedListResult) {
            result[k] = str;
            k++;
        }

        Arrays.sort(expectedResult);
        Arrays.sort(result);

        assertEquals(expectedResult.length, result.length);
        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], result[i]);
        }
    }

    @Test
    public void testAnagrams4() {
        Solution solution = new Solution();
        String[] list = new String[]{"abc", "abc", "abc", "cba"};
        String[] expectedResult = new String[]{"abc", "abc", "abc", "cba"};
        //String[] result = (String[]) solution.anagrams(list).toArray();
        List<String> linkedListResult = solution.anagrams(list);
        String[] result = new String[linkedListResult.size()];
        int k = 0;
        for (String str : linkedListResult) {
            result[k] = str;
            k++;
        }

        Arrays.sort(expectedResult);
        Arrays.sort(result);

        assertEquals(expectedResult.length, result.length);
        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], result[i]);
        }
    }
}