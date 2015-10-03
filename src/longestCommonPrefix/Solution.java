package longestCommonPrefix;

public class Solution {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {

        int minLength = -1;
        for (int j = 0; j < strs.length; j++) {
            if (minLength == -1 || strs[j].length() < minLength) {
                minLength = strs[j].length();
            }
        }

        if (strs.length == 0 || minLength == 0) {
            return "";
        }

        int i = 0;

        while (i < minLength) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j-1].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0,i);
                }
            }
            i++;
        }

        return strs[0];
    }
}
