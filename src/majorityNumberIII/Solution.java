package majorityNumberIII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by bohan on 2/21/16.
 */
public class Solution {
    /**
     * @param nums: A list of integers
     * @param k: As described
     * @return: The majority number
     */
    public int majorityNumber(ArrayList<Integer> nums, int k) {
        // write your code

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (Integer integer : nums) {
            if (!map.containsKey(integer)) {
                map.put(integer, 1);
            } else {
                map.put(integer, map.get(integer) + 1);
            }

            if (map.size() >= k) {
                LinkedList<Integer> removeList = new LinkedList<>();
                for (Integer key : map.keySet()) {
                    map.put(key, map.get(key) - 1);
                    if (map.get(key) == 0) {
                        removeList.add(key);
                    }
                }
                for (Integer removeKey : removeList) {
                    map.remove(removeKey);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        int maxNum = -1;
        for (Integer key : map.keySet()) {
            map.put(key, 0);
        }

        for (Integer integer : nums) {
            if (map.containsKey(integer)) {
                map.put(integer, map.get(integer) + 1);
                if (map.get(integer) > max) {
                    max = map.get(integer);
                    maxNum = integer;
                }
            }
        }
        return maxNum;
    }
}

