package twoStringsAreAnagrams;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 9/22/15.
 */
public class SolutionTest {
    @Test
    public void testAnagram() {
        Solution solution = new Solution();
        String s = "aabcd";
        String t = "bcdaa";
        boolean expectedResult = true;
        assertEquals(expectedResult, solution.anagram(s, t));

        t = "dcba";
        expectedResult = false;
        assertEquals(expectedResult, solution.anagram(s, t));

        t = "bdcak";
        expectedResult = false;
        assertEquals(expectedResult, solution.anagram(s, t));
    }

    @Test
    public void testFailedOnline() {
        Solution solution = new Solution();
        String s = "happy new year";
        String t = "n ahwryeypp ea";
        boolean expectedResult = true;
        assertEquals(expectedResult, solution.anagram(s, t));
    }
}