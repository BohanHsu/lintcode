package twoStringsAreAnagrams;

import java.util.HashMap;

public class Solution {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.toCharArray()[i]))
                map.put(s.toCharArray()[i], 0);

            map.put(s.toCharArray()[i], map.get(s.toCharArray()[i]) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.toCharArray()[i]))
                return false;

            map.put(t.toCharArray()[i], map.get(t.toCharArray()[i]) - 1);
        }

        for (Integer count : map.values()) {
            if (count != 0)
                return false;
        }

        return true;
    }
}
