package compareStrings;

import java.util.HashMap;

public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();


        for (char c : B.toCharArray()) {
            if (!map.containsKey(c))
                map.put(c, 0);

            map.put(c, map.get(c) + 1);
        }

        for (char c : A.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c) - 1);
        }

        for (Integer count : map.values()) {
            if (count > 0)
                return false;
        }

        return true;
    }
}
