package anagrams;

import java.util.*;

public class Solution {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        LinkedList<String> results = new LinkedList<String>();
        HashSet<String> resultSet = new HashSet<String>();
        //HashSet<StringPair> visitedSet = new HashSet<StringPair>();
        HashMap<PairKey, LinkedList<String>> map = new HashMap<PairKey, LinkedList<String>>();

        for (String str : strs) {
            PairKey pk = new PairKey(str.length(), getLetterVal(str));
            if (!map.containsKey(pk)) {
                map.put(pk, new LinkedList<String>());
            }
            map.get(pk).add(str);
        }

        for (LinkedList<String> list : map.values()) {
            if (list.size() > 1) {

                HashMap<String, Integer> localMap = new HashMap<String, Integer>();
                for (String str : list) {
                    if (!localMap.containsKey(str)) {
                        localMap.put(str, 0);
                    }
                    localMap.put(str, localMap.get(str) + 1);
                }

                String[] array = new String[localMap.size()];
                int k = 0;
                for (Map.Entry<String, Integer> entry : localMap.entrySet()) {
                    if (entry.getValue() > 1) {
                        resultSet.add(entry.getKey());
                        for (int i = 0; i < entry.getValue().intValue(); i++) {
                            results.add(entry.getKey());
                        }
                    }
                    array[k] = entry.getKey();
                    k++;
                }

                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (anagram(array[i], array[j])) {
                            if (array[i].equals(array[j])) {
                                if (!resultSet.contains(array[i])) {
                                    results.add(array[i]);
                                }
                                results.add(array[j]);
                            } else {
                                if (!resultSet.contains(array[i])) {
                                    results.add(array[i]);
                                }

                                if (!resultSet.contains(array[j])) {
                                    results.add(array[j]);
                                }

                            }
                            resultSet.add(array[i]);
                            resultSet.add(array[j]);
                        }
                    }
                }
            }
        }

        //for (String str : resultSet) {
        //    results.add(str);
        //}
        return results;
    }

    public int getLetterVal(String str) {
        int res = 0;
        for (char c : str.toCharArray()) {
            res |= 1 << ((int)c - 97);
        }
        return res;
    }
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

class PairKey {
    private int length;
    private int letters;

    public PairKey(int length, int letters) {
        this.length = length;
        this.letters = letters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PairKey pairKey = (PairKey) o;

        if (length != pairKey.length) return false;
        return letters == pairKey.letters;

    }

    @Override
    public int hashCode() {
        int result = length;
        result = 31 * result + letters;
        return result;
    }
}

class StringPair {
    private String str1;
    private String str2;

    public StringPair(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StringPair that = (StringPair) o;

        if (str1 != null ? !str1.equals(that.str1) : that.str1 != null) return false;
        return !(str2 != null ? !str2.equals(that.str2) : that.str2 != null);

    }

    @Override
    public int hashCode() {
        int result = str1 != null ? str1.hashCode() : 0;
        result = 31 * result + (str2 != null ? str2.hashCode() : 0);
        return result;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
}
