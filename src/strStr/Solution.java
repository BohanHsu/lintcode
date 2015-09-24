package strStr;

class Solution {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        if (source == null || target == null)
            return -1;

        if (target.length() == 0)
            return 0;

        int i = 0;
        int j = 0;
        int ptrnLen = target.length();
        int textLen = source.length();
        char[] ptrn = target.toCharArray();
        char[] text = source.toCharArray();

        int[] b = preProcessPattern(target.toCharArray());

        while (i < textLen) {
            while (j >= 0 && text[i] != ptrn[j]) {
                j = b[j];
            }
            i++;
            j++;

            if (j == ptrnLen) {
                return i - ptrnLen;
            }
        }
        return -1;
    }

    public int[] preProcessPattern(char[] ptrn) {
        int i = 0;
        int j = -1;
        int[] b = new int[ptrn.length + 1];

        b[i] = j;
        while (i < ptrn.length) {
            while (j >= 0 && ptrn[i] != ptrn[j]) {
                j = b[j];
            }

            i++;
            j++;
            b[i] = j;
        }
        return b;
    }
}
